package com.manytomanytry.manytry.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manytomanytry.manytry.entit.Fournisseur;

public interface FournisseurRepository extends JpaRepository<Fournisseur, Long>{

    
	Fournisseur findByDescription (String description);

	
}

