package com.janenik.myGraphs;

import com.google.common.base.Preconditions;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;


/**
 * Created by jane on 9/19/17.
 */
public class Graph {

    int numberOfVertices;
    LinkedList<Integer>[] adjListArray;

    Graph(int number) {
        numberOfVertices = number;

        //define size of array as number of vertices in graph.
        adjListArray = new LinkedList[numberOfVertices];

        //create a new list for each vertices.
        for (int i = 0; i < numberOfVertices; i++) {
            adjListArray[i] = new LinkedList<>();
        }
    }

    //add an edge to undirected graph
    public void addEdge(int source, int dest) {
        //add edge form source to dist
        adjListArray[source].addFirst(dest);

        //as graph is undirected also add edge from dist to source
        adjListArray[dest].addFirst(source);
    }

    public static void printGraph(Graph graph) {

        for (int i = 0; i < graph.numberOfVertices; i++) {

            System.out.println("Adjacency list for vertex " + i);
            System.out.print(i);
            for (Integer num : graph.adjListArray[i]) {
                System.out.print("->" + num);
            }
            System.out.println();
        }
    }

    public void breadthFirstSearch(int source) {

        boolean[] visited = new boolean[numberOfVertices];

        Queue<Integer> queue = new LinkedList<>();

        visited[source] = true;
        queue.add(source);

        while (!queue.isEmpty()) {
            source = queue.poll();
            System.out.print(source + " ");

            Iterator<Integer> iterator = adjListArray[source].listIterator();
            while (iterator.hasNext()) {

                int num = iterator.next();
                if (!visited[num]) {
                    visited[num] = true;
                    queue.add(num);
                }
            }
        }
    }

    public void depthFirstSearch(int source) {
        Preconditions.checkNotNull(source);
        boolean[] visited = new boolean[numberOfVertices];

        Stack<Integer> stack = new Stack<>();
        stack.push(source);
        visited[source] = true;

        while (!stack.isEmpty()) {
            source = stack.pop();

            System.out.print(source + " ");


            Iterator<Integer> itr = adjListArray[source].listIterator();
            while (itr.hasNext()) {
                int num = itr.next();
                if (!visited[num]) {
                    visited[num] = true;
                    stack.push(num);
                }
            }
        }

    }

    public boolean hasCycle() {
        int source = -1;
        for (LinkedList<Integer> adj : adjListArray) {
            if (!adj.isEmpty()) {
                source = adj.getFirst();
                break;
            }
        }
        if (source == -1) {
            return false;
        }


        int parent;
        boolean[] visited = new boolean[numberOfVertices];
        Stack<Integer> stack = new Stack<>();
        stack.push(source);
        visited[source] = true;

        while (!stack.isEmpty()) {
            parent = source;
            source = stack.pop();
            Iterator<Integer> itr = adjListArray[source].listIterator();
            while (itr.hasNext()) {
                int adjacentNodeId = itr.next();
                if (source == adjacentNodeId) {
                    return true; // self loop
                }
                if (!visited[adjacentNodeId]) {
                    visited[adjacentNodeId] = true;
                    stack.push(adjacentNodeId);
                    if (parent != source && parent == adjacentNodeId) {
                        return true;
                    }
                }
            }
        }
        return false;
    }


    public static void main(String[] args) {
        Graph graph = new Graph(5);

        graph.addEdge(4, 2);
        graph.addEdge(1, 0);
        graph.addEdge(0, 2);
        graph.addEdge(2, 1);
        graph.addEdge(0, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 0);


        printGraph(graph);
        System.out.println("\nThis is BFS\n");
        graph.breadthFirstSearch(0);
        System.out.println("\nThis is DFS\n");
        graph.depthFirstSearch(0);

        System.out.println("\nHas cycle: " + graph.hasCycle());


        graph = new Graph(10);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);

        System.out.println("\nHas cycle: " + graph.hasCycle());
    }
}
