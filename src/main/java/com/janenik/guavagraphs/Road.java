package com.janenik.guavagraphs;

import com.google.common.base.Preconditions;

/**
 * Road between two cities.
 */
public class Road {

    private static final double EARTH_RADIUS = 6371.0D; // Radius of the earth in KM.

    private final City source;
    private final City destination;

    public Road(City source, City destination) {
        this.source = Preconditions.checkNotNull(source);
        this.destination = Preconditions.checkNotNull(destination);
    }

    public City getSource() {
        return source;
    }

    public City getDestination() {
        return destination;
    }

    @Override
    public boolean equals(Object otherRoad) {
        if (!(otherRoad instanceof Road)) return false;
        Road road = (Road) otherRoad;
        if (!getSource().equals(road.getSource())) return false;
        return getDestination().equals(road.getDestination());
    }

    @Override
    public int hashCode() {
        int result = getSource().hashCode();
        result = 31 * result + getDestination().hashCode();
        return result;
    }

    /**
     * Returns length of the road, in kilometres.
     *
     * @return Length of the road, in kilometres.
     */
    public double length() {
        double sinDlat = Math.sin(Math.toRadians(source.getLatitude() - destination.getLatitude()) / 2);
        double sinDlon = Math.sin(Math.toRadians(source.getLongitude() - destination.getLongitude()) / 2);
        double a = sinDlat * sinDlat
                + Math.cos(Math.toRadians(destination.getLatitude())) *
                Math.cos(Math.toRadians(source.getLatitude())) * sinDlon * sinDlon;
        double angle = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        return angle * EARTH_RADIUS;
    }

    @Override
    public String toString() {
        return "{" +
                source.getName() + " - " +
                destination.getName() +
                String.format(": %.2f KM", length()) +
                '}';
    }
}
