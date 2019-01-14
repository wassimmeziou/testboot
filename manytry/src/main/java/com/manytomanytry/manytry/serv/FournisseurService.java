package com.manytomanytry.manytry.serv;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.manytomanytry.manytry.entit.Fournisseur;
import com.manytomanytry.manytry.exceptions.DataNotFoundException;
import com.manytomanytry.manytry.repo.FournisseurRepository;


@Service
public class FournisseurService {

	@Autowired
	FournisseurRepository fournisseurRepository;

	public Fournisseur saveFourniseur(Fournisseur fournisseur) {
	return fournisseurRepository.save(fournisseur);
//		URI uri = ServletUriComponentsBuilder
//    			.fromCurrentRequest()
//    			.path("/{id}")
//    			.buildAndExpand(f.getIdFournisseur())
//    			.toUri();
//    	return ResponseEntity.created(uri).build();
		
	}
	

	public Fournisseur getById(long id) {
		Fournisseur findOne = fournisseurRepository.findOne(id);
		if (findOne == null)
			throw new DataNotFoundException("id : "+id);
		return findOne;
	}


//	public Fournisseur getname(String name) {
//		// TODO Auto-generated method stub
//		return fournisseurRepository.findByDescriptionFournisseur(name);
//	}
//	
	public void deleteFourniseur(long id) {
		fournisseurRepository.delete(id);
	}
	
	public List<Fournisseur> findallF() {
		return fournisseurRepository.findAll();
	}

	public Fournisseur findByDescription(String name) {
		// TODO Auto-generated method stub
		return fournisseurRepository.findByDescription(name);
	}

}
