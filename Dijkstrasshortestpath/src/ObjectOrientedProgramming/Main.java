package ObjectOrientedProgramming;
/**
 * Author: Brandon Hillert
 * Date: 20-05-2021
 * Program: Summatieve opdracht 3 Dijkstra's Shortest Path
 * bron https://www.baeldung.com/java-dijkstra
 */

public class Main {
    public static void main(String[] arg) {

        //Nodes aanmaken
        Node ritA = new Node("A");
        Node ritB = new Node("B");
        Node ritC = new Node("C");
        Node ritD = new Node("D");
        Node ritE = new Node("E");
        Node ritF = new Node("F");

        //Routes uitgeprint voor duidelijkheid
        System.out.println("Volgende routes zijn beschikbaar");
        System.out.println("Node: A -- Route: B = 10, C = 15 ");
        System.out.println("Node: B -- Route: D = 12, F = 15 ");
        System.out.println("Node: C -- Route: E = 10 ");
        System.out.println("Node: D -- Route: E = 2, F = 1 ");
        System.out.println("Node: F -- Route: E = 5 ");
        System.out.println("");

        //Verbindingen met weight aanmaken tussen nodes
        Stap ritAB = new Rit(ritB, 10);
        Stap ritAC = new Rit(ritC, 15);
        Stap ritBD = new Rit(ritD, 12);
        Stap ritBF = new Rit(ritF, 15);
        Stap ritCE = new Rit(ritE, 10);
        Stap ritDE = new Rit(ritE, 2);
        Stap ritDF = new Rit(ritF, 1);
        Stap ritFE = new Rit(ritE, 5);

        //routes toevoegen aan nodes
        ritA.addDestination(ritAB);
        ritA.addDestination(ritAC);
        ritB.addDestination(ritBD);
        ritB.addDestination(ritBF);
        ritC.addDestination(ritCE);
        ritD.addDestination(ritDE);
        ritD.addDestination(ritDF);
        ritF.addDestination(ritFE);

        //Aanmaken van graph om vervolgens de gehele map te implementeren
        Graph graphRit = new Graph();

        graphRit.addNode(ritA);
        graphRit.addNode(ritB);
        graphRit.addNode(ritC);
        graphRit.addNode(ritD);
        graphRit.addNode(ritE);
        graphRit.addNode(ritF);

        //Object autorit aanmaken
        Reis autorit = new Reis("Rit");
        Node startNodeRit = ritA;
        Node endNodeRit = ritE;

        //Resultaat afdrukken kortste route tussen A en E
        System.out.println(autorit.bestRoute(endNodeRit, graphRit.calculateShortestPathFromSource(graphRit, startNodeRit)));
        System.out.println("______________________________________________________");

/***
 *Hieronder gaan we verder met het maken van de Trein ritten
 * aan de treinritten zitten aantal minuten verbonden
 */
        //Treinstations (nodes) aanmaken
        Node treinRitA = new Node("Amsterdam");
        Node treinRitB = new Node("Utrecht");
        Node treinRitC = new Node("Eindhoven");
        Node treinRitD = new Node("Rotterdam");
        Node treinRitE = new Node("Arnhem");
        Node treinRitF = new Node("Driebergen");

        //Routes uitgeprint voor duidelijkheid
        System.out.println("De volgende treinritten zijn beschikbaar:");
        System.out.println("Station: Amsterdam      Naar: Utrecht, Eindhoven");
        System.out.println("Station: Utrecht        Naar: Rotterdam, Den Bosch  ");
        System.out.println("Station: Eindhoven      Naar: Arnhem");
        System.out.println("Station: Rotterdam      Naar: Arnhem, Den Bosch");
        System.out.println("Station: Driebergen       Naar: Arnhem");
        System.out.println("");

        //Treinritten
        Stap treinRitAB = new Treinrit(treinRitB, 20);
        Stap treinRitAC = new Treinrit(treinRitC, 10);
        Stap treinRitBD = new Treinrit(treinRitD, 30);
        Stap treinRitBF = new Treinrit(treinRitF, 50);
        Stap treinRitCE = new Treinrit(treinRitE, 15);
        Stap treinRitDE = new Treinrit(treinRitE, 60);
        Stap treinRitDF = new Treinrit(treinRitF, 40);
        Stap treinRitFE = new Treinrit(treinRitE, 10);

        //Verbindingen toevoegen aan nodes
        treinRitA.addDestination(treinRitAB);
        treinRitA.addDestination(treinRitAC);
        treinRitB.addDestination(treinRitBD);
        treinRitB.addDestination(treinRitBF);
        treinRitC.addDestination(treinRitCE);
        treinRitD.addDestination(treinRitDE);
        treinRitD.addDestination(treinRitDF);
        treinRitF.addDestination(treinRitFE);

        //Map aanmaken en treinritten toevoegen
        Graph graphTreinrit = new Graph();

        graphTreinrit.addNode(treinRitA);
        graphTreinrit.addNode(treinRitB);
        graphTreinrit.addNode(treinRitC);
        graphTreinrit.addNode(treinRitD);
        graphTreinrit.addNode(treinRitE);
        graphTreinrit.addNode(treinRitF);

        //Object treinrit aanmaken
        Reis Teinrit = new Reis("Treinrit");
        Node startNodeTrein = treinRitA;
        Node endNodeTrein = treinRitE;

        //Resultaat afdrukken met korste route tussen Amsterdam en Arnhem
        System.out.println(Teinrit.bestRoute(endNodeTrein, graphTreinrit.calculateShortestPathFromSource(graphTreinrit, startNodeTrein)));
        System.out.println("______________________________________________________");

/***
 * Hieronder gaan we verder met het maken van de vluchten tussen verschillende steden
 * Aan deze verbindingen zit een prijs vast, in combinatie met de kans dat je je bagage kwijt kan raken
 */
        //Aanmaken van steden ( nodes )
        Node vluchtA = new Node("Schiphol");
        Node vluchtB = new Node("Bangkok");
        Node vluchtC = new Node("Helsinki");
        Node vluchtD = new Node("Eindhoven");
        Node vluchtE = new Node("Madrid");
        Node vluchtF = new Node("Stockholm");

        //Overzicht van alle vluchten
        System.out.println("Volgende vluchten zijn beschikbaar");
        System.out.println("Schiphol     Vlucht naar: Bangkok, Helsinki ");
        System.out.println("Bangkok      Vlucht naar: Eindhoven, Stockholm ");
        System.out.println("Antwerpen    Vlucht naar: Mardrid ");
        System.out.println("Eindhoven    Vlucht naar: Madrid, Stockholm ");
        System.out.println("Stockholm    Vlucht naar: Madrid ");
        System.out.println("");

        //Prijs en kans op bagage kwijt toevoegen aan vluchtroute
        Stap vluchtAB = new Vlucht(vluchtB, 200 * (5 / 2));
        Stap vluchtAC = new Vlucht(vluchtC, 185 * (8 / 2));
        Stap vluchtBD = new Vlucht(vluchtD, 126 * (14 / 2));
        Stap vluchtBF = new Vlucht(vluchtF, 75 * (33 / 2));
        Stap vluchtCE = new Vlucht(vluchtE, 99 * (27 / 2));
        Stap vluchtDE = new Vlucht(vluchtE, 72 * (39 / 2));
        Stap vluchtDF = new Vlucht(vluchtF, 113 * (19 / 2));
        Stap vluchtFE = new Vlucht(vluchtE, 111 * (21 / 2));

        //Vlucthen toevoegen aan nodes
        vluchtA.addDestination(vluchtAB);
        vluchtA.addDestination(vluchtAC);
        vluchtB.addDestination(vluchtBD);
        vluchtB.addDestination(vluchtBF);
        vluchtC.addDestination(vluchtCE);
        vluchtD.addDestination(vluchtDE);
        vluchtD.addDestination(vluchtDF);
        vluchtF.addDestination(vluchtFE);

        //Map toevoegen en alle vluchten aan nodes koppelen
        Graph graphVlucht = new Graph();

        //Vluchten toevoegen aan nodes
        graphVlucht.addNode(vluchtA);
        graphVlucht.addNode(vluchtB);
        graphVlucht.addNode(vluchtC);
        graphVlucht.addNode(vluchtD);
        graphVlucht.addNode(vluchtE);
        graphVlucht.addNode(vluchtF);

        //Reis object aanmaken
        Reis reisVlucht = new Reis("Vlucht");
        Node startNode = vluchtA;
        Node endNode = vluchtE;

        //Resultaat tussen Schiphol en Madrid toevoegen
        System.out.println(reisVlucht.bestRoute(endNode, graphVlucht.calculateShortestPathFromSource(graphVlucht, startNode)));
    }
}
