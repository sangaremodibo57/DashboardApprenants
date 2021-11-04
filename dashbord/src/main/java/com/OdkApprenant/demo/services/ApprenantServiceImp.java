package com.OdkApprenant.demo.services;

import com.OdkApprenant.demo.model.Apprenant;
import com.OdkApprenant.demo.repositories.ApprenantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ApprenantServiceImp implements ApprenantService {

    @Autowired
    ApprenantRepository apprenantRepository;

    @Override
    public Apprenant addApprenant(Apprenant apprenant) {

        return apprenantRepository.save(apprenant);
    }

    @Override
    @Transactional
    public void updateApprenant(Long id,Apprenant apprenant) {
    Apprenant apprenant1 = apprenantRepository.findById(id).orElseThrow(
            () -> new IllegalStateException("Error")
    );

    apprenant1.setNom(apprenant.getNom());
    apprenant1.setPrenom(apprenant.getPrenom());

    }

    @Override
    public Apprenant afficheApprenant(Long id) {

        return apprenantRepository.findById(id).get();
    }

    @Override
    public String suppApprenant(Long id) {
         apprenantRepository.deleteById(id);
         return "Supprimer";
    }

    @Override
    public List listApprenant() {
        return apprenantRepository.findAll();
    }


}
