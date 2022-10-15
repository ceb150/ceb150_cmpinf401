/**
 * Class Menu
 * @author Christopher Bittner
 * created: 10/14/2022
 */
public class Menu {
	private static String name;
	private Entree entree;
	private Salad salad;
	private Side side;
	private Dessert dessert;

	public Menu(String name) {
		Menu.name= name;
		this.entree= null;
		this.salad= null;
		this.side= null;
		this.dessert= null;
	}

	public Menu(String name, Entree entree, Salad salad) {
		Menu.name= name;
		this.entree= entree;
		this.side= null;
		this.salad= salad;
		this.dessert= null;
	}

	public Menu(String name, Entree entree, Side side, Salad salad, Dessert dessert) {
		Menu.name= name;
		this.entree= entree;
		this.side= side;
		this.salad= salad;
		this.dessert= dessert;
	}

	public void totalCalories() {
		int ECals=Entree.getECals();
		int SiCals=Side.getSiCals();
		int SaCals=Salad.getSaCals();
		int DCals=Dessert.getDCals();
		int totalCals= ECals+SiCals+SaCals+DCals;
		System.out.println("Total Calories: "+totalCals);
	}

	public void description() {
		String EName=Entree.getEName();
		String EDesc=Entree.getEDesc();
		String SiName=Side.getSiName();
		String SiDesc=Side.getSiDesc();
		String SaName=Salad.getSaName();
		String SaDesc=Salad.getSaDesc();
		String DName=Dessert.getDName();
		String DDesc=Dessert.getDDesc();
		System.out.println("Entree: "+EName+". "+EDesc+"\nSide: "+SiName+". "+SiDesc+"\nSalad: "+SaName+". "+SaDesc+"\nDessert: "+DName+". "+DDesc);

	}

	public static String getMName() {
		return Menu.name;
	}

}
