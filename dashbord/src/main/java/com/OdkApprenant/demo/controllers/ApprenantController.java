package com.OdkApprenant.demo.controllers;

import com.OdkApprenant.demo.model.Apprenant;
import com.OdkApprenant.demo.services.ApprenantServiceImp;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApprenantController {

    ApprenantServiceImp apprenantServiceImp;

    public ApprenantController(ApprenantServiceImp apprenantServiceImp) {
        this.apprenantServiceImp = apprenantServiceImp;
    }
    @PostMapping("/addApprenant")
    public Apprenant addApprenant(@RequestBody Apprenant apprenant){
        return this.apprenantServiceImp.addApprenant(apprenant);
    }

    @GetMapping("/afficheApprenant/{id}")
    public Apprenant afficheApprenant(@PathVariable Long id ){
        return this.apprenantServiceImp.afficheApprenant(id);
    }

    @GetMapping("/listApprenant")
    public List listApprenant(){
        return this.apprenantServiceImp.listApprenant();
    }

    @PutMapping("/updateApprenant/{id}")
    public void updateApprenant(@PathVariable Long id,@RequestBody Apprenant apprenant ){
         this.apprenantServiceImp.updateApprenant(id, apprenant);



    }

    @DeleteMapping("/suppApprenant/{id}")
    public String suppApprenant(@PathVariable Long id ){
      return this.apprenantServiceImp.suppApprenant(id);
    }

}
