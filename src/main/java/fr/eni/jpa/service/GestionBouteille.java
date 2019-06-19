package fr.eni.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fr.eni.jpa.bean.Bouteille;
import fr.eni.jpa.dao.IBouteilleRepository;


@Service(value="gestionBouteille")
public class GestionBouteille {

	@Autowired
	IBouteilleRepository bdao;
	
	public List<Bouteille> listeBouteilles(){
		return bdao.findAll();
	}
	
	public Bouteille rechercherBouteille(int id){
		return bdao.findOne(id);
	}
	public void ajouterBouteille(Bouteille b){
		bdao.save(b);
	}	
	public void modifierBouteille(Bouteille b){
		bdao.save(b);
	}	
	public void supprimer(Bouteille b){
		bdao.delete(p);
	}
	public void supprimerBouteille(int id){
		bdao.delete(id);
	}
	
	

	public List<Bouteille> rechercherBouteille(String nom){
		return bdao.findByNom(nom);
	}

	public List<Bouteille> rechercherBouteilleNomContenant(String nom){
		return bdao.findByNomContaining(nom);
	}

	public Bouteille trouverBouteille(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void ajoutBouteille(Bouteille b) {
		// TODO Auto-generated method stub
		
	}
	
}
