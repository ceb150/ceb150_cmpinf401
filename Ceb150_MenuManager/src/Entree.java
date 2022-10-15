/**
 * Class Entree
 * @author Christopher Bittner
 * created: 10/14/2022
 */
public class Entree {
	private static String name;
	private static String description;
	public static int calories;
	
	public Entree(String name, String description, int calories) {
		Entree.name= name;
		Entree.description= description;
		Entree.calories= calories;
	}
	
	public static String getEName() {
		return name;
	}
	
	public void setEName(String name) {
		Entree.name=name;
	}
	
	public static String getEDesc() {
		return description;
	}
	
	public void setEDesc(String description) {
		Entree.description=description;
	}
	
	public static int getECals() {
		return calories;
	}
	
	public void setECals(int calories) {
		Entree.calories=calories;
	}
	
	
}
