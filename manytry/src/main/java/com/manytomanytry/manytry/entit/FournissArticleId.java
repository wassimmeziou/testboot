package com.manytomanytry.manytry.entit;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Id;

@SuppressWarnings("serial")
@Embeddable
public class FournissArticleId implements Serializable {
	
	
	private Long fournisseurId;

	private Long articleId;
	

	
	//constructors
	public FournissArticleId() {
	}
	
	public Long getFournisseurId() {
		return fournisseurId;
	}
	public Long getArticleId() {
		return articleId;
	}
	

	public void setFournisseurId(Long fournisseurId) {
		this.fournisseurId = fournisseurId;
	}
	public void setArticleId(Long articleId) {
		this.articleId = articleId;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((articleId == null) ? 0 : articleId.hashCode());
		result = prime * result + ((fournisseurId == null) ? 0 : fournisseurId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FournissArticleId other = (FournissArticleId) obj;
		if (articleId == null) {
			if (other.articleId != null)
				return false;
		} else if (!articleId.equals(other.articleId))
			return false;
		if (fournisseurId == null) {
			if (other.fournisseurId != null)
				return false;
		} else if (!fournisseurId.equals(other.fournisseurId))
			return false;
		return true;
	}
//	
	
	

}
