package com.manytomanytry.manytry.dtoEntity;

public class FournisseurArticleDTO {
	
	private ArticleDTO article;
	private FournisseurDTO fournisseur;
	
	
	
	public FournisseurArticleDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ArticleDTO getArticle() {
		return article;
	}
	public void setArticle(ArticleDTO article) {
		this.article = article;
	}
	public FournisseurDTO getFournisseur() {
		return fournisseur;
	}
	public void setFournisseur(FournisseurDTO fournisseur) {
		this.fournisseur = fournisseur;
	}

}
