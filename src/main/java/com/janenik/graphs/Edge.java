package com.janenik.graphs;

/**
 * Edge contains source node and destination.
 */
class Edge<T> {

    private final double cost;
    private final Node<T> source;
    private final Node<T> destination;

    public Edge(Node<T> source, Node<T> destination, double cost) {
        if (source == null || destination == null) {
            throw new NullPointerException("source and destination are required.");
        }
        this.source = source;
        this.destination = destination;
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public Node<T> getSource() {
        return source;
    }

    public Node<T> getDestination() {
        return destination;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Edge)) return false;

        Edge<?> edge = (Edge<?>) o;

        if (!getSource().equals(edge.getSource())) return false;
        return getDestination().equals(edge.getDestination());
    }

    @Override
    public int hashCode() {
        int result = getSource().hashCode();
        result = 31 * result + getDestination().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "E{" +
                "cst=" + cost +
                ", src=" + source +
                ", dst=" + destination +
                '}';
    }
}
