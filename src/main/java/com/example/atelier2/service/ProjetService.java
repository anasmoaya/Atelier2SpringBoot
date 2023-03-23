package com.example.atelier2.service;

import com.example.atelier2.models.Projet;
import com.example.atelier2.models.ProjetDev;
import com.example.atelier2.models.ProjetRes;

import java.util.List;

public interface ProjetService {
     List<Projet> lesProjets();
     List<ProjetDev> getProjetsDev();
     List<ProjetRes> getProjetsRes();
     Projet ajouterProjet(Projet p);
     ProjetDev ajouterProjetDev(ProjetDev p);
     ProjetRes ajouterProjetRes(ProjetRes p);

     ProjetRes modifierProjetRes(ProjetRes p);


}
