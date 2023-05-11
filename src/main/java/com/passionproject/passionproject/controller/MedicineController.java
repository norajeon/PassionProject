package com.passionproject.passionproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.passionproject.passionproject.entity.Medicine;
import com.passionproject.passionproject.services.MedicineService;

@RestController
@RequestMapping("/api")
public class MedicineController {

    @Autowired
    private MedicineService medicineService;

    @GetMapping("/{id}")
    public ResponseEntity<Medicine> getPerson(@PathVariable Integer id) {
        return new ResponseEntity<>(medicineService.findOne(id), HttpStatus.OK);
    }

    @GetMapping("/medicine")
    public ResponseEntity<List<Medicine>> getMedicineList() {
        return new ResponseEntity<>(medicineService.findAll(), HttpStatus.OK);
    }
@PostMapping
    public ResponseEntity<Medicine> createMedicine (@RequestBody Medicine p) {
        return new ResponseEntity<>(medicineService.save(p), HttpStatus.CREATED);
    }

    @GetMapping("/hello") 
    public String home() {
        return "hello";
    }

    @PutMapping("/{id}")
    public ResponseEntity<Medicine> updatePerson(@PathVariable Integer id, @RequestBody Medicine p) {
        Medicine existingMed = medicineService.findOne(id);

        p.setId(id);
        Medicine savedMed = medicineService.save(p);
    
        if (existingMed == null) {
            return ResponseEntity.status(HttpStatus.CREATED).body(savedMed);
        } else {
            return ResponseEntity.status(HttpStatus.OK).body(savedMed);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> DeletePerson(@PathVariable Integer id) {
            medicineService.delete(id); 
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();                            
    }

}