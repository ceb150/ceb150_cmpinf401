/**
 * Class Menu
 * @author Christopher Bittner
 * created: 10/14/2022
 */
public class Menu {
	private String name;
	private Entree entree;
	private Salad salad;
	private Side side;
	private Dessert dessert;

	public Menu(String name) {
		this.name= name;
		this.entree= null;
		this.salad= null;
		this.side= null;
		this.dessert= null;
	}

	public Menu(String name, Entree entree, Salad salad) {
		this.name= name;
		this.entree= entree;
		this.side= null;
		this.salad= salad;
		this.dessert= null;
	}

	public Menu(String name, Entree entree, Side side, Salad salad, Dessert dessert) {
		this.name= name;
		this.entree= entree;
		this.side= side;
		this.salad= salad;
		this.dessert= dessert;
	}

	public void totalCalories() {
		if(this.side==null) {
		int ECals=entree.getECals();
		int SaCals=salad.getSaCals();
		int totalCals=ECals+SaCals;
		System.out.println("Total Calories: "+totalCals);
		}else {
			int ECals=entree.getECals();
			int SaCals=salad.getSaCals();
			int SiCals=side.getSiCals();
			int DCals=dessert.getDCals();
			int totalCals=ECals+SaCals+SiCals+DCals;
			System.out.println("Total Calories: "+totalCals);
		}
		
	
	}

	public void description() {
		if(this.side==null) {
		String EName=entree.getEName();
		String EDesc=entree.getEDesc();
		String SaName=salad.getSaName();
		String SaDesc=salad.getSaDesc();
		System.out.println("Entree: "+EName+". "+EDesc+"\nSide: N/A.\nSalad: "+SaName+". "+SaDesc+"\nDessert: N/A.");

		}else {
			String EName=entree.getEName();
			String EDesc=entree.getEDesc();
			String SaName=salad.getSaName();
			String SaDesc=salad.getSaDesc();
			String SiName=side.getSiName();
			String SiDesc=side.getSiDesc();
			String DName=dessert.getDName();
			String DDesc=dessert.getDDesc();
			System.out.println("Entree: "+EName+". "+EDesc+"\nSide: "+SiName+". "+SiDesc+"\nSalad: "+SaName+". "+SaDesc+"\nDessert: "+DName+". "+DDesc);
		}
	}

	public String getMName() {
		return this.name;
	}

}
