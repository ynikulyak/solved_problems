package com.janenik.guavagraphs;

import com.google.common.base.Preconditions;

/**
 * City identified by name (unique) and it's coordinates.
 */
public class City {

    private final double latitude;
    private final double longitude;
    private final String name;

    public City(String name, double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = Preconditions.checkNotNull(name);
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object otherCity) {
        return City.class.isInstance(otherCity) && getName().equals(City.class.cast(otherCity).getName());
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }

    @Override
    public String toString() {
        return "{" +
                name + ": " +
                String.format("latitude=%.3f", latitude) +
                String.format(", longitude=%.3f", longitude) +
                '}';
    }
}
