package com.passionproject.passionproject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.passionproject.passionproject.entity.Medicine;
import com.passionproject.passionproject.repositories.MedicineRepository;

@Service
public class MedicineService {
    @Autowired
    MedicineRepository medicineRepository;


    public List<Medicine> findAll() {
        return (List<Medicine>) medicineRepository.findAll();
    }

    public Medicine findOne(Integer id) {
        return medicineRepository.findById(id).orElse(null);
    }

    public Medicine save(Medicine m) {
        return medicineRepository.save(m);
    }

    public void delete(Integer id) {
        medicineRepository.deleteById(id);
    }

}
