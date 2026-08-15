package com.modelforge.service;

import com.modelforge.ModelMapper;
import com.modelforge.dto.ModelRequest;
import com.modelforge.dto.ModelResponse;
import com.modelforge.exception.ModelNotFoundException;
import com.modelforge.model.Model;
import com.modelforge.repository.ModelRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModelService {
    public final ModelRepository modelRepository;
    public final ModelMapper modelMapper;

    public ModelService(ModelRepository modelRepository, ModelMapper modelMapper){
        this.modelRepository = modelRepository;
        this.modelMapper = modelMapper;
    }

    public List<ModelResponse> getModels(){
        return modelRepository.findAll()
                .stream()
                .map(modelMapper::toResponse)
                .toList();
    }

    public ModelResponse getModelById(Long id) {
         Model model = modelRepository.findById(id)
                .orElseThrow(() ->
                        new ModelNotFoundException(id));
         return modelMapper.toResponse(model);
    }

    public ModelResponse saveModel(ModelRequest request){
        Model model = modelMapper.toEntity(request);
        Model savedModel = modelRepository.save(model);
        return modelMapper.toResponse(savedModel);
    }

    public List<ModelResponse> searchByName(String name) {
        return modelRepository
                .findByNameContainingIgnoreCase(name)
                .stream()
                .map(modelMapper::toResponse)
                .toList();
    }

    public List<ModelResponse> getModelsAboveAccuracy(double accuracy) {
        return modelRepository
                .findByAccuracyGreaterThanEqual(accuracy)
                .stream()
                .map(modelMapper::toResponse)
                .toList();
    }
}
