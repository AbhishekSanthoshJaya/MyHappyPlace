package com.aby.tovisit_abhishek_c0769778_android.model;

import java.io.Serializable;

public class Place implements Serializable {

    private int id;
    private String name;
    private Boolean isVisited;
    private Double lat, lng;

    public Place(int id, String name, Boolean isVisited, Double lat, Double lng) {
        this.name = name;
        this.isVisited = isVisited;
        this.lat = lat;
        this.lng = lng;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getVisited() {
        return isVisited;
    }

    public void setVisited(Boolean visited) {
        isVisited = visited;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

}