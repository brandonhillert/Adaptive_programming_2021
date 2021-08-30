package ObjectOrientedProgamming;

/**
 * @author Brandon Hillert
 * datum: 24-4-2020
 * Beschrijving:
 * Dit project bevat de gegevens van een voetbalclub/competitie. Er kunnen spelers en trainers worden toegevoegd
 * aan een team, en een team is onderdeel van een club.
 * Vervolgens kunnen teams tegen elkaar spelen in een competitie, waarbij er een
 * wedstrijd schema wordt gegenereerd voor een speeldag.
 */

public class Main {

    public static void main(String[] args) {
	// write your code here


        Voetbalclub ajax = new Voetbalclub("Ajax", "AFC","Amsterdam");

        Team heren1 = new Team("Ajax heren 1 ");

        Trainer th1 = new Trainer("Frank", "de Boer");

        Speler sp1 = new Speler("Jan","Vertongen", 4);
        Speler sp2 = new Speler("Lasse","Schöne", 7);
        Speler sp3 = new Speler("Viktor","Fischer", 9);
        Speler sp4 = new Speler("Hakim","Ziyech", 10);
        Speler sp5 = new Speler("Jasper","Cillisen", 1);

        heren1.setTrainer(th1);
        heren1.addSpeler(sp1);
        heren1.addSpeler(sp2);
        heren1.addSpeler(sp3);
        heren1.addSpeler(sp4);
        heren1.addSpeler(sp5);

        ajax.addTeams(heren1);



        // Niew team Jongens 1 aangemaakt AJAX
        Trainer tj1 = new Trainer("Marcel", "Reiziger");

        Team jongens1 = new Team("Ajax Jongens 1 ");
        Speler jsp1 = new Speler("Donny","Van de Beek", 7);
        Speler jsp2 = new Speler("Matthijs","De ligt", 4);
        Speler jsp3 = new Speler("Frenkie","De jong", 5);
        Speler jsp4 = new Speler("Sontje","Hansen", 10);
        Speler jsp5 = new Speler("Ryan","Gravenberch", 8);

        jongens1.setTrainer(tj1);
        jongens1.addSpeler(jsp1);
        jongens1.addSpeler(jsp2);
        jongens1.addSpeler(jsp3);
        jongens1.addSpeler(jsp4);
        jongens1.addSpeler(jsp5);

        ajax.addTeams(jongens1);

        System.out.println(ajax);

        System.out.println("\nHieronder wordt het team van heren 1 als voorbeeld afgedrukt:");
        System.out.println(heren1 + "\n");


        System.out.println("\nHieronder wordt het team van heren 1 als voorbeeld afgedrukt:");
        System.out.println(jongens1);


        VoetbalCompetitie eredivisie = new VoetbalCompetitie("Eredivisie",1);

        Team ajax1 = new Team("Ajax heren 1 ");
        Team PSV1 = new Team("PSV1 ");
        Team Feyenoord1 = new Team("Feyenoord1 ");
        Team Utrecht1 = new Team("Utrecht1 ");
        Team AZ1 = new Team("AZ1 ");
        Team Willem21 = new Team("Willem21");
        Team Vitesse1 = new Team("Vitesse1");
        Team ADO1 = new Team("ADO1 ");
        Team Sparta1 = new Team("Sparta1 ");
        Team Heereveen1 = new Team("Heereveen1");
        Team Groningen1 = new Team("Groningen1 ");
        Team NAC1 = new Team("NAC1 ");
        Team Graafschap1 = new Team("Graafschap1 ");
        Team FCTwente1 = new Team("FCTwente1 ");
        Team PECzwolle1 = new Team("PECzwolle1");
        Team Heracles1 = new Team("Heracles1 ");
        Team FCEmmen1 = new Team("FCEmmen1 ");
        Team VVVvenlo1 = new Team("VVVvenlo1 ");
        Team Fortuna1 = new Team("Fortuna1 ");
        Team RKC1 = new Team("RKC1 ");
        Team DEVdoorn1 = new Team("DEVdoorn1 ");
        Team FCdriebergen1 = new Team("FCdriebergen1 ");



        eredivisie.addTeams(ajax1);
        eredivisie.addTeams(PSV1);
        eredivisie.addTeams(Feyenoord1);
        eredivisie.addTeams(Utrecht1);
        eredivisie.addTeams(AZ1);
        eredivisie.addTeams(Willem21);
        eredivisie.addTeams(Vitesse1);
        eredivisie.addTeams(ADO1);
        eredivisie.addTeams(Sparta1);
        eredivisie.addTeams(Heereveen1);
        eredivisie.addTeams(Groningen1);
        eredivisie.addTeams(NAC1);
        eredivisie.addTeams(Graafschap1);
        eredivisie.addTeams(FCTwente1);
        eredivisie.addTeams(PECzwolle1);
        eredivisie.addTeams(Heracles1);
        eredivisie.addTeams(FCEmmen1);
        eredivisie.addTeams(VVVvenlo1);
        eredivisie.addTeams(Fortuna1);
        eredivisie.addTeams(RKC1);
        eredivisie.addTeams(DEVdoorn1);
        eredivisie.addTeams(FCdriebergen1);
        System.out.println("________________________________________________");


        System.out.println(eredivisie);
        eredivisie.speelWedstrijd();






















    }
}
