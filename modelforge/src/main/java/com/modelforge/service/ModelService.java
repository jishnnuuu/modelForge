package com.modelforge.service;

import com.modelforge.exception.ModelNotFoundException;
import com.modelforge.model.Model;
import com.modelforge.repository.ModelRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModelService {
    public final ModelRepository modelRepository;

    public ModelService(ModelRepository modelRepository){
        this.modelRepository = modelRepository;
    }

    public Model getModelById(Long id) {
        return modelRepository.findById(id)
                .orElseThrow(() ->
                        new ModelNotFoundException(id));
    }

    public List<Model> getModels(){
        return modelRepository.findAll();
    }

    public Model saveModel(Model model){
        return modelRepository.save(model);
    }
}
