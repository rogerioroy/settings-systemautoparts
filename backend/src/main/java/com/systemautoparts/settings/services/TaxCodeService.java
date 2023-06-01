package com.systemautoparts.settings.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.systemautoparts.settings.dto.TaxCodeDTO;
import com.systemautoparts.settings.entities.TaxCode;
import com.systemautoparts.settings.repositories.TaxCodeRepository;
import com.systemautoparts.settings.services.exceptions.ResourceNotFoundException;

@Service
public class TaxCodeService {

	@Autowired
	private TaxCodeRepository repository;

	@Transactional(readOnly = true)
	public List<TaxCodeDTO> findAll() {
		List<TaxCode> list = repository.findAll();
		return list.stream().map(x -> new TaxCodeDTO(x)).collect(Collectors.toList());
	}
	
	@Transactional(readOnly = true)
	public TaxCodeDTO findById(Long id) {
		Optional<TaxCode> obj = repository.findById(id);
		TaxCode entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
		return new TaxCodeDTO(entity);
	}
	
	@Transactional
	public TaxCodeDTO insert(TaxCodeDTO dto) {
		TaxCode entity = new TaxCode();
		entity.setCfop(dto.getCfop());
		entity.setApplication(dto.getApplication());
		entity.setDescription(dto.getDescription());
		entity = repository.save(entity);
		return new TaxCodeDTO(entity);
	}
	
	@Transactional
	public TaxCodeDTO update(Long id, TaxCodeDTO dto) {
		try {
			TaxCode entity = repository.getOne(id);
			entity.setCfop(dto.getCfop());
			entity.setApplication(dto.getApplication());
			entity.setDescription(dto.getDescription());
			entity = repository.save(entity);
			return new TaxCodeDTO(entity);
		}
		catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException("Id not found" + id);
		}
	}	
}
