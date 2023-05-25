package com.systemautoparts.settings.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.systemautoparts.settings.dto.TaxCodeDTO;
import com.systemautoparts.settings.entities.TaxCode;
import com.systemautoparts.settings.repositories.TaxCodeRepository;

@Service
public class TaxCodeService {

	@Autowired
	private TaxCodeRepository repository;

	@Transactional(readOnly = true)
	public List<TaxCodeDTO> findAll() {
		List<TaxCode> list = repository.findAll();
		return list.stream().map(x -> new TaxCodeDTO(x)).collect(Collectors.toList());
	}		
}
