package com.example.wutmongojpa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class JpaEntity {
    @Id
    @GeneratedValue
    private Long id;

    private String label;

    protected JpaEntity(){}

    public JpaEntity(String label) {
        this.label = label;
    }
}
