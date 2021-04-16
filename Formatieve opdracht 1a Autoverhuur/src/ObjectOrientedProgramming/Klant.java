package ObjectOrientedProgramming;

public class Klant {

    private String naam;
    private double kortingsPercentage;


    public Klant(String naam) {
        this.naam = naam;
    }

    public void setKorting(double kortingsPercentage) {
        this.kortingsPercentage = kortingsPercentage;
    }


    public double getKorting() {
        return kortingsPercentage;
    }


    @Override
    public String toString() {

        return "op naam van: "+ naam + "korting: " + kortingsPercentage + "%)";
    }



}
