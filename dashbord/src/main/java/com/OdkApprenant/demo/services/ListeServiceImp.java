package com.OdkApprenant.demo.services;

import com.OdkApprenant.demo.model.Apprenant;
import com.OdkApprenant.demo.model.Liste;
import com.OdkApprenant.demo.repositories.ListeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListeServiceImp implements ListeService{

    @Autowired
    ListeRepository listeRepository;
    @Override
    public List ListePresence() {
        return this.listeRepository.findAll();
    }

    @Override
    public Liste addListe(Liste liste) {

        return listeRepository.save(liste);
    }

    @Override
    public String supListe(Long id) {
        listeRepository.deleteById(id);
        return "Supprimer";
    }

    @Override
    public void updateListe(Long id, Liste liste) {

        Liste liste1 = listeRepository.findById(id).orElseThrow(
                () -> new IllegalStateException("Error")
        );

        liste1.setDate(liste.getDate());
        liste1.setHeure_arrive(liste.getHeure_arrive());


    }

    @Override
    public Liste afficheListe(Long id) {
        return listeRepository.findById(id).get();
    }

}
