package ObjectOrientedProgramming;
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;


public class TestFSM {

    private String zin;
    private List<Node> afgelopenNodes = new ArrayList<>();

    @Test
    public void firstStep() {
        Node s0 =  new Node("S0");
        Node s1 =  new Node("S1");

        s0.addNextNode('A', s1);
        s1.addNextNode('A',s1);
        s1.addNextNode('B', s0);

        FSM FSM =  new FSM("Formatieve_opdracht");
        assertEquals(null, FSM.getCode());

        FSM.setCode("ABAB");
        assertEquals("ABAB", FSM.getCode());

        assertNotNull(afgelopenNodes);
    }

    @Test
    public void path() {
        FSM formatieve =  new FSM("Formatief");
        assertEquals("Formatief", formatieve.getNameMachine() );

        formatieve.setCode("ABAB");
        assertEquals("ABAB", formatieve.getCode() );





    }







}
