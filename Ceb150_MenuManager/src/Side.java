/**
 * Class Side
 * @author Christopher Bittner
 * created: 10/14/2022
 */
public class Side {
	private String name;
	private String description;
	private int calories;
	
	public Side(String name, String description, int calories) {
		this.name= name;
		this.description= description;
		this.calories= calories;
	}
	
	public String getSiName() {
		return name;
	}
	
	public void setSiName(String name) {
		this.name=name;
	}
	
	public String getSiDesc() {
		return description;
	}
	
	public void setSiDesc(String description) {
		this.description=description;
	}
	
	public int getSiCals() {
		return calories;
	}
	
	public void setSiCals(int calories) {
		this.calories=calories;
	}
}
