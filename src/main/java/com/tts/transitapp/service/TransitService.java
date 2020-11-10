package com.tts.transitapp.service;

import java.util.Arrays;
import java.util.List;

import com.tts.transitapp.model.Bus;
import com.tts.transitapp.model.GeocodingResponse;
import com.tts.transitapp.model.Location;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TransitService{

    @Value("${transit_url}")
    public String transitUrl;

    @Value("${geocoding_url}")
    public String geocodingUrl;

    @Value("${distance_url}")
    public String distanceUrl;

    @Value("${api_key}")
    public String googleApiKey;

    private List<Bus> getBuses(){
        RestTemplate restTemplate = new RestTemplate();
        Bus[] buses = restTemplate.getForObject(transitUrl, Bus[].class);
        return Arrays.asList(buses);
    }

    private Location getCoordinates(String description){
        description = description.replace(" ", "+");
        String url = geocodingUrl + description + "+GA&Key=" + googleApiKey;
        RestTemplate restTemplate = new RestTemplate();
        GeocodingResponse response = restTemplate.getForObject(url, GeocodingResponse.class);
        return response.results.get(0).geometry.location;
    }
  
    
}