package ObjectOrientedProgramming;
import java.util.*;

public class FSM {
    private String nameMachine;
    private String code;
    private List<Node> ListOfNodes = new ArrayList<>();

    public FSM(String nameMachine) {
        this.nameMachine = nameMachine;
    }

    public String getNameMachine() {
        return nameMachine;
    }

    public void setCode(String code) {
        this.code = code;
    }
    public String getCode() {
        return code;
    }



    public void firstStep(Node a) {
        this.ListOfNodes.add(a);
    }

    public void pathTaken() {
        for (char i : this.code.toUpperCase(Locale.ROOT).toCharArray()) {

            Node currentNode = ListOfNodes.get(ListOfNodes.size()-1);
            Node nextNode = currentNode.nextNode(i);

            if (nextNode == null) {
                break;
            }

            ListOfNodes.add(nextNode);
        }
    }

    @Override
    public String toString() {
        return "Fsm: " + nameMachine + '\'' +
                ", CODE: '" + code + '\'' +
                ", List of nodes [" + ListOfNodes + ']';
    }

}

