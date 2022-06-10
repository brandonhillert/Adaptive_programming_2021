package ObjectOrientedProgramming;

public class Rit extends Stap {
    public int aantalKilometers;

    public Rit(Node node, int aantalKilometers) {
        this.aantalKilometers = aantalKilometers;
        this.eind = node;
    }

    public int getValue() {
        return aantalKilometers;
    }

    public String toString() {
        return "Afstand km: " + aantalKilometers;
    }
}