package ObjectOrientedProgamming;
import java.util.ArrayList;
import java.util.List;

public class Voetbalclub {

    private String naam;
    private String afkorting;
    private String locatie;
    private List<String> teamList = new ArrayList<>();


    public Voetbalclub(String naam, String afkorting, String locatie) {
        this.naam = naam;
        this.afkorting = afkorting;
        this.locatie = locatie;

    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }


    public String getAfkorting() {
        return afkorting;
    }

    public void setAfkorting(String afkorting) {
        this.afkorting = afkorting;
    }

    public String getLocatie() {
        return locatie;
    }

    public void setLocatie(String locatie) {
        this.locatie = locatie;
    }


    public void addTeams(Team team){
        this.teamList.add(team.getNaam());
    }


    @Override
    public String toString() {
        return "Voetbalclub "+ naam + ", ook wel: " + afkorting + " uit " + locatie + " bestaat uit de volgende teams:" + teamList;
    }
}

