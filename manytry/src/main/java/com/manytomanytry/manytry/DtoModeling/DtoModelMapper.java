package com.manytomanytry.manytry.DtoModeling;

import java.util.ArrayList;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.manytomanytry.manytry.dtoEntity.ArticleDTO;
import com.manytomanytry.manytry.dtoEntity.FournisseurArticleDTO;
import com.manytomanytry.manytry.dtoEntity.FournisseurDTO;
import com.manytomanytry.manytry.entit.Article;
import com.manytomanytry.manytry.entit.FournisseurArticle;
import com.manytomanytry.manytry.entit.Fournisseur;

@Component
public class DtoModelMapper {

	ModelMapper modelMapper = new ModelMapper();
	
	public Fournisseur founisseurDTO_fournisseur(FournisseurDTO fdto) {
		
		Fournisseur f = modelMapper.map(fdto, Fournisseur.class);
		return f;
	}
	
	public FournisseurDTO fournisseur_fournisseurDTO(Fournisseur f) {
		
		FournisseurDTO fdto = modelMapper.map(f, FournisseurDTO.class);
		return fdto;
	}
	
	public ArticleDTO article_articleDTO(Article a) {
		ArticleDTO adto= modelMapper.map(a, ArticleDTO.class);
		return adto;
	}
	
	public FournisseurArticleDTO fournisseurArticle_fournisseurArticleDTO(FournisseurArticle fa) {
		FournisseurArticleDTO fadto = modelMapper.map(fa, FournisseurArticleDTO.class);
		return fadto;
	}
	
	public List<FournisseurArticleDTO> fournisseurArticle_list_fournisseurArticleDTO_list(List<FournisseurArticle> lfa){
		List<FournisseurArticleDTO> lfadto = new ArrayList<>();
		for (FournisseurArticle fa:lfa) {
			lfadto.add(fournisseurArticle_fournisseurArticleDTO(fa));
		}
		
		return lfadto;
	}

	
	
	
//	@Test
//    public void whenConvertPostEntityToPostDto_thenCorrect() {
//      
////        Article a = new Article();
////        a.setName("nameArticle");
////        
////        Fournisseur post = new Fournisseur();
////        post.setNameFournisseur("nameFournisseur");
////        post.setDescription("www.test.com");
////        
////        FournisserArticle fa = new FournisserArticle();
////        fa.setArticle(a);
////        fa.setFournisseur(post);
// 
//        FournisseurArticleDTO postDto = modelMapper.map(fa, FournisseurArticleDTO.class);
//        System.out.println(postDto.getArticle().getNameArticle());
//        System.out.println(postDto.getFournisseur().getNameFournisseur());
//        System.out.println(postDto.getFournisseur().getDescription());
////        modelMapper.getConfiguration().setPropertyCondition(Conditions.isNotNull());
////        assertEquals(post.getNameFournisseur(), postDto.getNameFournisseur());
////        assertEquals(post.getDescription(), postDto.getDescription());
////        modelMapper.getConfiguration().setPropertyCondition(Conditions.isNotNull());
//        
//    }
 
}
