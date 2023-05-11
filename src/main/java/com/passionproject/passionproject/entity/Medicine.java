package com.passionproject.passionproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Medicine")
public class Medicine {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "genericName")
    private String genericName;
    @Column(name = "quantity")
    private Integer quantity;
    @Column(name = "cond")
    private String condition;
    @Column(name = "frequency")
    private Integer frequency;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getGenericName() {
        return genericName;
    }
    public void setGenericName(String genericName) {
        this.genericName = genericName;
    }
    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    public String getCondition() {
        return condition;
    }
    public void setCondition(String condition) {
        this.condition = condition;
    }
    public Integer getFrequency() {
        return frequency;
    }
    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }
}
