package fonctionnement;

import java.util.HashMap;
import java.util.Map.Entry;

public class User {

	private HashMap<Item, Integer> besoins;

	public User() {
		besoins = new HashMap<Item, Integer>();
	}

	/** Total des besoins en ducats de l'utlisateur **/
	public int getPrixBesoins() {
		int total = 0;
		for (Entry<Item, Integer> need : besoins.entrySet()) {
			total += need.getValue() * need.getKey().getPrix();
		}
		return total;
	}

	/** Ajoute un item ou incremente son besoin en item **/
	public void ajouterItem(Item item) {
		if (!besoins.keySet().contains(item)) {
			besoins.put(item, 1);
		} else {
			Integer ancienBesoin = besoins.get(item);
			besoins.replace(item, ancienBesoin, ++ancienBesoin);
		}
	}

	/** Retire un item de la liste des besoins **/
	public void supprimerUnItem(Item item) {
		if (besoins.keySet().contains(item)) {
			Integer ancienBesoin = besoins.get(item);
			if (ancienBesoin == 1) {
				besoins.remove(item);
			} else {
				besoins.replace(item, ancienBesoin, --ancienBesoin);
			}
		}
	}

	public void supprimerToutItem(Item item) {
		besoins.remove(item);
	}

	public HashMap<Item, Integer> getBesoins() {
		return besoins;
	}

}
