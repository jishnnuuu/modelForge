package com.modelforge.model;

public class Model {
    private String name;
    private double accuracy;
    private int version;

    public Model(String name, double accuracy, int version){
        this.name = name;
        this.accuracy = accuracy;
        this.version = version;
    }

    public String getName(){
        return name;
    }

    public double getAccuracy(){
        return accuracy;
    }

    public int getVersion(){
        return version;
    }
}
