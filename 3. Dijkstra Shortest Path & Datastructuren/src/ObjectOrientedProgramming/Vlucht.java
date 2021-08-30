package ObjectOrientedProgramming;

public class Vlucht extends Stap {
    public int aantalEuro;

    public Vlucht(Node cls, int aantalEuro) {
        this.eind = cls;
        this.aantalEuro = aantalEuro;
    }

    public int getValue() {
        return aantalEuro;
    }

    public void setAantalEuro(int aantalEuro) {
        this.aantalEuro = aantalEuro;
    }

    public String toString() {
        return "afstand km: " + aantalEuro;
    }
}