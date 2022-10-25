/**
 * Class Salad
 * @author Christopher Bittner
 * created: 10/14/2022
 */
public class Salad {
	private String name;
	private String description;
	private int calories;
	
	public Salad(String name, String description, int calories) {
		this.name= name;
		this.description= description;
		this.calories= calories;
	}
	
	public String getSaName() {
		return name;
	}
	
	public void setSaName(String name) {
		this.name=name;
	}
	
	public String getSaDesc() {
		return description;
	}
	
	public void setSaDesc(String description) {
		this.description=description;
	}
	
	public int getSaCals() {
		return calories;
	}
	
	public void setSaCals(int calories) {
		this.calories=calories;
	}
}
