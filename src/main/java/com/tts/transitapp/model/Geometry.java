package com.tts.transitapp.model;

public class Geometry {
    public Location location;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Geometry() {
    }

    @Override
    public String toString() {
        return "Geometry [location=" + location + "]";
    }

    
}