package com.janenik.guavagraphs;

import com.google.common.base.Preconditions;
import com.google.common.graph.MutableValueGraph;
import com.google.common.graph.ValueGraphBuilder;

import java.util.Collection;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 * Graph of the roads between cities, based on Guava Graph library.
 */
public class RoadGraph {

    private MutableValueGraph<City, Road> roadsGraph;

    public RoadGraph() {
        roadsGraph = ValueGraphBuilder
                .directed()
                .allowsSelfLoops(false)
                .build();
    }

    public RoadGraph addCity(City city) {
        roadsGraph.addNode(city);
        return this;
    }

    public RoadGraph addRoad(City source, City destination) {
        roadsGraph.putEdgeValue(source, destination, new Road(source, destination));
        roadsGraph.putEdgeValue(destination, source, new Road(destination, source));
        return this;
    }

    public RoadGraph removeRoad(City source, City destination) {
        roadsGraph.removeEdge(source, destination);
        roadsGraph.removeEdge(destination, source);
        return this;
    }

    /**
     * Breadth-first search that starts from source and traverses all the connected cities.
     *
     * @param source   Source to start from.
     */
    public void breadthFirstSearch(City source) {
        breadthFirstSearch(source, null);
    }

    public void breadthFirstSearch(City source, City destination){
        traverseGraph(source, destination, false);
    }

    public void depthFirstSearch(City source){
        depthFirstSearch(source, null);
    }

    public void depthFirstSearch(City source, City destination){
        traverseGraph(source, destination, true);
    }


    /**
     * Breadth-first search that starts from source and traverses cities until it founds destination.
     * Algorithm stops when non-null destination is found.
     *
     * @param source      Source to start from.
     * @param destination Destination city.
     */
 /*   public void breadthFirstSearch(City source, City destination) {
        Preconditions.checkNotNull(source); // if source == null -> NPE
        Deque<City> deque = new LinkedList<>();
        Set<City> visitedCities = new HashSet<>();
        deque.add(source);

        while (!deque.isEmpty()) {
            City cityToVisit = deque.removeFirst(); // BFS
            visitedCities.add(cityToVisit);
            for (City adjacentCity : roadsGraph.adjacentNodes(cityToVisit)) {
                if (visitedCities.contains(adjacentCity)) {
                    continue; // Skip already visited city -> goes to the loop beginning.
                }
                // Process city that was not visited.
                Road roadToConnectedCity = roadsGraph.edgeValue(cityToVisit, adjacentCity);
                deque.addLast(adjacentCity);

                // Visit the road.
                //consumer.accept(roadToConnectedCity);
                System.out.println("\t" + roadToConnectedCity);

                if (adjacentCity.equals(destination)) {
                    // Found path to destination.
                    return;
                }
            }
        }
    }*/

    private void traverseGraph(City source, City destination, boolean isDFS){
        Preconditions.checkNotNull(source);
        Set<City> visitedCities = new HashSet<>();
        Deque<City> deque = new LinkedList<>();

        deque.add(source);

        while(!deque.isEmpty()){
            City cityToVisit;
            if(isDFS){
                cityToVisit = deque.removeLast();
            }else {
                cityToVisit = deque.removeFirst();
            }
            visitedCities.add(cityToVisit);
            for (City adjacentCity : roadsGraph.adjacentNodes(cityToVisit)) {
                if (visitedCities.contains(adjacentCity)) {
                    continue; // Skip already visited city -> goes to the loop beginning.
                }
                // Process city that was not visited.
                Road roadToConnectedCity = roadsGraph.edgeValue(cityToVisit, adjacentCity);
                deque.addLast(adjacentCity);

                // Visit the road.
                //consumer.accept(roadToConnectedCity);
                System.out.println("\t" + roadToConnectedCity);

                if (adjacentCity.equals(destination)) {
                    // Found path to destination.
                    return;
                }
            }
        }
    }


    public static void main(String... args) {
        City minsk = new City("Minsk", 53.9, 27.566667);
        City svetlogorsk = new City("Svetlogorsk", 52.633333, 29.733333);
        City bobruisk = new City("Bobruisk", 53.15, 29.233333);
        City mozyr = new City("Mozyr", 52.05, 29.25);
        City rechitsa = new City("Retchisa", 52.3639, 30.3947);
        City gomel = new City("Gomel", 52.4453, 30.9842);
        City grodno = new City("Grodno", 53.666667, 23.833333);
        City brest = new City("Brest", 52.133333, 23.666667);
        City newYork = new City("New York", -52.133333, -13.666667);

        RoadGraph roads = new RoadGraph();
        roads.addRoad(svetlogorsk, bobruisk);
        roads.addRoad(svetlogorsk, rechitsa);
        roads.addRoad(rechitsa, gomel);
        roads.addRoad(bobruisk, minsk);
        roads.addRoad(bobruisk, mozyr);
        roads.addRoad(gomel, mozyr);
        roads.addRoad(mozyr, brest);
        roads.addRoad(minsk, brest);
        roads.addRoad(minsk, grodno);
        roads.addCity(newYork);

        System.out.println("\n\nSTARTING FROM: " + svetlogorsk);
        roads.breadthFirstSearch(svetlogorsk);

        System.out.println("\n\nSTARTING FROM: " + svetlogorsk + " SEARCHING ROAD TO: " + grodno);
        roads.breadthFirstSearch(svetlogorsk, grodno);

        System.out.println("\n\nSTARTING FROM: " + newYork);
        roads.breadthFirstSearch(newYork);
    }
}
