package SortingAlgos;

class Kunde {
    // Attribute
    String name;
    String anschrift;

    Kunde(String neuerName, String neueAnschrift) {
        this.name = neuerName;
        this.anschrift = neueAnschrift;
    }

    // Methoden
    void legeNameFest(final String neuerName) {
        this.name = neuerName;
    }
    void legeAnschriftFest(final String neueAnschrift) {
        this.anschrift = neueAnschrift;
    }
    String liefereName() {
        return name;
    }
    String liefereAnschrift() {
        return anschrift;
    }
}
