package com.modelforge.repository;
import com.modelforge.model.Model;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface ModelRepository extends JpaRepository<Model, Long> {
    List<Model> findByName(String name);

    List<Model> findByAccuracyGreaterThanEqual(double accuracy);

    List<Model> findByAccuracyBetween(
            double minAccuracy,
            double maxAccuracy);

    Page<Model> findByNameContainingIgnoreCase(String name, Pageable pageable);
}
