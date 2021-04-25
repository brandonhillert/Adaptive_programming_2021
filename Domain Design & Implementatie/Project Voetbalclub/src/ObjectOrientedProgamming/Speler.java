package ObjectOrientedProgamming;

public class Speler {

    private String voornaam;
    private String achternaam;
    private int rugnummer;


    public Speler(String voornaam, String achternaam, int rugnummer) {
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.rugnummer = rugnummer;
    }


    public String getVoornaam() {
        return voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public int getRugnummer() {
        return rugnummer;
    }



    @Override
    public String toString() {
        return " Speler: " + voornaam + " " + achternaam + "= nr."+ rugnummer + "\n";
    }
}
