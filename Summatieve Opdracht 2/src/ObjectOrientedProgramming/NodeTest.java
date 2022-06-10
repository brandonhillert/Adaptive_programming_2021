/***
package ObjectOrientedProgramming;

import static org.junit.Assert.*;
import org.junit.Test;

class NodeTest {

    @Test
    void addNextNode() {

        Node node = new Node("S0");
        Node node1 = new Node("S0");

        node.addNextNode('a', node1 );

        assertEquals(node.nextNode('a'), 'a');

    }

    @Test
    void testToString() {
    }

    @Test
    void nextNode() {
        Node s0 =  new Node("S0");
        Node s1 =  new Node("S1");
        s0.addNextNode('A', s1);
        s1.addNextNode('A',s1);
        s1.addNextNode('B', s0);
        System.out.println(s0.nextNode('A'));
        assertNotNull(s0.nextNode('A'));
        System.out.println("Bij de test hoort de volgende node s1 te zijn aangezien we de letter A gebruiken");
    }

}
 ***/