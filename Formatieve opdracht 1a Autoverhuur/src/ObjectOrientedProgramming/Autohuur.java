package ObjectOrientedProgramming;

public class Autohuur{

    private int aantalDagen;
    public Auto gehuurdeAuto;
    public Klant huurder;



    //Constructor
    public Autohuur() {
    }

    //Setter Aantal dagen
    public void setAantalDagen(int aantalDagen) {
        this.aantalDagen = aantalDagen;
    }



    //Setter gehuurde auto
    public void setGehuurdeAuto(Auto gehuurdeAuto) {
        this.gehuurdeAuto = gehuurdeAuto;
    }

    //Getter gehuurde Auto
    public Auto getGehuurdeAuto() {
        return gehuurdeAuto;
    }


    // Setter huurder

    public void setHuurder(Klant huurder) {
        this.huurder = huurder;
    }

    //Getter huurder
    public Klant getHuurder() {
        return huurder;
    }


    public double totaalPrijs() {
        return aantalDagen * gehuurdeAuto.getPrijsPerDag();
    }



    @Override
    public String toString() {
        return "\n Auto=" + gehuurdeAuto + "\n Huurder= " + huurder + "\n" + " Aantal dagenen "+  aantalDagen + " dat kost"  ;

    }
}
