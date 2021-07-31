/**
 * Author: Brandon Hillert
 * Date: 20-05-2021
 * Program: Summatieve opdracht 2 FSM
 */
package ObjectOrientedProgramming;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String code;

        //Aanmaken FSM
        FSM formatieve_opdracht =  new FSM("Formatieve_opdracht");

        //Aanmaken nodes
        Node s0 = new Node("S0");
        Node s1 = new Node("S1");
        Node s2 = new Node("S2");
        Node s3 = new Node("S3");

        //Aanmaken Path
        s0.addNextNode('A', s2);
        s0.addNextNode('B', s1);
        s1.addNextNode('A', s1);
        s1.addNextNode('B', s2);
        s2.addNextNode('B', s3);
        s3.addNextNode('A', s3);
        s3.addNextNode('B', s0);

        //Check for input
        do {
            System.out.println("Geef een code dat bestaat uit 4 characters allen A of B: ");
            code = input.next();
        }
        while (!checkCode(code));

        formatieve_opdracht.setCode(code);
        formatieve_opdracht.firstStep(s0);
        formatieve_opdracht.pathTaken();

        System.out.println(formatieve_opdracht);

        //Aanmaken FSM ( Opdr. Summatieve 2
        FSM Summatieve_opdracht =  new FSM("Summatieve 2");

        String code2 = "YXYXXYXY";

        Node p0 = new Node("P0");
        Node p1 = new Node("P1");
        Node p2 = new Node("P2");
        Node p3 = new Node("P3");
        Node p4 = new Node("P4");
        Node p5 = new Node("P5");

        p0.addNextNode('Y', p1);
        p0.addNextNode('X', p5);
        p1.addNextNode('Y', p2);
        p1.addNextNode('X', p5);
        p2.addNextNode('Y', p3);
        p2.addNextNode('X', p5);
        p3.addNextNode('Y', p4);
        p3.addNextNode('X', p5);
        p4.addNextNode('Y', p5);
        p4.addNextNode('X', p5);
        p5.addNextNode('Y', p0);
        p5.addNextNode('X', p5);


        Summatieve_opdracht.setCode(code2);
        Summatieve_opdracht.firstStep(p2);
        Summatieve_opdracht.pathTaken();
        System.out.println(Summatieve_opdracht);
    }

    //Function for checking Code on correct input
    private static boolean checkCode(String codes){
        String code = codes;
        boolean codeGoedOfFout = false;
        if (code.length() == 4) {

            char[] chars = code.toCharArray();

            for (char c : chars) {
                c = Character.toUpperCase(c);
                if (c == 'A' || c == 'B') {
                    codeGoedOfFout = true;
                } else {
                    codeGoedOfFout = false;
                    break;
                }
            }
        }
        return codeGoedOfFout;
    }
}
