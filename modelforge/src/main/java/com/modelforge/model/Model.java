package com.modelforge.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

@Entity
@Table(name = "models")
public class Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Model name cannot be blank")
    private String name;

    @Min(value = 0, message = "Accuracy cannot be negative")
    @Max(value = 100, message = "Accuracy cannot exceed 100")
    private double accuracy;

    @Positive(message = "Version must be positive")
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
