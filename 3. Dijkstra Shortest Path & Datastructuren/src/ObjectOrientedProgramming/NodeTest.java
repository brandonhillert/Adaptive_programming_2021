package ObjectOrientedProgramming;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import static org.testng.Assert.*;

public class NodeTest {

    @Test
    public void testAddDestination() {
        Map<Node, Integer> testVerbindingenNode = new HashMap<>();
        Node treinRitA = new Node("Breda");
        Node treinRitB = new Node("Roosendaal");
        Node treinRitC = new Node("Eindhoven");

        Stap treinRitAB = new Treinrit(treinRitB, 20);
        Stap treinRitAC = new Treinrit(treinRitC, 10);

        treinRitA.addDestination(treinRitAB);
        treinRitA.addDestination(treinRitAC);

        testVerbindingenNode.put(treinRitB, 20);
        testVerbindingenNode.put(treinRitC, 10);

        assertEquals(testVerbindingenNode, treinRitA.getAdjacentNodes());
    }

    @Test
    public void testGetName() {
        Node testNaamNode = new Node("testNaam");
        assertEquals("testNaam", testNaamNode.getName());

    }

    @Test
    public void testSetDistance() {
        Node testDistanceNode = new Node("testDistance");
        testDistanceNode.setDistance(20);
        assertEquals(java.util.Optional.ofNullable(20), java.util.Optional.ofNullable(testDistanceNode.getDistance()));
    }

    @Test
    public void testGetDistance() {
        Node testDistanceNode_2 = new Node("testDistance");
        testDistanceNode_2.setDistance(31);
        assertEquals(java.util.Optional.ofNullable(31), java.util.Optional.ofNullable(testDistanceNode_2.getDistance()));
    }

    @Test
    public void testGetAdjacentNodes() {
        Map<Node, Integer> testVerbindingenNode = new HashMap<>();
        Node treinRitA = new Node("Breda");
        Node treinRitB = new Node("Zweden");

        Stap treinRitAB = new Treinrit(treinRitB, 15);

        treinRitA.addDestination(treinRitAB);

        testVerbindingenNode.put(treinRitB, 15);

        assertEquals(testVerbindingenNode, treinRitA.getAdjacentNodes());
    }

    @Test
    public void testGetShortestPath() {
        List<Node> kortstePad_2 = new LinkedList<>();
        Node testKortstePad_2 = new Node("testPad_2");
        kortstePad_2.add(testKortstePad_2);
        testKortstePad_2.setShortestPath(kortstePad_2);
        assertEquals(kortstePad_2, testKortstePad_2.getShortestPath());
    }

    @Test
    public void testSetShortestPath() {
        List<Node> kortstePad = new LinkedList<>();
        Node testKortstePad = new Node("testPad");
        kortstePad.add(testKortstePad);
        testKortstePad.setShortestPath(kortstePad);
        assertEquals(kortstePad, testKortstePad.getShortestPath());
    }
}