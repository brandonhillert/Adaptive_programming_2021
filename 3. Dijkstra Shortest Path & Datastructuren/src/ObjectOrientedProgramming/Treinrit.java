package ObjectOrientedProgramming;

public class Treinrit extends Stap {
    public int Min;

    public Treinrit(Node cls, int aantalMinuten) {
        this.Min = aantalMinuten;
        this.eind = cls;
    }

    public int getValue() {
        return Min;
    }

    public void setMin(int min) {
        Min = min;
    }

    public String toString() {
        return "Tijd in minuten: " + Min;
    }
}