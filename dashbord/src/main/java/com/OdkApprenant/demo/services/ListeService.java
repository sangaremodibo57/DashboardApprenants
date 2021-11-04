package com.OdkApprenant.demo.services;

import com.OdkApprenant.demo.model.Apprenant;
import com.OdkApprenant.demo.model.Liste;

import java.util.List;

public interface ListeService {
    public List ListePresence();
    public Liste addListe(Liste liste);
    String  supListe(Long id);
    public void updateListe(Long id,Liste liste);
    public Liste afficheListe(Long id);
}
