package com.example.atelier2.service;

import com.example.atelier2.models.Projet;
import com.example.atelier2.models.ProjetDev;
import com.example.atelier2.models.ProjetRes;
import com.example.atelier2.repository.ProjetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjetServiceImpl implements  ProjetService{
    @Autowired
    ProjetRepository projetRepository;
    @Override
    public List<Projet> lesProjets() {
        return projetRepository.findAll();
    }

    @Override
    public List<ProjetDev> getProjetsDev() {
        return projetRepository.getProjetsDev();
    }

    @Override
    public List<ProjetRes> getProjetsRes() {
        return projetRepository.getProjetsRes();
    }

    @Override
    public Projet ajouterProjet(Projet p) {
        return projetRepository.save(p);
    }

    @Override
    public ProjetDev ajouterProjetDev(ProjetDev p) {
        return projetRepository.save(p);
    }

    @Override
    public ProjetRes ajouterProjetRes(ProjetRes p) {
        return projetRepository.save(p);
    }

    @Override
    public ProjetRes modifierProjetRes(ProjetRes p) {


        return null;
    }
}
