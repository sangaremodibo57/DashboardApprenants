package com.OdkApprenant.demo.services;

import com.OdkApprenant.demo.model.Apprenant;
import com.OdkApprenant.demo.model.Formateur;
import com.OdkApprenant.demo.repositories.FormateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class FormateurServiceImp implements FormateurService {
    @Autowired
    FormateurRepository formateurRepository;

    @Override
    public Formateur addFormateur(Formateur formateur) {

        return formateurRepository.save(formateur);
    }

    @Override
    public void updateFormateur(Long id, Formateur formateur) {
        Formateur formateur1 = formateurRepository.findById(id).orElseThrow(
                () -> new IllegalStateException("Error")
        );

        formateur1.setNom(formateur.getNom());
        formateur1.setPrenom(formateur.getPrenom());


    }

    @Override
    public String supFormateur(Long id) {

        formateurRepository.deleteById(id);
        return "Supprimer";
    }

    @Override
    public List listFormateur() {
        return formateurRepository.findAll();
    }

    @Override
    public Formateur afficheFormateur(Long id) {

        return formateurRepository.findById(id).get();
    }
}
