package com.manytomanytry.manytry.repo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.manytomanytry.manytry.entit.FournisseurArticle;

public interface FournisseurArticleRepository extends JpaRepository<FournisseurArticle, Long>{
	public static final String FOURNISSEURS =
			  "SELECT * from fournisseur_article fa,article a,fournisseur f "
			+ "where a.id_article=fa.article_id_article " + 
			  "and f.id_fournisseur = fa.fournisseur_id_fournisseur "
			+ "and f.id_fournisseur  = :id";
	
	public static final String ARTICLES 	= 
			"select * from fournisseur_article fa,article a,fournisseur f "
		  + "where a.id_article=fa.article_id_article " + 
			"and f.id_fournisseur = fa.fournisseur_id_fournisseur "
		  + "and a.id_article 		= ?1";


	@Query(value = FOURNISSEURS, nativeQuery = true)
	List<FournisseurArticle> findByFournisseurByIdfournisseur(@Param(value = "id") Long id);
	
	@Query(value = ARTICLES, nativeQuery = true)
	List<FournisseurArticle> findByArticlesByIdarticle(Long id);

}
