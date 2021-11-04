package com.OdkApprenant.demo.model;


import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.util.Date;

@Entity
public class utilisateur {
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
    @Temporal(TemporalType.DATE)
    private Date dateCreation;
    @Temporal(TemporalType.DATE)
    private Date dateModification;


}
