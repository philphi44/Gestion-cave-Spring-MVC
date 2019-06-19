package fr.eni.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fr.eni.jpa.bean.Couleur;
import fr.eni.jpa.dao.ICouleurRepository;


@Service(value="gestionCouleur")
public class GestionCouleur {

	@Autowired
	ICouleurRepository cdao;
	
	public List<Couleur> listeCouleurs(){
		return cdao.findAll();
	}
	
}
