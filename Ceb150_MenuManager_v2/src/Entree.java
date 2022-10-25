/**
 * Class Entree
 * @author Christopher Bittner
 * created: 10/14/2022
 */
public class Entree {
	private String name;
	private String description;
	public int calories;
	
	public Entree(String name, String description, int calories) {
		this.name= name;
		this.description= description;
		this.calories= calories;
	}
	
	public String getEName() {
		return name;
	}
	
	public void setEName(String name) {
		this.name=name;
	}
	
	public String getEDesc() {
		return description;
	}
	
	public void setEDesc(String description) {
		this.description=description;
	}
	
	public int getECals() {
		return calories;
	}
	
	public void setECals(int calories) {
		this.calories=calories;
	}
	
	
}
