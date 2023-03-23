package com.example.atelier2.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tache")
public class Tache {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "projet_dev_id")
    private ProjetDev projetDev;





    public ProjetDev getProjetDev() {
        return projetDev;
    }

    public void setProjetDev(ProjetDev projetDev) {
        this.projetDev = projetDev;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}