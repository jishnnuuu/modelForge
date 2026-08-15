package com.modelforge.controller;

import com.modelforge.dto.ModelRequest;
import com.modelforge.dto.ModelResponse;
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
    public List<ModelResponse> getModels(){
        return modelService.getModels();
    }

    @PostMapping
    public ModelResponse createModel(@Valid @RequestBody ModelRequest requestModel){
        return modelService.saveModel(requestModel);
    }

    @GetMapping("/{id}")
    public ModelResponse getModel(@PathVariable Long id){
        return modelService.getModelById(id);
    }
}
