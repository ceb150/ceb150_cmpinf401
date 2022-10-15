
public class MenuTest {

	public static void main(String[] args) {

		Entree Spaghetti= new Entree("Spaghetti","Spaghettti noodles with maranara sauce and meatballs.",400 );
		Entree Steak= new Entree("Steak","Thick and juicy cut of steak cooked to your liking.",690);
		Side Beans= new Side("Beans","Well-cooked and hearty beans.",40);
		Salad Caesar= new Salad("Caesar Salad","Lettuce mix, croutons, parm cheese and chicken.",90);
		Salad Mediterranean= new Salad("Mediterranean Salad","Lettuce mix, onions, tomatoes, cucumber, olives and feta cheese.",69);
		Dessert Cake= new Dessert("Birthday Cake","Very sweet icing on yellow cake.",150);
		Menu Weekdays= new Menu("Weekdays",Spaghetti,Mediterranean);
		Menu Weekends= new Menu("Weekends",Steak,Beans,Caesar,Cake);
		
		Weekdays.totalCalories();
		Weekdays.description();
		
		Weekends.totalCalories();
		Weekends.description();
		
		
	}

}
