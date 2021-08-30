package ObjectOrientedProgramming;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Node {
    Map<Node, Integer> dichtsbijzijndeNode = new HashMap<>();
    private final String naam;
    private List<Node> shortestPath = new LinkedList<>();
    private Integer afstand = Integer.MAX_VALUE;

    public Node(String name) {
        this.naam = name;
    }

    public void voegBestemmingToe(Stap stap) {
        dichtsbijzijndeNode.put(stap.eind, stap.getValue());
    }

    public String getNaam() {
        return naam;
    }

    public Integer getAfstand() {
        return afstand;
    }

    public void setAfstand(Integer afstand) {
        this.afstand = afstand;
    }

    public List<Node> getShortestPath() {
        return shortestPath;
    }

    public void setShortestPath(List<Node> shortPath) {
        this.shortestPath = shortPath;
    }

    public Map<Node, Integer> getDichtsbijzijndeNode() {
        return dichtsbijzijndeNode;
    }
}