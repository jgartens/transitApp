package com.tts.transitapp.model;

import java.util.List;

public class Row {
    public List<Element> elements;

    public List<Element> getElements() {
        return elements;
    }

    public void setElements(List<Element> elements) {
        this.elements = elements;
    }

    public Row() {
    }

    @Override
    public String toString() {
        return "Row [elements=" + elements + "]";
    }

    
}