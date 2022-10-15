/**
 * Class Dessert
 * @author Christopher Bittner
 * created: 10/14/2022
 */
public class Dessert {
	private static String name;
	private static String description;
	private static int calories;
	
	public Dessert(String name, String description, int calories) {
		Dessert.name= name;
		Dessert.description= description;
		Dessert.calories= calories;
	}
	
	public static String getDName() {
		return name;
	}
	
	public void setDName(String name) {
		Dessert.name=name;
	}
	
	public static String getDDesc() {
		return description;
	}
	
	public void setDDesc(String description) {
		Dessert.description=description;
	}
	
	public static int getDCals() {
		return calories;
	}
	
	public void setDCals(int calories) {
		Dessert.calories=calories;
	}
}
