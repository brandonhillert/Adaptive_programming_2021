package ObjectOrientedProgramming;

import java.util.HashSet;
import java.util.Set;

public class Reis extends shortestPath {
    private final String typeReis;

    public Reis(String typeReis) {
        this.typeReis = typeReis;
        if (typeReis == "Rit") {
            System.out.println("De kortste " + typeReis + " is:");
        } else if (typeReis == "Treinrit") {
            System.out.println("De snelste " + typeReis + " is:");
        } else if (typeReis == "Vlucht") {
            System.out.println("De goedkoopste en meest veilig voor je bagage route " + typeReis + " is:");
        }
    }

    public Set<String> bestRoute(Node eindNode, shortestPath shortestPath, Node beginNode) {
        shortestPath = calculateShortestPathFromSource(shortestPath, beginNode);
        Set<String> done = new HashSet<>();
        for (Node i : eindNode.getShortestPath()) {
            done.add(i.getNaam());
        }
        return done;
    }
}