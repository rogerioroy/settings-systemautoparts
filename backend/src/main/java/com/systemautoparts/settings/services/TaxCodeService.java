package com.systemautoparts.settings.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.systemautoparts.settings.entities.TaxCode;
import com.systemautoparts.settings.repositories.TaxCodeRepository;

@Service
public class TaxCodeService {

	@Autowired
	private TaxCodeRepository repository;
	
	public List<TaxCode> findAll() {
		return repository.findAll();
	}		
}
