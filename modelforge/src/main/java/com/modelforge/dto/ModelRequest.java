package com.modelforge.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public class ModelRequest {
    @NotBlank(message = "Model name cannot be blank")
    private String name;

    @Min(value = 0, message = "Accuracy cannot be negative")
    @Max(value = 100, message = "Accuracy cannot exceed 100")
    private double accuracy;

    @Positive(message = "Version must be positive")
    private int version;

    public ModelRequest() {
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
