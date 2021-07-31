package ObjectOrientedProgramming;
import java.util.HashMap;

public class Node {

    private String node;
    private HashMap<Character, Node> listNextNodes = new HashMap<Character, Node>();

    public Node(String node) {
        this.node = node;
    }

    public Node nextNode(char x) {
        return this.listNextNodes.get(x);
    }

    public void addNextNode(char charachter, Node b) {
        this.listNextNodes.put(charachter, b);
    }

    @Override
    public String toString() {
        return node;
    }
}
