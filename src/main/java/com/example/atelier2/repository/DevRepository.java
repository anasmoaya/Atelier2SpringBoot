package com.example.atelier2.repository;

import com.example.atelier2.models.Developpeur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DevRepository extends JpaRepository<Developpeur, Long> {

}