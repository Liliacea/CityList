package com.springination.springidol;

import java.util.ArrayList;

public class City implements Cities {
    private  String name;
    private int population;
    private String state;


    ArrayList<City> bigCities;
    ArrayList<City> cities;

    public City(String name, int population, String state) {
        this.name = name;
        this.population = population;
        this.state = state;
    }

    public City() {

    }

    public ArrayList<City> getCities() {
        return cities;
    }

    public void setCities(ArrayList<City> cities) {
        this.cities = cities;
    }

    public ArrayList<City> getBigCities() {
        return bigCities;
    }

    public void setBigCities(ArrayList<City> bigCities) {
        this.bigCities = bigCities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
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

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", population='" + population + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}

