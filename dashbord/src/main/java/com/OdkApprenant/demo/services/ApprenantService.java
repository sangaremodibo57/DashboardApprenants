package com.OdkApprenant.demo.services;

import com.OdkApprenant.demo.model.Apprenant;

import java.util.List;

public interface ApprenantService {

public Apprenant addApprenant (Apprenant apprenant);
public void updateApprenant (Long id,Apprenant apprenant);
public Apprenant afficheApprenant(Long id);
String suppApprenant(Long id);
public List listApprenant();

}
