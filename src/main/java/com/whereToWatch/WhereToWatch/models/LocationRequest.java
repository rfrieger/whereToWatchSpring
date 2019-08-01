package com.whereToWatch.WhereToWatch.models;

public class LocationRequest {

    private Integer location_id;
    private String name;
    private String description;
    private String city;
    private String address;
    private String team;

    public LocationRequest(Integer location_id, String name, String description, String city, String address, String team) {
        this.location_id = location_id;
        this.name = name;
        this.description = description;
        this.city = city;
        this.address = address;
        this.team = team;
    }

    public LocationRequest() {}

    public Integer getLocation_id() {
        return location_id;
    }

    public void setLocation_id(Integer location_id) {
        this.location_id = location_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
