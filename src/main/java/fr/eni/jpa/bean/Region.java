package fr.eni.jpa.bean;
import javax.persistence.Entity;

@Entity
public class Region{

	private int id;
	private String nom;
	
	public Region() {
		super();
	}
	public Region(int id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	@Override
	public String toString() {
		return "Region [id=" + id + ", nom=" + nom + "]";
	}

	

}
