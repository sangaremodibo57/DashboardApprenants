package com.OdkApprenant.demo.services;

import com.OdkApprenant.demo.model.Formateur;

import java.util.List;

public interface FormateurService {

    public Formateur addFormateur (Formateur formateur);
    public  void  updateFormateur (Long id,Formateur formateur);
    public  String supFormateur (Long id);
    public List listFormateur ();
    public  Formateur afficheFormateur(Long id);
}
