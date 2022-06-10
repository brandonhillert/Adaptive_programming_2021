package ObjectOrientedProgramming;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Node {

    private String name;
    private List<Node> shortestPath = new LinkedList<>();
    private Integer distance = Integer.MAX_VALUE;
    Map< Node, Integer> adjacentNodes = new HashMap<>();

    public void addDestination(Stap stap) {
        adjacentNodes.put(stap.eind, stap.getValue());
    }

    public Node(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public Integer getDistance() {
        return distance;
    }
    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Map<Node, Integer> getAdjacentNodes() {
        return adjacentNodes;
    }

    public List<Node> getShortestPath() {
        return shortestPath;
    }

    public void setShortestPath(List<Node> shortPath) {
        this.shortestPath = shortPath;
    }
}