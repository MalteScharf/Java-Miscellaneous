package BinaryNodes;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;


import junit.framework.TestCase;


public class BaumTest extends TestCase {

    public void testeKnotenInterface() {
        Class<?> knoten;
        try {
            knoten = Class.forName("Knoten");
        } catch (ClassNotFoundException e) {
            fail("Das Interface Knoten konnte nicht gefunden werden.");
            return;
        }
        Method[] m = knoten.getDeclaredMethods();
        assertEquals("Es gibt nicht genau 2 Methoden.", 2, m.length);
        try {
            knoten.getDeclaredMethod("werteAus", new Class[0]);
        } catch (SecurityException e) {
            e.printStackTrace();
            fail();
        } catch (NoSuchMethodException e) {
            fail("Die Methode werteAus konnte nicht gefunden werden.");
        }

        try {
            knoten.getDeclaredMethod("toString", new Class[0]);
        } catch (SecurityException e) {
            e.printStackTrace();
            fail();
        } catch (NoSuchMethodException e) {
            fail("Die Methode toString konnte nicht gefunden werden.");
        }
    }

    public void testeIntKnoten() {
        Class<?> intKnoten;
        try {
            intKnoten = Class.forName("IntKnoten");
        } catch (ClassNotFoundException e) {
            fail("Die Klasse IntKnoten konnte nicht gefunden werden.");
            return;
        }
        Class<?>[] interfaces = intKnoten.getInterfaces();
        assertEquals("Die Klasse implementiert nicht genau ein Interface", 1, interfaces.length);
        assertEquals("Das implementierte Interface heisst nicht Knoten", "Knoten", interfaces[0].getName());

        try {
            intKnoten.getDeclaredMethod("werteAus", new Class[0]);
        } catch (SecurityException e) {
            e.printStackTrace();
            fail();
        } catch (NoSuchMethodException e) {
            fail("Die Methode werteAus konnte nicht gefunden werden.");
        }

        try {
            intKnoten.getDeclaredMethod("toString", new Class[0]);
        } catch (SecurityException e) {
            e.printStackTrace();
            fail();
        } catch (NoSuchMethodException e) {
            fail("Die Methode werteAus konnte nicht gefunden werden.");
        }

        try {
            intKnoten.getDeclaredConstructor(new Class[]{int.class});
        } catch (NoSuchMethodException e){
            fail("Der Konstruktor mit einem int-Parameter konnte nicht gefunden werden.");
        }
    }

    public void testeBinaerOperatorKnoten() {
        Class<?> binaerOp;
        try {
            binaerOp = Class.forName("BinaerOperatorKnoten");
        } catch (ClassNotFoundException e) {
            fail("Die Klasse BinaerOperatorKnoten konnte nicht gefunden werden.");
            return;
        }
        assertTrue("Die Klasse ist nicht abstrakt.", Modifier.isAbstract(binaerOp.getModifiers()));
        Class<?>[] interfaces = binaerOp.getInterfaces();
        assertEquals("Die Klasse implementiert nicht genau ein Interface", 1, interfaces.length);
        assertEquals("Das implementierte Interface heisst nicht Knoten", "Knoten", interfaces[0].getName());

        try {
            binaerOp.getDeclaredMethod("liefereErstenOperand", new Class[0]);
        } catch (SecurityException e) {
            e.printStackTrace();
            fail();
        } catch (NoSuchMethodException e) {
            fail("Die Methode liefereErstenOperand konnte nicht gefunden werden.");
        }

        try {
            binaerOp.getDeclaredMethod("liefereZweitenOperand", new Class[0]);
        } catch (SecurityException e) {
            e.printStackTrace();
            fail();
        } catch (NoSuchMethodException e) {
            fail("Die Methode liefereZweitenOperand konnte nicht gefunden werden.");
        }

        try {
            binaerOp.getDeclaredConstructor(new Class[]{Knoten.class, Knoten.class});
        } catch (NoSuchMethodException e){
            fail("Der Konstruktor mit zwei Knoten-Parameter konnte nicht gefunden werden.");
        }
    }

    public void testeOperatorKnoten() {
        String[] namen = {"AddKnoten", "SubKnoten", "MultKnoten", "DivKnoten"};
        for (String n : namen) {
            Class<?> opKnoten;
            try {
                opKnoten = Class.forName(n);
            } catch (ClassNotFoundException e) {
                fail("Die Klasse " + n + " konnte nicht gefunden werden.");
                return;
            }
            assertEquals("Die Klasse " + n + " ist keine direkte Unterklasse von BinaerOperatorKnoten.", BinaerOperatorKnoten.class, opKnoten.getSuperclass());

            try {
                opKnoten.getDeclaredConstructor(new Class[]{Knoten.class, Knoten.class});
            } catch (NoSuchMethodException e){
                fail("Der Konstruktor mit zwei Knoten-Parameter konnte in Klasse " + n + " nicht gefunden werden.");
            }
        }
    }

    public void testeBaum() {
        Class<?> baum;
        try {
            baum = Class.forName("Baum");
        } catch (ClassNotFoundException e) {
            fail("Die Klasse Baum konnte nicht gefunden werden.");
            return;
        }

        try {
            baum.getDeclaredMethod("werteAus", new Class[0]);
        } catch (SecurityException e) {
            e.printStackTrace();
            fail();
        } catch (NoSuchMethodException e) {
            fail("Die Methode werteAus konnte nicht gefunden werden.");
        }

        try {
            baum.getDeclaredMethod("toString", new Class[0]);
        } catch (SecurityException e) {
            e.printStackTrace();
            fail();
        } catch (NoSuchMethodException e) {
            fail("Die Methode werteAus konnte nicht gefunden werden.");
        }

        try {
            baum.getDeclaredMethod("liefereWurzel", new Class[0]);
        } catch (SecurityException e) {
            e.printStackTrace();
            fail();
        } catch (NoSuchMethodException e) {
            fail("Die Methode liefereWurzel konnte nicht gefunden werden.");
        }

        try {
            Method m = baum.getDeclaredMethod("erzeugeBeispielBaum", new Class[]{int.class, int.class, int.class, int.class, int.class});
            assertTrue("Die Methode erzeugeBeispielBaum ist nicht als static deklariert.", Modifier.isStatic(m.getModifiers()));
        } catch (SecurityException e) {
            e.printStackTrace();
            fail();
        } catch (NoSuchMethodException e) {
            fail("Die Methode erzeugeBeispielBaum mit 5 int-Parametern konnte nicht gefunden werden.");
        }

        try {
            baum.getDeclaredConstructor(new Class[]{Knoten.class});
        } catch (SecurityException e) {
            e.printStackTrace();
            fail();
        } catch (NoSuchMethodException e) {
            fail("Der Konstruktor mit einem Knoten-Parameter konnte nicht gefunden werden.");
        }
    }

    public void testeWerteAus() {
        for (int i = 0; i < 100; i++) {
            IntKnoten j = new IntKnoten(i);
            assertEquals("werteAus() bei IntKnoten fehlerhaft", i, j.werteAus());
        }
        IntKnoten t1 = new IntKnoten(15);
        IntKnoten t2 = new IntKnoten(5);
        AddKnoten add = new AddKnoten(t1, t2);
        assertEquals("werteAus() bei AddKnoten fehlerhaft", 20, add.werteAus());
        SubKnoten sub = new SubKnoten(t1, t2);
        assertEquals("werteAus() bei SubKnoten fehlerhaft", 10, sub.werteAus());
        MultKnoten mult = new MultKnoten(t1, t2);
        assertEquals("werteAus() bei MultKnoten fehlerhaft", 75, mult.werteAus());
        DivKnoten div = new DivKnoten(t1, t2);
        assertEquals("werteAus() bei DivKnoten fehlerhaft", 3, div.werteAus());
        Knoten k = new SubKnoten(new DivKnoten(new AddKnoten(add, sub), div), mult);
        assertEquals("Ergebnis des folgendes Ausdrucks fehlerhaft: ((((15 + 5) + (15 - 5)) / (15 / 5)) - (15 * 5))", -65, k.werteAus());
    }

    public void testeWerteAusAusnahmen() {
        IntKnoten t1 = new IntKnoten(15);
        IntKnoten t2 = new IntKnoten(0);
        DivKnoten div = new DivKnoten(t1, t2);
        try {
            div.werteAus();
            fail("Hier hÃ¤tte eine Ausnahme auftreten sollen, da durch 0 dividiert wird.");
        } catch (ArithmeticException e) {
            assertEquals("Die Ausnahme enhaelt nicht dei gewuenschte Fehlermeldung", "Division durch 0!", e.getMessage());
        }

    }

    public void testeToString() {
        for (int i = 0; i < 100; i++) {
            IntKnoten j = new IntKnoten(i);
            assertEquals("toString() bei IntKnoten fehlerhaft", "" + i, j.toString());
        }
        IntKnoten t1 = new IntKnoten(15);
        IntKnoten t2 = new IntKnoten(5);
        AddKnoten add = new AddKnoten(t1, t2);
        assertEquals("toString() bei AddKnoten fehlerhaft", "(15 + 5)", add.toString());
        SubKnoten sub = new SubKnoten(t1, t2);
        assertEquals("toString() bei SubKnoten fehlerhaft", "(15 - 5)", sub.toString());
        MultKnoten mult = new MultKnoten(t1, t2);
        assertEquals("toString() bei MultKnoten fehlerhaft", "(15 * 5)", mult.toString());
        DivKnoten div = new DivKnoten(t1, t2);
        assertEquals("toString() bei DivKnoten fehlerhaft", "(15 / 5)", div.toString());
        Knoten k = new SubKnoten(new DivKnoten(new AddKnoten(add, sub), div), mult);
        assertEquals("toString() liefert bei folgendem Ausdruck nicht das gewÃ¼nschte Ergebnis: ((((15 + 5) + (15 - 5)) / (15 / 5)) - (15 * 5))", "((((15 + 5) + (15 - 5)) / (15 / 5)) - (15 * 5))", k.toString());
    }

    public void testeOperatorKonstruktorAusnahmen() {
        try {
            new AddKnoten(null, null);
            fail("Konstruktor von AddKnoten haette IllegalArgumentException erzeugen sollen.");
        } catch (IllegalArgumentException e) {
        }
        try {
            new SubKnoten(null, null);
            fail("Konstruktor von SubKnoten haette IllegalArgumentException erzeugen sollen.");
        } catch (IllegalArgumentException e) {
        }
        try {
            new MultKnoten(null, null);
            fail("Konstruktor von MultKnoten haette IllegalArgumentException erzeugen sollen.");
        } catch (IllegalArgumentException e) {
        }
        try {
            new DivKnoten(null, null);
            fail("Konstruktor von DivKnoten haette IllegalArgumentException erzeugen sollen.");
        } catch (IllegalArgumentException e) {
        }
        try {
            new AddKnoten(new IntKnoten(2), null);
            fail("Konstruktor von AddKnoten haette IllegalArgumentException erzeugen sollen.");
        } catch (IllegalArgumentException e) {
        }
        try {
            new SubKnoten(new IntKnoten(2), null);
            fail("Konstruktor von SubKnoten haette IllegalArgumentException erzeugen sollen.");
        } catch (IllegalArgumentException e) {
        }
        try {
            new MultKnoten(new IntKnoten(2), null);
            fail("Konstruktor von MultKnoten haette IllegalArgumentException erzeugen sollen.");
        } catch (IllegalArgumentException e) {
        }
        try {
            new DivKnoten(new IntKnoten(2), null);
            fail("Konstruktor von DivKnoten haette IllegalArgumentException erzeugen sollen.");
        } catch (IllegalArgumentException e) {
        }

        try {
            new AddKnoten(null, new IntKnoten(-10));
            fail("Konstruktor von AddKnoten haette IllegalArgumentException erzeugen sollen.");
        } catch (IllegalArgumentException e) {
        }
        try {
            new SubKnoten(null, new IntKnoten(-10));
            fail("Konstruktor von SubKnoten haette IllegalArgumentException erzeugen sollen.");
        } catch (IllegalArgumentException e) {
        }
        try {
            new MultKnoten(null, new IntKnoten(-10));
            fail("Konstruktor von MultKnoten haette IllegalArgumentException erzeugen sollen.");
        } catch (IllegalArgumentException e) {
        }
        try {
            new DivKnoten(null, new IntKnoten(-10));
            fail("Konstruktor von DivKnoten haette IllegalArgumentException erzeugen sollen.");
        } catch (IllegalArgumentException e) {
        }
    }

    public void testeBaumKonstruktor() {
        IntKnoten i = new IntKnoten(100);
        Baum b = new Baum(i);
        assertEquals("Wurzel ist nach Konstruktoraufruf inkorrekt.", i, b.liefereWurzel());
    }

    public void testeBaumWerteAus() {
        for (int i = 0; i < 100; i++) {
            IntKnoten j = new IntKnoten(i);
            Baum b = new Baum(j);
            assertEquals("werteAus() bei Baum mit nur einem IntKnoten fehlerhaft", i, b.werteAus());
        }
        IntKnoten t1 = new IntKnoten(15);
        IntKnoten t2 = new IntKnoten(5);
        AddKnoten add = new AddKnoten(t1, t2);
        Baum b = new Baum(add);
        assertEquals("werteAus() bei Baum fehlerhaft", 20, b.werteAus());
        SubKnoten sub = new SubKnoten(t1, t2);
        b = new Baum(sub);
        assertEquals("werteAus() bei Baum fehlerhaft", 10, b.werteAus());
        MultKnoten mult = new MultKnoten(t1, t2);
        b = new Baum(mult);
        assertEquals("werteAus() bei Baum fehlerhaft", 75, b.werteAus());
        DivKnoten div = new DivKnoten(t1, t2);
        b = new Baum(div);
        assertEquals("werteAus() bei Baum fehlerhaft", 3, b.werteAus());
        Knoten k = new SubKnoten(new DivKnoten(new AddKnoten(add, sub), div), mult);
        b = new Baum(k);
        assertEquals("Ergebnis des Baumes mit folgendem Ausdrucks fehlerhaft: ((((15 + 5) + (15 - 5)) / (15 / 5)) - (15 * 5))", -65, b.werteAus());
    }

    public void testeBaumWerteAusAusnahmen() {
        IntKnoten t1 = new IntKnoten(15);
        IntKnoten t2 = new IntKnoten(0);
        DivKnoten div = new DivKnoten(t1, t2);
        Baum b = new Baum(div);
        try {
            b.werteAus();
            fail("Hier hÃ¤tte eine Ausnahme auftreten sollen, da durch 0 dividiert wird.");
        } catch (ArithmeticException e) {
            assertEquals("Die Ausnahme enhaelt nicht die gewuenschte Fehlermeldung", "Division durch 0!", e.getMessage());
        }

    }

    public void testeBaumToString() {
        for (int i = 0; i < 100; i++) {
            IntKnoten j = new IntKnoten(i);
            Baum b = new Baum(j);
            assertEquals("toString() bei Baum mit nur einem IntKnoten fehlerhaft", "" + i, b.toString());
        }
        IntKnoten t1 = new IntKnoten(15);
        IntKnoten t2 = new IntKnoten(5);
        AddKnoten add = new AddKnoten(t1, t2);
        Baum b = new Baum(add);
        assertEquals("toString() bei AddKnoten fehlerhaft", "(15 + 5)", b.toString());
        SubKnoten sub = new SubKnoten(t1, t2);
        b = new Baum(sub);
        assertEquals("toString() bei SubKnoten fehlerhaft", "(15 - 5)", b.toString());
        MultKnoten mult = new MultKnoten(t1, t2);
        b = new Baum(mult);
        assertEquals("toString() bei MultKnoten fehlerhaft", "(15 * 5)", b.toString());
        DivKnoten div = new DivKnoten(t1, t2);
        b = new Baum(div);
        assertEquals("toString() bei DivKnoten fehlerhaft", "(15 / 5)", b.toString());
        Knoten k = new SubKnoten(new DivKnoten(new AddKnoten(add, sub), div), mult);
        b = new Baum(k);
        assertEquals("toString() liefert bei Baum mit folgendem Ausdruck nicht das gewÃ¼nschte Ergebnis: ((((15 + 5) + (15 - 5)) / (15 / 5)) - (15 * 5))", "((((15 + 5) + (15 - 5)) / (15 / 5)) - (15 * 5))", b.toString());
    }

    public void testeBeispielBaum() {
        Baum b = Baum.erzeugeBeispielBaum(2, 4, 20, 5, 10);
        assertEquals("Ergebnis bei Beispielbaum fehlerhaft.", 4, b.werteAus());
        assertEquals("toString bei Beispielbaum fehlerhaft.", "((2 * 4) + (20 / (5 - 10)))", b.toString());
        assertTrue("Die Wurzel des Beispielbaums ist kein AddKnoten", b.liefereWurzel() instanceof AddKnoten);
        assertTrue("Die Struktur des Beispielbaums ist fehlerhaft", ((BinaerOperatorKnoten) b.liefereWurzel()).liefereErstenOperand() instanceof MultKnoten);
        assertTrue("Die Struktur des Beispielbaums ist fehlerhaft", ((BinaerOperatorKnoten) b.liefereWurzel()).liefereZweitenOperand() instanceof DivKnoten);
        assertTrue("Die Struktur des Beispielbaums ist fehlerhaft", ((BinaerOperatorKnoten) ((BinaerOperatorKnoten) b.liefereWurzel()).liefereErstenOperand()).liefereErstenOperand() instanceof IntKnoten);
        assertEquals(2, ((BinaerOperatorKnoten) ((BinaerOperatorKnoten) b.liefereWurzel()).liefereErstenOperand()).liefereErstenOperand().werteAus());
        assertTrue("Die Struktur des Beispielbaums ist fehlerhaft", ((BinaerOperatorKnoten) ((BinaerOperatorKnoten) b.liefereWurzel()).liefereErstenOperand()).liefereZweitenOperand() instanceof IntKnoten);
        assertEquals(4, ((BinaerOperatorKnoten) ((BinaerOperatorKnoten) b.liefereWurzel()).liefereErstenOperand()).liefereZweitenOperand().werteAus());
        assertTrue("Die Struktur des Beispielbaums ist fehlerhaft", ((BinaerOperatorKnoten) ((BinaerOperatorKnoten) b.liefereWurzel()).liefereZweitenOperand()).liefereErstenOperand() instanceof IntKnoten);
        assertEquals(20, ((BinaerOperatorKnoten) ((BinaerOperatorKnoten) b.liefereWurzel()).liefereZweitenOperand()).liefereErstenOperand().werteAus());
        assertTrue("Die Struktur des Beispielbaums ist fehlerhaft", ((BinaerOperatorKnoten) ((BinaerOperatorKnoten) b.liefereWurzel()).liefereZweitenOperand()).liefereZweitenOperand() instanceof SubKnoten);
        assertTrue("Die Struktur des Beispielbaums ist fehlerhaft", ((BinaerOperatorKnoten) ((BinaerOperatorKnoten) ((BinaerOperatorKnoten) b.liefereWurzel()).liefereZweitenOperand()).liefereZweitenOperand()).liefereErstenOperand() instanceof IntKnoten);
        assertEquals(5, ((BinaerOperatorKnoten) ((BinaerOperatorKnoten) ((BinaerOperatorKnoten) b.liefereWurzel()).liefereZweitenOperand()).liefereZweitenOperand()).liefereErstenOperand().werteAus());
        assertTrue("Die Struktur des Beispielbaums ist fehlerhaft", ((BinaerOperatorKnoten) ((BinaerOperatorKnoten) ((BinaerOperatorKnoten) b.liefereWurzel()).liefereZweitenOperand()).liefereZweitenOperand()).liefereZweitenOperand() instanceof IntKnoten);
        assertEquals(10, ((BinaerOperatorKnoten) ((BinaerOperatorKnoten) ((BinaerOperatorKnoten) b.liefereWurzel()).liefereZweitenOperand()).liefereZweitenOperand()).liefereZweitenOperand().werteAus());
    }

}
