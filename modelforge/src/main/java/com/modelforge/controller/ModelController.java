package com.modelforge.controller;

import com.modelforge.model.Model;
import com.modelforge.service.ModelService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/models")
public class ModelController {
    private final ModelService modelService;

    public ModelController(ModelService modelService){
        this.modelService = modelService;
    }

    @GetMapping
    public List<Model> getModels(){
        return modelService.getModels();
    }

    @PostMapping
    public Model createModel(@Valid @RequestBody Model model){
        return modelService.saveModel(model);
    }

    @GetMapping("/{id}")
    public Model getModel(@PathVariable Long id){
        return modelService.getModelById(id);
    }
}
