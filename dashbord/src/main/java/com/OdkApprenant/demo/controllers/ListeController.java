package com.OdkApprenant.demo.controllers;


import com.OdkApprenant.demo.model.Apprenant;
import com.OdkApprenant.demo.model.Liste;
import com.OdkApprenant.demo.services.ListeServiceImp;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ListeController {
    ListeServiceImp listeServiceImp;

    public ListeController(ListeServiceImp listeServiceImp) {
        this.listeServiceImp = listeServiceImp;
    }
    @PostMapping("/addListe")
    public Liste addListe(@RequestBody Liste liste){
        return this.listeServiceImp.addListe(liste);
    }

    @GetMapping("/afficheListe/{id}")
    public Liste afficheListe(@PathVariable Long id ){

        return this.listeServiceImp.afficheListe(id);
    }

    @GetMapping("/ListePresence")
    public List ListePresence(){
        return this.listeServiceImp.ListePresence();
    }

    @PutMapping("/updateListe/{id}")
    public void updateListe(@PathVariable Long id,@RequestBody Liste liste ){
        this.listeServiceImp.updateListe(id, liste);

    }


    @DeleteMapping("/supListe/{id}")
    public String supListe(@PathVariable Long id ){

        return this.listeServiceImp.supListe(id);
    }



}
