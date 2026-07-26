package com.modelforge.repository;
import com.modelforge.model.Model;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class ModelRepository {
    private final List<Model> models = new ArrayList<>();

    public ModelRepository(){
        models.add(new Model("ResNet50",95.6,2));
        models.add(new Model("YOLOv8",91.4,4));
        models.add(new Model("EfficientNet",94.2,3));
    }
    public List<Model> findAll(){
        return models;
    }
}
