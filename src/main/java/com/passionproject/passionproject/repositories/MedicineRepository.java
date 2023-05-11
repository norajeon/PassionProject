package com.passionproject.passionproject.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.passionproject.passionproject.entity.Medicine;

@Repository
public interface MedicineRepository extends CrudRepository<Medicine, Integer> {
    
}
