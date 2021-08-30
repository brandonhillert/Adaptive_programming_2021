package ObjectOrientedProgramming;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class shortestPath {
    public Node node;

    public static shortestPath calculateShortestPathFromSource(shortestPath shortestPath, Node source) {

        Set<Node> settledNodes = new HashSet<>();
        Set<Node> unsettledNodes = new HashSet<>();

        source.setAfstand(0);

        unsettledNodes.add(source);

        while (unsettledNodes.size() != 0) {

            Node currentNode = getLowestDistanceNode(unsettledNodes);
            unsettledNodes.remove(currentNode);

            for (Map.Entry<Node, Integer> adjacencyPair :
                    currentNode.getDichtsbijzijndeNode().entrySet()) {
                Node adjacentNode = adjacencyPair.getKey();
                Integer edgeWeight = adjacencyPair.getValue();

                if (!settledNodes.contains(adjacentNode)) {
                    CalculateMinimumDistance(adjacentNode, edgeWeight, currentNode);
                    unsettledNodes.add(adjacentNode);
                }
            }
            settledNodes.add(currentNode);
        }
        return shortestPath;
    }

    private static Node getLowestDistanceNode(Set<Node> unsettledNodes) {
        Node lowestDistanceNode = null;
        int lowestDistance = Integer.MAX_VALUE;
        for (Node node : unsettledNodes) {
            int nodeDistance = node.getAfstand();
            if (nodeDistance < lowestDistance) {
                lowestDistance = nodeDistance;
                lowestDistanceNode = node;
            }
        }
        return lowestDistanceNode;
    }

    private static void CalculateMinimumDistance(Node evaluationNode, Integer edgeWeigh, Node sourceNode) {
        Integer sourceDistance = sourceNode.getAfstand();
        if (sourceDistance + edgeWeigh < evaluationNode.getAfstand()) {
            evaluationNode.setAfstand(sourceDistance + edgeWeigh);
            LinkedList<Node> shortestPath = new LinkedList<>(sourceNode.getShortestPath());
            shortestPath.add(sourceNode);

            if (!shortestPath.contains(evaluationNode)) {
                shortestPath.add(evaluationNode);
            }

            evaluationNode.setShortestPath(shortestPath);
        }
    }

    public void addNode(Node nd) {
        this.node = nd;
    }
}