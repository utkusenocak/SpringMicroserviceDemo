package com.usenocak.movieclient.model;

public class Movie {
    private String name;
    private String date;
    private String imbdPoint;

    public Movie(String name, String date, String imbdPoint) {
        this.name = name;
        this.date = date;
        this.imbdPoint = imbdPoint;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getImbdPoint() {
        return imbdPoint;
    }

    public void setImbdPoint(String imbdPoint) {
        this.imbdPoint = imbdPoint;
    }
}
