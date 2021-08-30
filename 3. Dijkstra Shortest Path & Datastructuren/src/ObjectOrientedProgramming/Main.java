/**
 * Author: Brandon Hillert
 * Date: 24-05-2021
 * Program: Summatieve opdracht 3 Dijkstra
 */
package ObjectOrientedProgramming;

public class Main {
    public static void main(String[] arg) {

        //aanmaken punten
        Node rit_A = new Node("A");
        Node rit_B = new Node("B");
        Node rit_C = new Node("C");
        Node rit_D = new Node("D");
        Node rit_E = new Node("E");
        Node rit_F = new Node("F");

        //verbindingen tussen nodes toegevoegd
        Stap ritAB = new Rit(rit_B, 10);
        Stap ritAC = new Rit(rit_C, 15);

        Stap ritBD = new Rit(rit_D, 12);
        Stap ritBF = new Rit(rit_F, 15);

        Stap ritCE = new Rit(rit_E, 10);

        Stap ritDE = new Rit(rit_E, 2);
        Stap ritDF = new Rit(rit_F, 1);

        Stap ritFE = new Rit(rit_E, 5);

        //voeg een bestemming toe
        rit_A.voegBestemmingToe(ritAB);
        rit_A.voegBestemmingToe(ritAC);
        rit_B.voegBestemmingToe(ritBD);
        rit_B.voegBestemmingToe(ritBF);
        rit_C.voegBestemmingToe(ritCE);
        rit_D.voegBestemmingToe(ritDE);
        rit_D.voegBestemmingToe(ritDF);
        rit_F.voegBestemmingToe(ritFE);


        shortestPath shortestPathRit = new shortestPath();

        shortestPathRit.addNode(rit_A);
        shortestPathRit.addNode(rit_B);
        shortestPathRit.addNode(rit_C);
        shortestPathRit.addNode(rit_D);
        shortestPathRit.addNode(rit_E);
        shortestPathRit.addNode(rit_F);

        Reis reisRit1 = new Reis("Rit");
        Node beginpuntRit = rit_A;
        Node eindpuntRit = rit_E;

        //hierboven kun je het beginpunt kiezen en het eindpunten. Hier onder zal dan de kortste route voor je uitgerekend worden en uitgeprint.
        System.out.println(reisRit1.bestRoute(eindpuntRit, shortestPath.calculateShortestPathFromSource(shortestPathRit, beginpuntRit), beginpuntRit));
        System.out.println();


        Node treinRitA = new Node("Breda");
        Node treinRitB = new Node("Roosendaal");
        Node treinRitC = new Node("Eindhoven");
        Node treinRitD = new Node("Bergen-op-zoom");
        Node treinRitE = new Node("Tilburg");
        Node treinRitF = new Node("Kielegat");

        //mn is het aantal minuten. 20 is in dit geval dus het aantal minuten van a naar b.
        Stap treinRitAB = new Treinrit(treinRitB, 20);
        Stap treinRitAC = new Treinrit(treinRitC, 10);

        Stap treinRitBD = new Treinrit(treinRitD, 30);
        Stap treinRitBF = new Treinrit(treinRitF, 50);

        Stap treinRitCE = new Treinrit(treinRitE, 15);

        Stap treinRitDE = new Treinrit(treinRitE, 60);
        Stap treinRitDF = new Treinrit(treinRitF, 40);

        Stap treinRitFE = new Treinrit(treinRitE, 10);

        treinRitA.voegBestemmingToe(treinRitAB);
        treinRitA.voegBestemmingToe(treinRitAC);

        treinRitB.voegBestemmingToe(treinRitBD);
        treinRitB.voegBestemmingToe(treinRitBF);

        treinRitC.voegBestemmingToe(treinRitCE);

        treinRitD.voegBestemmingToe(treinRitDE);
        treinRitD.voegBestemmingToe(treinRitDF);

        treinRitF.voegBestemmingToe(treinRitFE);


        shortestPath shortestPathTreinrit = new shortestPath();

        shortestPathTreinrit.addNode(treinRitA);
        shortestPathTreinrit.addNode(treinRitB);
        shortestPathTreinrit.addNode(treinRitC);
        shortestPathTreinrit.addNode(treinRitD);
        shortestPathTreinrit.addNode(treinRitE);
        shortestPathTreinrit.addNode(treinRitF);

        Reis reistTeinrit1 = new Reis("Treinrit");
        Node beginNodeTreinrit = treinRitA;
        Node endNodeTreinrit = treinRitE;

        System.out.println(reistTeinrit1.bestRoute(endNodeTreinrit, shortestPath.calculateShortestPathFromSource(shortestPathTreinrit, beginNodeTreinrit), beginNodeTreinrit));
        System.out.println();


        Node vluchtA = new Node("Schiphol");
        Node vluchtB = new Node("Suvarnabhumi");
        Node vluchtC = new Node("Luchthaven Antwerpen");
        Node vluchtD = new Node("Luchthaven Eindhoven");
        Node vluchtE = new Node("Carcassonne");
        Node vluchtF = new Node("Stockholm-Arlanda");

        //bij vlucht ab is 200 de prijs van de vlucht en de 5 is vijf procent kans dat je bagage kwijt raakt. Aangezien ik de prrijs van de vlucht belangrijker vind dan de bagage heb ik de kans dat je bagage kwijtraakt gedeeld door 2 gedaan. Zo word de prijs een belangrijkere factor.

        Stap vluchtAB = new Vlucht(vluchtB, 200 * (5 / 2));
        Stap vluchtAC = new Vlucht(vluchtC, 185 * (8 / 2));

        Stap vluchtBD = new Vlucht(vluchtD, 126 * (14 / 2));
        Stap vluchtBF = new Vlucht(vluchtF, 75 * (33 / 2));

        Stap vluchtCE = new Vlucht(vluchtE, 99 * (27 / 2));

        Stap vluchtDE = new Vlucht(vluchtE, 72 * (39 / 2));
        Stap vluchtDF = new Vlucht(vluchtF, 113 * (19 / 2));

        Stap vluchtFE = new Vlucht(vluchtE, 111 * (21 / 2));

        vluchtA.voegBestemmingToe(vluchtAB);
        vluchtA.voegBestemmingToe(vluchtAC);

        vluchtB.voegBestemmingToe(vluchtBD);
        vluchtB.voegBestemmingToe(vluchtBF);

        vluchtC.voegBestemmingToe(vluchtCE);

        vluchtD.voegBestemmingToe(vluchtDE);
        vluchtD.voegBestemmingToe(vluchtDF);

        vluchtF.voegBestemmingToe(vluchtFE);

        shortestPath shortestPathVlucht = new shortestPath();

        shortestPathVlucht.addNode(vluchtA);
        shortestPathVlucht.addNode(vluchtB);
        shortestPathVlucht.addNode(vluchtC);
        shortestPathVlucht.addNode(vluchtD);
        shortestPathVlucht.addNode(vluchtE);
        shortestPathVlucht.addNode(vluchtF);

        Reis reisVlucht1 = new Reis("Vlucht");
        Node beginNodeVlucht = vluchtA;
        Node eindNodeVlucht = vluchtE;

        System.out.println(reisVlucht1.bestRoute(eindNodeVlucht, shortestPath.calculateShortestPathFromSource(shortestPathVlucht, beginNodeVlucht), beginNodeVlucht));
    }
}