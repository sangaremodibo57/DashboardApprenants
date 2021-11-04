package com.OdkApprenant.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Apprenant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private Integer age;
    private Integer telephone;
    private Integer email;
    private String login;
    private String password;
    private String genre;
    private String status;
    private String ApprenantStatus;
    private String dateCreation;
    private String dateModification;



    public Apprenant(){}

    public Apprenant(Long id, String nom, String prenom, Integer age, Integer telephone, Integer email, String login, String password, String genre, String status , String apprenantStatus, String dateCreation, String dateModification) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.telephone = telephone;
        this.email = email;
        this.login = login;
        this.password = password;
        this.genre = genre;
        this.status = status;
        this.ApprenantStatus = apprenantStatus;
        this.dateCreation = dateCreation;
        this.dateModification = dateModification;
    }

    public Apprenant(String nom, String prenom, Integer age, Integer telephone, Integer email, String login, String password, String genre, String status, String apprenantStatus, String dateCreation, String dateModification) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.telephone = telephone;
        this.email = email;
        this.login = login;
        this.password = password;
        this.genre = genre;
        this.status = status;
        this.ApprenantStatus = apprenantStatus;
        this.dateCreation = dateCreation;
        this.dateModification = dateModification;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getTelephone() {
        return telephone;
    }

    public void setTelephone(Integer telephone) {
        this.telephone = telephone;
    }

    public Integer getEmail() {
        return email;
    }

    public void setEmail(Integer email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getApprenantStatus() {
        return ApprenantStatus;
    }

    public void setApprenantStatus(String apprenantStatus) {
        ApprenantStatus = apprenantStatus;
    }

    public String getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getDateModification() {
        return dateModification;
    }

    public void setDateModification(String dateModification) {
        this.dateModification = dateModification;
    }
}
