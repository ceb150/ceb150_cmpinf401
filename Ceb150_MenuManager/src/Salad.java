/**
 * Class Salad
 * @author Christopher Bittner
 * created: 10/14/2022
 */
public class Salad {
	private static String name;
	private static String description;
	private static int calories;
	
	public Salad(String name, String description, int calories) {
		Salad.name= name;
		Salad.description= description;
		Salad.calories= calories;
	}
	
	public static String getSaName() {
		return name;
	}
	
	public void setSaName(String name) {
		Salad.name=name;
	}
	
	public static String getSaDesc() {
		return description;
	}
	
	public void setSaDesc(String description) {
		Salad.description=description;
	}
	
	public static int getSaCals() {
		return calories;
	}
	
	public void setSaCals(int calories) {
		Salad.calories=calories;
	}
}
