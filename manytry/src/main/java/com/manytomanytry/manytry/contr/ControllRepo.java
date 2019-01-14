package com.manytomanytry.manytry.contr;

import java.net.URI;
import java.util.List;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.manytomanytry.manytry.dtoEntity.FournisseurArticleDTO;
import com.manytomanytry.manytry.entit.Article;
import com.manytomanytry.manytry.entit.Fournisseur;
import com.manytomanytry.manytry.entit.FournisseurArticle;
import com.manytomanytry.manytry.repo.FournisseurArticleRepository;
import com.manytomanytry.manytry.serv.ArticleFournisseurService;
import com.manytomanytry.manytry.serv.ArticleService;
import com.manytomanytry.manytry.serv.FournisseurService;

//@Transactional interdit will return nullfor every fetch
@RestController
public class ControllRepo {

    @Autowired
    private FournisseurService fournisseurService;
    
    @Autowired
    private ArticleService articleService;
    
    @Autowired
    private ArticleFournisseurService articleFournisseurService;
    
//    @Autowired
//    private FournisseurRepository fournisseurRepository;
//
//    @Autowired
//    private ArticleRepository articleRepository;
    @Autowired
    private FournisseurArticleRepository fournisseurArticleRepository;
    
    
    @GetMapping(path = "/fournisseurs")
    private List<Fournisseur> findAllFournisseurs() {
//    	System.out.println(fournisseurService.findallF());
        return fournisseurService.findallF();
    }
    
    @GetMapping(path = "/articles")
    private List<Article> findAllArticles() {
//    	System.out.println(articleJpaRepository.findAll());
    	return articleService.findAll();
    }
    
    //return everything
    @GetMapping(path="/try")
    private List<FournisseurArticleDTO> findAll(){
    	return articleFournisseurService.findAll();
    }
    
    @GetMapping(path="/try1/{id}")
    private List<FournisseurArticle> findtry(@PathVariable Long id){
    	return fournisseurArticleRepository.findByFournisseurByIdfournisseur(id);
    }
    @GetMapping(path="/try2/{id}")
    private List<FournisseurArticle> findtry2(@PathVariable Long id){
    	return fournisseurArticleRepository.findByArticlesByIdarticle(id);
    }
  
    
//    @RequestMapping("home")
//    public ModelAndView show(@RequestParam("name") String value) {
//    	ModelAndView mv = new ModelAndView();
//    	mv.addObject("name",value);
//    	mv.setViewName("home");
//    	return mv;
//    }
//    
//    @RequestMapping("/")
//    public Model go(Model m) {
//    	
//    	m.addAttribute("post", "hi");
//		return m;
//  
//    }
    
    
    @GetMapping(value = "/fournisseurs/name/{name}")
    public Fournisseur findNameFournisseur(@PathVariable final String name){
        return fournisseurService.findByDescription(name);
    }
    @GetMapping(value = "/articles/name/{name}")
    public Article findNameArticle(@PathVariable final String name){
    	return articleService.findByNameArticle(name);
    }
    
    @GetMapping(value = "/fournisseurs/id/{id}")
    public Fournisseur findByIdFournisseur(@PathVariable final Long id){
    	return fournisseurService.getById(id);
    }

    @PostMapping(value = "/fournisseurs/load")
    //valid to check validity before open transaction with db
    public ResponseEntity<Object> load(@Valid  @RequestBody final Fournisseur fournisseur/*,BindingResult bindingResult*/) throws MethodArgumentNotValidException {
//    	if (fournisseur.getIdFournisseur() != null) {
//    		bindingResult.addError(new FieldError("fournisseur", "code "+fournisseur.getIdFournisseur(), "can't add fournisseur with id"));
//    		throw new MethodArgumentNotValidException(null, bindingResult);
//    	}
    	if (fournisseur.getNameFournisseur()!=null) {
    Fournisseur f = fournisseurService.saveFourniseur(fournisseur);
    
    	URI uri = ServletUriComponentsBuilder
    			.fromCurrentRequest()
    			.path("/{id}")
    			.buildAndExpand(f.getIdFournisseur())
    			.toUri();
    	return ResponseEntity.created(uri).build();
//        return fournisseurService.getById(fournisseur.getIdFournisseur());
    }else {
    	return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).build();
    }
    	}
    
    @PostMapping(value = "/fournisseurArticle/load")
    public FournisseurArticle save(@Valid  @RequestBody final FournisseurArticle fa) {
    	return articleFournisseurService.savefa(fa);
    }
    
    @PostMapping(value = "/articles/load")
    public Article save(@Valid  @RequestBody final Article a) {
    	 
		return articleService.saveArticle(a);
    }
}

