package com.example.atelier2.models;

import jakarta.persistence.*;

@Entity
@Table(name = "projet")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Projet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "description", nullable = false, length = 120)
    private String description;



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}