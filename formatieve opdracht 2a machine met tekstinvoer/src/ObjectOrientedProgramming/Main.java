package ObjectOrientedProgramming;
import java.util.Scanner;

public class Main {

    public static <code> void main(String[] args) {

        Scanner input = new Scanner(System.in);


        Node s0 = new Node("S0");
        Node s1 = new Node("S1");
        Node s2 = new Node("S2");
        Node s3 = new Node("S3");

        Node state = s0;
        //Node newState = s1;

        System.out.println("Geef een code dat bestaat uit 4 characters allen A of B: ");
        String code = input.next();



        if (checkCode(code)){
            for (int i = 0; i < 4; i++) {

                String connection = Character.toString(code.charAt(i));

                if( connection.equals("A")){
                    s0.setNextNode(s2); //A
                    s1.setNextNode(s1); //A
                    s3.setNextNode(s3); //A

                }

                if( connection.equals("B")){
                    s0.setNextNode(s1); //B
                    s1.setNextNode(s2); //B
                    s2.setNextNode(s3); //B
                    s3.setNextNode(s0); //B

                }

                System.out.println("State " + state.getCurrentNode());
                state = state.getNextNode();

            }
            System.out.println("State " + state.getCurrentNode());
        }
    }

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
