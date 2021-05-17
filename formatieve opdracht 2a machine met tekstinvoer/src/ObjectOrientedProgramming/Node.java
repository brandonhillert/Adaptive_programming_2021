package ObjectOrientedProgramming;

public class Node {

    public String currentNode;
    public Node nextNode;

    public Node(String currentNode) {
        this.currentNode = currentNode;
    }

    public String getCurrentNode() {
        return currentNode;
    }

    public void setCurrentNode(String currentNode) {
        this.currentNode = currentNode;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}

