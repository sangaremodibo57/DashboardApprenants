package com.OdkApprenant.demo.repositories;

import com.OdkApprenant.demo.model.Apprenant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApprenantRepository extends JpaRepository<Apprenant, Long> {

    Apprenant deleteAllById(Long id);
}
