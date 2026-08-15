package com.modelforge.dto;

public class ModelResponse {

    private Long id;
    private String name;
    private double accuracy;
    private int version;

    public ModelResponse(
            Long id,
            String name,
            double accuracy,
            int version) {

        this.id = id;
        this.name = name;
        this.accuracy = accuracy;
        this.version = version;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getAccuracy() {
        return accuracy;
    }

    public int getVersion() {
        return version;
    }
}