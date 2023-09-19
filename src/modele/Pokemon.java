package modele;

public class Pokemon {
	protected int id;
	protected String nom;
	protected String types;
	protected double weight;
	protected double height;
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double d) {
		this.weight = d;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
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
	public String getTypes() {
		return types;
	}
	public void setTypes(String types) {
		this.types = types;
	}
	
}
