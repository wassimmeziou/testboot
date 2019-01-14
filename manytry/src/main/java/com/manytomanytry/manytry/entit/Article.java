package com.manytomanytry.manytry.entit;

import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;

import oracle.jdbc.pool.OracleDataSource;

@Entity(name = "Article")
@Table(name = "article")
public class Article {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idArticle;
	
	private String nameArticle;
	
	@OneToMany
	(
        mappedBy = "article",
        cascade = {CascadeType.ALL,CascadeType.PERSIST},
        orphanRemoval = true
	)	
	private Set<FournisseurArticle> fournisseurs=new HashSet<>();

	public Article() {
		
	}

	public void setFournisseurs(Set<FournisseurArticle> fournisseurs) {
		this.fournisseurs = fournisseurs;
	}


	public void setNameArticle(String nameArticle) {
		this.nameArticle = nameArticle;
	}
	public String getNameArticle() {
		return nameArticle;
	}
	
	public long getIdArticle() {
		return idArticle;
	}

	public void setIdArticle(long idArticle) {
		this.idArticle = idArticle;
	}




	
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((nameArticle == null) ? 0 : nameArticle.hashCode());
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
//		Article other = (Article) obj;
//		if (nameArticle == null) {
//			if (other.nameArticle != null)
//				return false;
//		} else if (!nameArticle.equals(other.nameArticle))
//			return false;
//		return true;
//	}
	
	

}
