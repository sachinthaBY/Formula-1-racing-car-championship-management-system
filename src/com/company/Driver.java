package com.company;

import java.io.Serializable;

public abstract class Driver implements Serializable {

    //Initialize subclass variables
    private String name;
    private String location;
    private String team;

    //create constructor
    public Driver(String name, String location, String team){
        this.name = name;
        this.location = location;
        this.team = team;
    }

    public Driver(){

    }

    //create getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    //create toString method
    @Override
    public String toString(){
        return " Driver {" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", team='" + team + '\'' +
                "} ";
    }

}
