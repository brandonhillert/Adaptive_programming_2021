package ObjectOrientedProgramming;

import java.util.HashSet;
import java.util.Set;

public class Reis extends Graph {

    public Reis(String typeReis) {
        if (typeReis == "Rit") {
            System.out.println("De kortste van punt A naar E " + typeReis + " is:");
        }
        else if (typeReis == "Treinrit") {
            System.out.println("De snelste " + typeReis + " is:");
        }
        else if (typeReis == "Vlucht") {
            System.out.println("De goedkoopste en meest veilig voor je bagage route " + typeReis + " is:");
        }
    }

    public Set<String> bestRoute(Node eindNode, Graph graph) {
        Set<String> done = new HashSet<>();
        for (Node i : eindNode.getShortestPath()) {
            done.add(i.getName());
        }
        return done;
    }
}