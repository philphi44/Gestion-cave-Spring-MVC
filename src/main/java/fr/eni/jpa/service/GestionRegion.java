package fr.eni.jpa.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import fr.eni.jpa.bean.Region;
import fr.eni.jpa.dao.IRegionRepository;

@Service(value="gestionRegion")
public class GestionRegion {

	@Autowired
	IRegionRepository rdao;
	
	public List<Region> listeRegions(){
		return rdao.findAll();
	}
	
}
