package ObjectOrientedProgramming;
import java.util.HashMap;
import java.util.Set;

public class Node {

    private String node;
    private HashMap<Character, Node> listNextNodes = new HashMap<Character, Node>();

    // Constructor
    public Node(String node) {
        this.node = node;
    }

    // Ophalen van de transities
    public HashMap< Character, Node> getListNextNodes() {
        return listNextNodes;
    }

    public String getNode() {
        return node;
    }


    // Get List of events
    public Node nextNode(char x) {
        return this.listNextNodes.get(x);
    }

    // Ophalen van de transities in een set om te kunnen controleren om de input geldig is
    public Set<Character> getSet() {
        return listNextNodes.keySet();
    }

    public void addNextNode(Character character, Node b) {
        this.listNextNodes.put(character, b);
    }


    // Transities van de state overzichtelijk returnen
    @Override
    public String toString() {
        String events = "";

        for (Character key : listNextNodes.keySet()) {
            events = events + key + " -> " + listNextNodes.get(key).node + ", ";
        }
        return "State: " + node + " Transities: " + events;
    }










}
