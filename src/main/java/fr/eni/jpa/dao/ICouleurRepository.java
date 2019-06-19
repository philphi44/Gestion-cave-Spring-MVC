package fr.eni.jpa.dao;

import java.util.List;

import fr.eni.jpa.bean.Couleur;


public interface ICouleurRepository {

	List<Couleur> findAll();

	Couleur findOne(int id);

}
