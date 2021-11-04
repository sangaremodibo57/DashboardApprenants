package com.OdkApprenant.demo.controllers;


import com.OdkApprenant.demo.model.Apprenant;
import com.OdkApprenant.demo.model.Formateur;
import com.OdkApprenant.demo.services.FormateurServiceImp;
import org.springframework.web.bind.annotation.*;

import java.util.List;




@RestController
@RequestMapping("/api")
public class FormateurController {
    FormateurServiceImp formateurServiceImp;

    public FormateurController(FormateurServiceImp formateurServiceImp) {
        this.formateurServiceImp = formateurServiceImp;
    }
    @GetMapping("/listFormateur")
    public List listFormateur(){

        return this.formateurServiceImp.listFormateur();
    }
    @PostMapping("/addFormateur")
    public String addFormateur(@RequestBody Formateur formateur){
        this.formateurServiceImp.addFormateur(formateur);
        return "Ajouter" ;
    }
    @GetMapping("/afficheFormateur/{id}")
    public Formateur afficheFormateur(@PathVariable Long id ){

        return this.formateurServiceImp.afficheFormateur(id);
    }
    @PutMapping("/updateFormateur/{id}")
    public void updateFormateur(@PathVariable Long id, @RequestBody Formateur formateur ){
        this.formateurServiceImp.updateFormateur(id, formateur);



    }


}
