package com.modelforge;

import com.modelforge.dto.ModelRequest;
import com.modelforge.dto.ModelResponse;
import com.modelforge.model.Model;
import org.springframework.stereotype.Component;

@Component
public class ModelMapper {
    public Model toEntity(ModelRequest request){
        return new Model(
                request.getName(),
                request.getAccuracy(),
                request.getVersion()
        );
    }

    public ModelResponse toResponse(Model model){
        return new ModelResponse(
                model.getId(),
                model.getName(),
                model.getAccuracy(),
                model.getVersion()
        );
    }
}
