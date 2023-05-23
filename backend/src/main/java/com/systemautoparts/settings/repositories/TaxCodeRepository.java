package com.systemautoparts.settings.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.systemautoparts.settings.entities.TaxCode;

@Repository
public interface TaxCodeRepository extends JpaRepository<TaxCode, Long>{

}
