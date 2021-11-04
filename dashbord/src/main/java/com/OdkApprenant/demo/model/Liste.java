package com.OdkApprenant.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Liste {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Date date;
    private Date heure_arrive;
    private  Date heure_depart;

    public Liste() {
    }

    public Liste(long id, Date date, Date heure_arrive, Date heure_depart) {
        this.id = id;
        this.date = date;
        this.heure_arrive = heure_arrive;
        this.heure_depart = heure_depart;
    }

    public Liste(Date date, Date heure_arrive, Date heure_depart) {
        this.date = date;
        this.heure_arrive = heure_arrive;
        this.heure_depart = heure_depart;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getHeure_arrive() {
        return heure_arrive;
    }

    public void setHeure_arrive(Date heure_arrive) {
        this.heure_arrive = heure_arrive;
    }

    public Date getHeure_depart() {
        return heure_depart;
    }

    public void setHeure_depart(Date heure_depart) {
        this.heure_depart = heure_depart;
    }
}
