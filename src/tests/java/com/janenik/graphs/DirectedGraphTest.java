package com.janenik.graphs;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * {@link DirectedGraph} test.
 */
public class DirectedGraphTest {

    private DirectedGraph<Long> graph;

    @Before
    public void setUp() {
        graph = new DirectedGraph<>();
    }

    @Test
    public void testNodeUniqueness() {
        assertTrue(graph.addNode("1"));
        assertTrue(graph.addNode("2"));
        assertTrue(graph.addNode("3"));
        assertTrue(graph.addNode("4"));
        assertTrue(graph.addEdge("1", "5", 1.0D));

        assertFalse(graph.addNode("1"));
        assertFalse(graph.addNode("2"));
        assertFalse(graph.addNode("3"));

        assertFalse(graph.addEdge("1", "5", 2.0D));

        assertTrue(graph.hasNode("5"));
        assertTrue(graph.hasEdge("1", "5"));
    }
}
