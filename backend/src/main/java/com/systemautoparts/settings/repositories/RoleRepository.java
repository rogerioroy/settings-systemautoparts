package com.systemautoparts.settings.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.systemautoparts.settings.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{

}
