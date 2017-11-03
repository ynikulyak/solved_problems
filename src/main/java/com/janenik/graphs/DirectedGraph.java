package com.janenik.graphs;

import java.util.HashMap;
import java.util.Map;

/**
 * Directed graph.
 */
public class DirectedGraph<T> {

    private final Map<String, Node<T>> nodes;

    public DirectedGraph() {
        this.nodes = new HashMap<>();
    }

    public boolean addNode(String id) {
        return addNode(id, null);
    }

    public boolean addNode(String id, T data) {
        return addNode(new Node<>(id, data));
    }

    public boolean hasNode(String id) {
        return nodes.containsKey(id);
    }

    public boolean hasEdge(String sourceId, String destinationId) {
        Node<T> source = nodes.get(sourceId);
        Node<T> destination = nodes.get(destinationId);
        return source != null && destination != null && source.hasEdgeTo(destination);
    }

    public boolean addEdge(String sourceId, String destinationId, double cost) {
        return addEdge(sourceId, null, destinationId, null, cost);
    }

    public boolean addEdge(
            String sourceId, T sourceData,
            String destinationId, T destinationData,
            double cost) {
        if (!nodes.containsKey(sourceId)) {
            addNode(sourceId, sourceData);
        }
        if (!nodes.containsKey(destinationId)) {
            addNode(destinationId, destinationData);
        }

        Node<T> sourceNode = nodes.get(sourceId);
        Node<T> destinationNode = nodes.get(destinationId);
        return sourceNode.addEdgeTo(destinationNode, cost);
    }

    private boolean addNode(Node<T> node) {
        if (this.nodes.containsKey(node.getId())) {
            return false;
        }
        this.nodes.put(node.getId(), node);
        return true;
    }
}
