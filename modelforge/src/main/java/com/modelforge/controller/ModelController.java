package com.modelforge.controller;

import com.modelforge.model.Model;
import com.modelforge.service.ModelService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ModelController {
    private final ModelService modelService;

    public ModelController(ModelService modelService){
        this.modelService = modelService;
    }

    @GetMapping("/model")
    public List<Model> getModel(){
        return modelService.getModels();
    }

    @PostMapping
    public Model createModel(@RequestBody Model model){
        return modelService.saveModel(model);
    }
}
