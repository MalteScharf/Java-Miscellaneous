package HA02;

public class WochentagBerechner {
    /**
     * es wird der Wochentag zu einem gueltigen Datum bestimmt
     *
     * @param tag der Tag (0 < tag <= 31)
     * @param monat der Monat (0 < monat <= 12)
     * @param jahr die vierstellige Jahreszahl (z. B. 2009)
     */
    public void berechneWochentag(int tag, int monat, int jahr) {

        // Januar und Februar Tranformieren:
        if (monat == 01 || monat == 02){
            monat += 12;
            jahr -=1;
        }

        // century bestimmen:
        int Jahrhundert = jahr /100;

        // letzten beiden Ziffern des Jahres:
        int jahrZiffern = jahr - Jahrhundert *100;



        int wochentag = (tag + (26 * (monat + 1))/10 + (5 * jahrZiffern)/4 + Jahrhundert /4 + 5 * Jahrhundert - 1) % 7;

        switch (wochentag){
            case 0: {
                System.out.println("Sonntag");
                break;
            }
            case 1: {
                System.out.println("Montag");
                break;
            }
            case 2: {
                System.out.println("Dienstag");
                break;

            }
            case 3: {
                System.out.println("Mittwoch");
                break;

            }
            case 4: {
                System.out.println("Donnerstag");
                break;

            }
            case 5: {
                System.out.println("Freitag");
                break;

            }
            case 6: {
                System.out.println("Samstag");
                break;

            }
        }

    }

    }
