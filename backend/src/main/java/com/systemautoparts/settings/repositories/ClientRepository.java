package com.systemautoparts.settings.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.systemautoparts.settings.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
