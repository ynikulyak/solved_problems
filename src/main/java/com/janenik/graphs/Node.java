package com.janenik.graphs;

import javafx.util.Pair;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Node that contains node id and some optional data.
 */
class Node<T> {

    private final String id;
    private final T data;

    /**
     * ID of destination to edge itself.
     */
    private Map<String, Edge<T>> adjacentNodes;

    public Node(String id, T data) {
        if (id == null) {
            throw new NullPointerException("id is required");
        }
        this.id = id;
        this.data = data;
        this.adjacentNodes = new HashMap<>();
    }

    public String getId() {
        return id;
    }

    public T getData() {
        return data;
    }

    public boolean addEdgeTo(Node<T> destination, double cost) {
        if (adjacentNodes.containsKey(destination.getId())) {
            return false;
        }
        Edge<T> edge = new Edge<>(this, destination, cost);
        adjacentNodes.put(destination.getId(), edge);
        return true;
    }

    public boolean hasEdgeTo(Node<T> destination) {
        return adjacentNodes.containsKey(destination.getId());
    }

    public Collection<Edge<T>> getEdges() {
        return Collections.unmodifiableCollection(adjacentNodes.values());
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Node)) {
            return false;
        }
        Node<?> node = (Node<?>) o;
        return id.equals(node.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return String.format("N{id:%s}", this.id);
    }
}
