package Klausi;

public class Aufg3 {


    /***
     * Entfernt die Vokale aus dem String aus der Aufgabenstellung
     */
    public static String vokaleEntfernen(String input){

        // String Builder mit Kapazität wie Länge des Inputstring initialsieren
        StringBuilder sb = new StringBuilder(input.length());
        // Liste mit Vokalen:
        char[] vokale = {'a','e','i','o','u','A','E','I','O','U'};

        // Jeden Char im Input String druchgehen
        for (int i =0; i<input.length();i++){
            // aktuellen Char initialisieren
            char c = input.charAt(i);
            // boolean der aussagt ob Vokal ist mit false initialiseren:
            boolean istVokal = false;
            // Liste Vokale durchiterieren
            for(char vokal:vokale){
                // wenn Char Vokal ist, dann istVokal = false setzen und aus Schleife springen
                if(c == vokal){
                    istVokal = true;
                    break;
                }
            }
            // wenn kein Vokal, dann char an den String anhängen
            if (istVokal == false) sb.append(c);
        }
        return sb.toString();
    }


    public static void main(String[] args){
        String test = "Eine zentrale Fragestellung in der Entwicklung von Software-Systemen ist im Regelfall die Korrektheit des Systems. Bei sicherheitskritischen Systemen, beispielsweise der Steuersoftware einer Rakete oder eines Atomkraftwerks ist es unbedingt notwendig, dass die Software genau das gewuenschte Verhalten zeigt. Anderenfalls koennen Menschenleben gefaehrdet oder große wirtschaftliche Schaeden hervorgerufen werden. Aber selbst bei Software, die im Fall einer Fehlfunktion nicht unmittelbar zu fatalen Konsequenzen fuehrt, ist die Frage der Korrektheit spaetestens bei der Verguetung der Entwicklungstaetigkeit nicht unerheblich. Um die Korrektheit eines Software-Systems zu ueberpruefen, gibt es zwei grundsaetzliche Ansaetze: Software kann entweder verifiziert oder getestet werden. Ziel der Verifikation ist es, einen absoluten Beweis fuer die Korrektheit zu erbringen, wohingegen beim Testen vor allem das Identifizieren von Fehlern im Vordergrund steht. In diesem Kurs soll das Testen als Technik zur ueberpruefung der Korrektheit eines Software-Systems allerdings nicht in den Fokus gerueckt werden. Testverfahren werden ausfuehrlich in den Veranstaltungen des Lehrgebiets Softwaretechnik diskutiert. Stattdessen konzentrieren wir uns im vorliegenden Kurs ausschließlich auf Verifikationstechniken. Idealerweise stellt man sich als Software-Entwickler Verifikation von Software wahrscheinlich ungefaehr wie folgt vor: Gegeben sei ein Software-System, im einfachsten Fall unmittelbar in Form des Quelltextes, sowie eine formale Beschreibung der gewuenschten Eigenschaft des Systems, beispielsweise in Form von Vor- und Nachbedingungen oder in Form eines logischen Ausdrucks. Der Entwickler gibt beide Eingaben in eine bereits vorweg implementierte Blackbox, drueckt einen Knopf mit der Aufschrift 'verifizieren', wartet eine Weile und erhaelt am Ende entweder die Ausgabe 'ja' oder 'nein' - je nachdem ob die Eigenschaft erfuellt ist oder nicht. Exemplarisch sei diese Idealvorstellung in der nachfolgenden Abbildung dargestellt.";
        System.out.println(vokaleEntfernen(test));


    }
}
