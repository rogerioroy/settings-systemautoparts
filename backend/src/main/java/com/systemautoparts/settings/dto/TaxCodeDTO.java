package com.systemautoparts.settings.dto;

import java.io.Serializable;

import com.systemautoparts.settings.entities.TaxCode;

public class TaxCodeDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String cfop;
	private String description;
	private String application;
	
	public TaxCodeDTO() {
	}

	public TaxCodeDTO(Long id, String cfop, String description, String application) {
		this.id = id;
		this.cfop = cfop;
		this.description = description;
		this.application = application;
	}
	
	public TaxCodeDTO(TaxCode entity) {
		id = entity.getId();
		cfop = entity.getCfop();
		description = entity.getDescription();
		application = entity.getApplication();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCfop() {
		return cfop;
	}

	public void setCfop(String cfop) {
		this.cfop = cfop;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getApplication() {
		return application;
	}

	public void setApplication(String application) {
		this.application = application;
	}
}
