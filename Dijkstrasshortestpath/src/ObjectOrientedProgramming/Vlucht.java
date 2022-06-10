package ObjectOrientedProgramming;

public class Vlucht extends Stap {
    public int euro;

    public Vlucht(Node node, int euro) {
        this.eind = node;
        this.euro = euro;
    }

    public int getValue() {
        return euro;
    }

    public String toString() {
        return "afstand km: " + euro;
    }
}
