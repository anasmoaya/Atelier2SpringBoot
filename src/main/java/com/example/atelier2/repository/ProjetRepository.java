package com.example.atelier2.repository;

import com.example.atelier2.models.Developpeur;
import com.example.atelier2.models.Projet;
import com.example.atelier2.models.ProjetDev;
import com.example.atelier2.models.ProjetRes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProjetRepository extends JpaRepository<Projet, Long> {
    @Query("select  dev from ProjetDev dev")
    List<ProjetDev> getProjetsDev();

    @Query("select  dev from ProjetRes dev")
    List<ProjetRes> getProjetsRes();
}