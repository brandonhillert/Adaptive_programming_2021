package ObjectOrientedProgramming;

public class Auto {

    private String type;
    private double prijsPerDag;


    public Auto(String type, double prijsPerDag) {
        this.type = type;
        this.prijsPerDag = prijsPerDag;
    }

    public void setPrijsPerDag(double prijsPerDag) {
        this.prijsPerDag = prijsPerDag;
    }

    public double getPrijsPerDag() {
        return prijsPerDag;
    }


    @Override
    public String toString() {
        return "autotype: "+ type + " met als prijs per dag: "+ prijsPerDag;
    }
}
