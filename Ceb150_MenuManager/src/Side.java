/**
 * Class Side
 * @author Christopher Bittner
 * created: 10/14/2022
 */
public class Side {
	private static String name;
	private static String description;
	private static int calories;
	
	public Side(String name, String description, int calories) {
		Side.name= name;
		Side.description= description;
		Side.calories= calories;
	}
	
	public static String getSiName() {
		return name;
	}
	
	public void setSiName(String name) {
		Side.name=name;
	}
	
	public static String getSiDesc() {
		return description;
	}
	
	public void setSiDesc(String description) {
		Side.description=description;
	}
	
	public static int getSiCals() {
		return calories;
	}
	
	public void setSiCals(int calories) {
		Side.calories=calories;
	}
}
