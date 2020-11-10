package com.tts.transitapp.model;

public class Location {
    public String lat;
    public String lng;

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public Location() {
    }

    @Override
    public String toString() {
        return "Location [lat=" + lat + ", lng=" + lng + "]";
    }

    
    
    
}