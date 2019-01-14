package com.manytomanytry.manytry.entit;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import javax.transaction.Transactional;

@Entity(name = "FournisserArticle")
@Table(name = "fournisseur_article")
public class FournisseurArticle /*implements Serializable*/ {

	/**
	 * 
	 */
//	private static final long serialVersionUID = -3205230425700498407L;

	@EmbeddedId
	private FournissArticleId FA_Id;
	
	@ManyToOne(/*fetch = FetchType.EAGER,*/ cascade = CascadeType.MERGE)
	@MapsId("articleId")
	private Article article;
	
	@ManyToOne(/*fetch = FetchType.EAGER,*/cascade = CascadeType.MERGE)
	@MapsId("fournisseurId")
	private Fournisseur fournisseur;
	
	private int prix;
	


	public FournissArticleId getFA_Id() {
		return FA_Id;
	}

	public void setFA_Id(FournissArticleId fA_Id) {
		FA_Id = fA_Id;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}

	public FournisseurArticle() {
	}


	public Article getArticle() {
		return article;
	}

	public Fournisseur getFournisseur() {
		return fournisseur;
	}

	public int getPrix() {
		return prix;
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((article == null) ? 0 : article.hashCode());
//		result = prime * result + ((fournisseur == null) ? 0 : fournisseur.hashCode());
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
//		FournisserArticle other = (FournisserArticle) obj;
//		if (article == null) {
//			if (other.article != null)
//				return false;
//		} else if (!article.equals(other.article))
//			return false;
//		if (fournisseur == null) {
//			if (other.fournisseur != null)
//				return false;
//		} else if (!fournisseur.equals(other.fournisseur))
//			return false;
//		return true;
//	}
	
	

}
