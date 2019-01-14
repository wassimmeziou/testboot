package com.manytomanytry.manytry.serv;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manytomanytry.manytry.DtoModeling.DtoModelMapper;
import com.manytomanytry.manytry.dtoEntity.FournisseurArticleDTO;
import com.manytomanytry.manytry.entit.FournisseurArticle;
import com.manytomanytry.manytry.repo.FournisseurArticleRepository;

@Service
public class ArticleFournisseurService {

	@Autowired
	private FournisseurArticleRepository fournArticlRep;
	
	@Autowired
	private DtoModelMapper dtoModelMapper;
	
	
//	public ArticleFournisseurService(FournisseurArticleRepository fournArticlRep) {
//
//		this.fournArticlRep = fournArticlRep;
//	}

	
	public List<FournisseurArticleDTO> findAll() {
		// TODO Auto-generated method stub
		List<FournisseurArticle> findAll = fournArticlRep.findAll();
		 return dtoModelMapper.fournisseurArticle_list_fournisseurArticleDTO_list(findAll);
	}

	public List<FournisseurArticle> findByFournisseurByIdfournisseur(Long id) {
		// TODO Auto-generated method stub
//		List<FournisseurArticle> ff = fournArticlRep.findByFournisseurByIdfournisseur(id);
//		return dtoModelMapper.fournisseurArticle_list_fournisseurArticleDTO_list(ff);
		return fournArticlRep.findByFournisseurByIdfournisseur(id);
	}

	public List<FournisseurArticleDTO> findByArticlesByIdarticle(Long id) {
		// TODO Auto-generated method stub
		List<FournisseurArticle> ffa = fournArticlRep.findByArticlesByIdarticle(id);
		return dtoModelMapper.fournisseurArticle_list_fournisseurArticleDTO_list(ffa);
	}
	
	public FournisseurArticle savefa(FournisseurArticle fa) {
		return fournArticlRep.save(fa);
		
	}

}
