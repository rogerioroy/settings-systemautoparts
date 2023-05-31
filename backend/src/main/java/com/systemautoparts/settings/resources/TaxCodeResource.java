package com.systemautoparts.settings.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.systemautoparts.settings.dto.TaxCodeDTO;
import com.systemautoparts.settings.services.TaxCodeService;

@RestController
@RequestMapping(value = "/taxCodes")
public class TaxCodeResource {
	
	@Autowired
	private TaxCodeService service;
	
	@GetMapping
	public ResponseEntity<List<TaxCodeDTO>> findAll() {
		List<TaxCodeDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);			
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<TaxCodeDTO> findbyId(@PathVariable Long id) {
		TaxCodeDTO dto = service.findById(id);
		return ResponseEntity.ok().body(dto);			
	}
	
	@PostMapping
	public ResponseEntity<TaxCodeDTO> insert(@RequestBody TaxCodeDTO dto) {
		dto = service.insert(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
	             .buildAndExpand(dto.getId()).toUri();
		return ResponseEntity.created(uri).body(dto);
	}
}
