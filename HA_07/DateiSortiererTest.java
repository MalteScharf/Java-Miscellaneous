package HA_07;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import junit.framework.TestCase;

public class DateiSortiererTest extends TestCase {

    public void testeDateiNichtGefundenAusnahme() {
        String name = "NAME";
        DateiNichtGefundenAusnahme dnga = new DateiNichtGefundenAusnahme(name);
        assertTrue("DateiNichtGefundenAusnahme ist keine Unterklasse von Exception", Exception.class.isInstance(dnga));
        assertEquals(name, dnga.liefereDateinamen());
        assertEquals("Datei wurde nicht gefunden.", dnga.getMessage());
    }

    public void testeEinlesen() {
        DateiSortierer ds = new DateiSortierer();
        String name = "test.txt";
        List<String> l;
        try {
            l = ds.einlesen(name);
        } catch (DateiNichtGefundenAusnahme e) {
            fail("Datei wurde nicht gefunden obwohl vorhanden.");
            return;
        } catch (IOException e) {
            fail("Unbekannter Fehler beim Einlesen");
            return;
        }
        assertEquals("Die Groesse der Liste entspricht nicht der Zeilenanzahl der Datei", 6, l.size());
        String[] test = {"asfas", "aws", "jzrfjc", "dfhfds", "asfewfg", "wertgwertw"};
        for (int i = 0; i < l.size(); i++) {
            assertEquals("Die " + i + ". Zeile stimmt nicht ueberein.", test[i], l.get(i));
        }
    }

    public void testeEinlesenAusnahme() {
        DateiSortierer ds = new DateiSortierer();
        String name = "foo.txt";
        try {
            ds.einlesen(name);
            fail("Einlesen sollte Ausnahme erzeugen, wenn Datei nicht vorhanden ist.");
        } catch (DateiNichtGefundenAusnahme e) {
            assertEquals(name, e.liefereDateinamen());
            assertEquals("Datei wurde nicht gefunden.", e.getMessage());
        } catch (IOException e) {
            fail("Falscher Ausnahmentyp bei nicht vorhandener Datei.");
        }
    }

    public void testeSortieren() {
        DateiSortierer ds = new DateiSortierer();
        StringListe leer = new StringListe();
        assertEquals("Ergebnis bei leerer Liste ist nicht die leere Liste.", 0, ds.sortiere(leer).size());
        String[] test = {"asfas", "aws", "jzrfjc", "dfhfds", "asfewfg", "wertgwertw"};
        StringListe l = new StringListe();
        l.addAll(Arrays.asList(test));
        StringListe sorted = ds.sortiere(l);
        assertEquals("Laenge der sortierten Liste stimmt nicht mit uebergebener ueberein.", test.length, sorted.size());
        for (int i = 0; i < sorted.size() - 1; i++) {
            assertTrue("Die Liste ist nicht aufsteigend sortiert, " + sorted.get(i) + " ist nicht kleiner als " + sorted.get(i + 1) + " (Index: " + i + " und " + (i + 1) + ")", sorted.get(i).compareTo(sorted.get(i + 1)) <= 0);
        }
        for (String s : test) {
            assertTrue("Die sortierte Liste enthaelt nicht alle uebergebenen Zeichenketten.", sorted.contains(s));
        }
    }

    public void testeSortierenAusnahme() {
        DateiSortierer ds = new DateiSortierer();
        try {
            ds.sortiere(null);
            fail("Bei null als Argument soll eine Ausnahme erzeugt werden.");
        } catch (IllegalArgumentException e) {
            assertEquals("Die Fehlermeldung der Ausnahme ist nicht die erwartete.", "null ist ein ungueltiges Argument.", e.getMessage());
        }
    }

    public void testeGebeAus() {
        DateiSortierer ds = new DateiSortierer();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        String[] test = {"asfas", "aws", "jzrfjc", "dfhfds", "asfewfg", "wertgwertw"};
        StringListe l = new StringListe();
        l.addAll(Arrays.asList(test));
        ds.gebeAus(baos, l);
        String result = "";
        for (int i = 0; i < test.length; i++) {
            result += test[i] + System.getProperty("line.separator");
        }
        assertEquals(result , baos.toString());
    }

    public void testeSortiereDatei() {
        PrintStream old = System.out;
        try {
            DateiSortierer ds = new DateiSortierer();
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            System.setOut(new PrintStream(baos));
            ds.sortiereDatei("test2.txt");
            String[] test = {"hahaha", "licht", "haus", "hallo", "blume", "nacht", "huhu", "wald", "himmel", "sonne", "erde", "luft", "wasser"};
            Arrays.sort(test);
            String result = "";
            for (int i = 0; i < test.length; i++) {
                result += test[i] + System.getProperty("line.separator");
            }
            assertEquals("Die Ausgabe stimmt nicht.", result , baos.toString());
        }
        finally {
            System.setOut(old);
        }
    }

    public void testeSortiereDateiDateiNichtGefundenAusnahme() {
        PrintStream old = System.err;
        try {
            DateiSortierer ds = new DateiSortierer();
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            System.setErr(new PrintStream(baos));
            ds.sortiereDatei("foo.txt");
            assertEquals("Die Fehlermeldung bei nicht vorhandener Datei ist fehlerhaft.", "Die Datei foo.txt konnte nicht gefunden werden." , baos.toString().trim());
        } finally {
            System.setErr(old);
        }
    }

    public void testeSortiereDateiIOAusnahme() {
        PrintStream old = System.err;
        try {
            DateiSortierer ds = new MyDateiSortierer();
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            System.setErr(new PrintStream(baos));
            ds.sortiereDatei("test.txt");
            assertEquals("Die Fehlermeldung bei einer IOException ist nicht die der Ausnahme.", "TEST" , baos.toString().trim());
            ds = new MyDateiSortierer2();
            baos = new ByteArrayOutputStream();
            System.setErr(new PrintStream(baos));
            ds.sortiereDatei("test.txt");
            assertEquals("Die Fehlermeldung bei einer IOException ist nicht die der Ausnahme.", "TESTTESTTEST" , baos.toString().trim());
        } finally {
            System.setErr(old);
        }
    }
}

class MyDateiSortierer extends DateiSortierer {

    public StringListe einlesen(String dateiname) throws DateiNichtGefundenAusnahme, IOException {
        throw new IOException("TEST");
    }
}

class MyDateiSortierer2 extends DateiSortierer {

    public StringListe einlesen(String dateiname) throws DateiNichtGefundenAusnahme, IOException {
        throw new IOException("TESTTESTTEST");
    }
}
