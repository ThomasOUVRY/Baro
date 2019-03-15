import java.util.HashMap;
import java.util.Map.Entry;

public class User {

	private HashMap<Integer, Integer> besoins;
	
	
	public User() {
		// TODO Auto-generated constructor stub
		besoins = new HashMap<Integer, Integer>();
	}
	
	public int getPrixBesoins() {
		int total = 0;
		for(Entry item : besoins.entrySet()) {
			
		}
		return total;
	}
	
	
}
