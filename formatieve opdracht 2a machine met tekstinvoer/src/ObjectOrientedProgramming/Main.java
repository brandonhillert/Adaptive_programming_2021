package ObjectOrientedProgramming;
import java.util.Scanner;

public class Main {

    public static <code> void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Node state1 = new Node(0);
        Node state2 = new Node(1);
        Node state3 = new Node(2);
        Node state4 = new Node(3);


        System.out.println("Geef een code dat bestaat uit 4 characters allen A of B: ");
        String code = input.next();

        checkCode(code);

    }

    private static void checkCode(String codes){
        String code = codes;
        if (code.length() == 4) {

            char[] chars = code.toCharArray();
            boolean codeGoedOfFout = false;

            for (char c : chars) {
                c = Character.toUpperCase(c);

                if (c == 'A' || c == 'B') {
                    codeGoedOfFout = true;
                } else {
                    codeGoedOfFout = false;
                    break;
                }
            }
            System.out.println(codeGoedOfFout);
        }
    }




}
