package fr.eni.jpa.bean;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Bouteille {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String nom;
	private Boolean petillant;
	private String millesime;
	private int quantite;
	
	@OneToOne(cascade=CascadeType.ALL, orphanRemoval=true)
	private Couleur couleur;
	private Region region;
	
	public Bouteille() {
		super();
	}

	public Bouteille(int id, String nom, Boolean petillant, String millesime, int quantite, Couleur couleur,
			Region region) {
		super();
		this.id = id;
		this.nom = nom;
		this.petillant = petillant;
		this.millesime = millesime;
		this.quantite = quantite;
		this.couleur = couleur;
		this.region = region;
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

	public Boolean getPetillant() {
		return petillant;
	}

	public void setPetillant(Boolean petillant) {
		this.petillant = petillant;
	}

	public String getMillesime() {
		return millesime;
	}

	public void setMillesime(String millesime) {
		this.millesime = millesime;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public Couleur getCouleur() {
		return couleur;
	}

	public void setCouleur(Couleur couleur) {
		this.couleur = couleur;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}
	
	
}
