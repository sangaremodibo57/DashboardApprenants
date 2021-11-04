package com.OdkApprenant.demo.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Formateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private Integer age;
    private Integer telephone;
    private String email;
    private String login;
    private String password;
    private String genre;
    private String status;
    private Date dateCreation;
    private Date dateModification;

    public Formateur() {
    }

    public Formateur(Long id, String nom, String prenom, Integer age, Integer telephone, String email, String login, String password, String genre, String status, Date dateCreation, Date dateModification) {
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
        this.dateCreation = dateCreation;
        this.dateModification = dateModification;
    }

    public Formateur(String nom, String prenom, Integer age, Integer telephone, String email, String login, String password, String genre, String status, Date dateCreation, Date dateModification) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.telephone = telephone;
        this.email = email;
        this.login = login;
        this.password = password;
        this.genre = genre;
        this.status = status;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
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

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Date getDateModification() {
        return dateModification;
    }

    public void setDateModification(Date dateModification) {
        this.dateModification = dateModification;
    }
}
