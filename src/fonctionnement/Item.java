package fonctionnement;
/** Item général, que ce soit de Baro ou Prime **/
public class Item {

	private int prix;
	private String nom;

	public Item(int prix, String nom) {
		this.prix = prix;
		this.nom = nom;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Item [prix=" + prix + ", nom=" + nom + "]";
	}

}
