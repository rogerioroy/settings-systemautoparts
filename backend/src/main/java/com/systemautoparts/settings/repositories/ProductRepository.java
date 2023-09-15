package com.systemautoparts.settings.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.systemautoparts.settings.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
