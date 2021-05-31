package ObjectOrientedProgramming;

public class Connection {

    public String name;
    public Node currentNode;
    public Node nextNode;

    public Connection(String name, Node currentNode, Node nextNode) {
        this.name = name;
        this.currentNode = currentNode;
        this.nextNode = nextNode;
    }
    

}
