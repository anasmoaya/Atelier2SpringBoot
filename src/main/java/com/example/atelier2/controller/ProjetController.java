package com.example.atelier2.controller;

import com.example.atelier2.models.Projet;
import com.example.atelier2.models.ProjetDev;
import com.example.atelier2.models.ProjetRes;
import com.example.atelier2.service.ProjetService;
import com.example.atelier2.service.ProjetServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projets")
public class ProjetController {

    @Autowired
    private ProjetService projetService;

    @PostMapping
    public Projet addProjet(@RequestBody Projet p){
        return projetService.ajouterProjet(p);
    }
    @GetMapping
    public List<Projet> getProjets(){
        return projetService.lesProjets();
    }

    @GetMapping("/dev")
    public List<ProjetDev> getProjetsDev(){
        return projetService.getProjetsDev();
    }
    @PostMapping("/dev")
    public ProjetDev addProjetDev(@RequestBody ProjetDev p){
        return projetService.ajouterProjetDev(p);
    }
    @GetMapping("/res")
    public List<ProjetRes> getProjetsRes(){
        return projetService.getProjetsRes();
    }
    @PostMapping("/res")
    public ProjetRes addProjetRes(@RequestBody ProjetRes p){
        return projetService.ajouterProjetRes(p);
    }

}
