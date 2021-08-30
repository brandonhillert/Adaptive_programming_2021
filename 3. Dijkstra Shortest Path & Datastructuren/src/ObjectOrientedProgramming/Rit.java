package ObjectOrientedProgramming;

public class Rit extends Stap {
    public int aantalKilometers;

    public Rit(Node cls, int aantalKilometers) {
        this.aantalKilometers = aantalKilometers;
        this.eind = cls;
    }

    public int getValue() {
        return aantalKilometers;
    }

    public void setAantalKilometers(int aantalKilometers) {
        this.aantalKilometers = aantalKilometers;
    }

    public String toString() {
        return "Afstand in KM: " + aantalKilometers;
    }
}