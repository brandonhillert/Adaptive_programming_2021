package ObjectOrientedProgamming;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class VoetbalCompetitie implements Wedstrijd {

    private String naam;

    private List<String> teamList = new ArrayList<>();

    public VoetbalCompetitie(String naam, int niveau) {
        this.naam = naam;
    }

    public VoetbalCompetitie() {
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }


    public List<String> getTeamList() {
        return teamList;
    }

    public void setTeamList(List<String> teamList) {
        this.teamList = teamList;
    }



    public void addTeams(Team team){

        if(teamList.size() < 20 ){
            this.teamList.add(team.getNaam());
            System.out.println(team.getNaam() + " is toegevoegd aan de " + this.naam);
        }else{
            System.out.println("The competitie zit vol " + team.getNaam());
        }

    }


    @Override
    public void speelWedstrijd() {
        System.out.println("___________________________________________________________________");
        System.out.println("\nVandaag spelen de volgende teams tegen elkaar:");


        Collections.shuffle(teamList);
        teamList.subList(0, teamList.size());

        for (int i = 0; i < (teamList.size()-1); i= i + 2) {

            System.out.println(teamList.get(i) + " - " + teamList.get(i + 1));
        }
        System.out.println("___________________________________________________________________");

        }

    @Override
    public String toString() {
        return "In de "+ naam + " spelen de volgende teams de strijd om de titel:" + teamList ;
    }
}

