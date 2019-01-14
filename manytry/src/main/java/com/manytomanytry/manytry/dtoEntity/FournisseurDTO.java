package com.manytomanytry.manytry.dtoEntity;

public class FournisseurDTO {

	private long idFournisseur;
	private String nameFournisseur;
	private String description;
	
	
	
	public FournisseurDTO() {
	}

	public String getDescription() {
		return description;
	}
	public long getIdFournisseur() {
		return idFournisseur;
	}
	public void setIdFournisseur(long idFournisseur) {
		this.idFournisseur = idFournisseur;
	}
	public String getNameFournisseur() {
		return nameFournisseur;
	}
	public void setNameFournisseur(String nameFournisseur) {
		this.nameFournisseur = nameFournisseur;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	
	
}
