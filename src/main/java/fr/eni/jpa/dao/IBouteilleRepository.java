package fr.eni.jpa.dao;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import fr.eni.jpa.bean.Bouteille;

	
	public interface IBouteilleRepository extends JpaRepository<Bouteille, Integer>{
	
		List<Bouteille> findByNom(String nom);
		List<Bouteille> findByNomContaining(String nom);
		List<Bouteille> findByNomNotContaining(String nom);
		Bouteille findOne(int id);
		void save(Bouteille b);
		List<Bouteille> findAll();
		
		

	}

