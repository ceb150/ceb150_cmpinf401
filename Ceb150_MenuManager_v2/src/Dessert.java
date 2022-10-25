/**
 * Class Dessert
 * @author Christopher Bittner
 * created: 10/14/2022
 */
public class Dessert {
	private String name;
	private String description;
	private int calories;
	
	public Dessert(String name, String description, int calories) {
		this.name= name;
		this.description= description;
		this.calories= calories;
	}
	
	public String getDName() {
		return name;
	}
	
	public void setDName(String name) {
		this.name=name;
	}
	
	public String getDDesc() {
		return description;
	}
	
	public void setDDesc(String description) {
		this.description=description;
	}
	
	public int getDCals() {
		return calories;
	}
	
	public void setDCals(int calories) {
		this.calories=calories;
	}
}
