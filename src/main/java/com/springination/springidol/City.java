package com.springination.springidol;

public class City implements Cities {
    private  String name;
    private String population;
    private String state;

    public City() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }



    @Override
    public void cityList() {
        System.out.println(name);
    }
}
