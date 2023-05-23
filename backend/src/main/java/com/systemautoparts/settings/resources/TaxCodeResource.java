package com.systemautoparts.settings.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.systemautoparts.settings.entities.TaxCode;
import com.systemautoparts.settings.services.TaxCodeService;

@RestController
@RequestMapping(value = "/taxCodes")
public class TaxCodeResource {
	
	@Autowired
	private TaxCodeService service;
	
	@GetMapping
	public ResponseEntity<List<TaxCode>> findAll() {
		List<TaxCode> list = service.findAll();
		return ResponseEntity.ok().body(list);			
	}
}
