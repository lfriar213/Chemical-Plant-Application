package com.example.myapplication.Models;

public class Company {
    private String name;
    private double latitude;
    private double longitude;
    private double yearEstablished;

    public Company(String name, double latitude, double longitude, double yearEstablished) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.yearEstablished = yearEstablished;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getYearEstablished() {
        return yearEstablished;
    }

    public void setYearEstablished(double yearEstablished) {
        this.yearEstablished = yearEstablished;
    }
}
