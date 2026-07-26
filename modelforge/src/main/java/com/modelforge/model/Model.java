package com.modelforge.model;

import jakarta.persistence.*;

@Entity
@Table(name = "models")
public class Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double accuracy;
    private int version;

    public Model(String name, double accuracy, int version){
        this.name = name;
        this.accuracy = accuracy;
        this.version = version;
    }

    public Model() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
