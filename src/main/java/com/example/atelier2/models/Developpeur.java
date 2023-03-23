package com.example.atelier2.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "developpeur")
public class Developpeur {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToMany
    @JoinTable(name = "developpeur_taches",
            joinColumns = @JoinColumn(name = "developpeur_id"),
            inverseJoinColumns = @JoinColumn(name = "taches_id"))
    private List<Tache> taches = new ArrayList<>();

    @Column(name = "nom", length = 100)
    private String nom;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Tache> getTaches() {
        return taches;
    }

    public void setTaches(List<Tache> taches) {
        this.taches = taches;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}