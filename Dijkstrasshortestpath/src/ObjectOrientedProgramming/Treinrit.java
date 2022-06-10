package ObjectOrientedProgramming;

public class Treinrit extends Stap {
    public int Min;

    public Treinrit(Node node, int aantalMinuten) {
        this.Min = aantalMinuten;
        this.eind = node;
    }

    public int getValue() {
        return Min;
    }

    public String toString() {
        return "Tijd in Minuten: " + Min;
    }
}
