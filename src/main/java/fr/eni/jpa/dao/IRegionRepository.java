package fr.eni.jpa.dao;

import java.util.List;

import fr.eni.jpa.bean.Region;

public interface IRegionRepository {

	List<Region> findAll();

}
