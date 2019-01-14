package com.manytomanytry.manytry.entit;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name = "Fournisseur")
@Table(name = "fournisseur")
//@SecondaryTable(name = "fournisseur_article")
public class Fournisseur {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
//	@Column(name ="Idfournisseur")
	private Long idFournisseur;
	
//	@Column(name="name")
	private  String nameFournisseur;
//	@Column(name="role")
	private  String description;

	
	@OneToMany(
	        mappedBy = "fournisseur",
	        cascade =CascadeType.ALL,
	        orphanRemoval = true
	    )	
	private Set<FournisseurArticle> articles = new HashSet<>();
	
	public Fournisseur() {
	}
	
	
	public void setArticles(Set<FournisseurArticle> articles) {
		this.articles = articles;
	}


	public void setIdFournisseur(Long idFournisseur) {
		this.idFournisseur = idFournisseur;
	}

	public Long getIdFournisseur() {
		return idFournisseur;
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

	public String getDescription() {
		return description;
	}


//	@Override
//	public String toString() {
//		return "Fournisseur [id=" + idFournisseur + ", name=" + nameFournisseur + ", role=" + description + "]";
//	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((nameFournisseur == null) ? 0 : nameFournisseur.hashCode());
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Fournisseur other = (Fournisseur) obj;
//		if (nameFournisseur == null) {
//			if (other.nameFournisseur != null)
//				return false;
//		} else if (!nameFournisseur.equals(other.nameFournisseur))
//			return false;
//		return true;
//	}
	
	
	
}
