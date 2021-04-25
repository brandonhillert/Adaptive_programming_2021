package ObjectOrientedProgamming;

public class Trainer {

    private String voornaam;
    private String achternaam;


    public Trainer(String voornaam, String achternaam) {
        this.voornaam = voornaam;
        this.achternaam = achternaam;
    }

    public Trainer() {
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }


    @Override
    public String toString() {
        return "Trainer: " + voornaam +" "+  achternaam;
    }
}
