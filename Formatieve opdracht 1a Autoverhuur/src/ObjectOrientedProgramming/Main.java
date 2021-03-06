package ObjectOrientedProgramming;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Autohuur ah1 = new Autohuur();
        System.out.println("Eerste autohuur: " + ah1.toString());



        Klant k = new Klant("Mijnheer de Vries");
        k.setKorting(10.0);
        ah1.setHuurder(k);

        System.out.println("\n Eerste autohuur: " + ah1.toString());



        Auto a1= new Auto("Peugeot 207", 50);
        ah1.setGehuurdeAuto(a1);
        ah1.setAantalDagen(4);

        System.out.println("\n Eerste autohuur: " + ah1.toString());


        Autohuur ah2 = new Autohuur();
        Auto a2 = new Auto("Ferrari", 3500);
        ah2.setGehuurdeAuto(a2);
        ah2.setHuurder(k);
        ah2.setAantalDagen(1);

        System.out.println("\n Tweede autohuur: " + ah2.toString());
    }
}
