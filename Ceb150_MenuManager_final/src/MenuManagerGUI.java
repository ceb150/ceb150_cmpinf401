import javax.swing.*;


public class MenuManagerGUI {
	
	private JFrame mainMenuWindow;
	private JLabel entree, side, salad, dessert;
	private JComboBox eBox,siBox,saBox,dBox;
	private JTextField text;
	private JButton wThese, random, minCal, maxCal;
	private JTextArea txts;
	private MenuManager menuM;
	private JFrame myMenu;
	
	public MenuManagerGUI() {
		menuM= new MenuManager();
		mainMenuWindow = new JFrame("Menu Manager");
		mainMenuWindow.setBounds(20,20,500,500);
		mainMenuWindow.setLayout(null);
		
		entree = new JLabel("Entree");
		entree.setBounds(10,10,80,30);
		mainMenuWindow.getContentPane().add(entree);
		
		eBox = new JComboBox(menuM.getEntrees().toArray());
		eBox.setBounds(entree.getX() + entree.getWidth(), entree.getY(), 150, 30);
		mainMenuWindow.getContentPane().add(eBox);
		
		side = new JLabel("Side");
		entree.setBounds(10,entree.getY()+entree.getHeight(),80,30);
		mainMenuWindow.getContentPane().add(side);
		
		siBox = new JComboBox(menuM.getSides().toArray());
		siBox.setBounds(side.getX() + side.getWidth(), side.getY(), 150, 30);
		mainMenuWindow.getContentPane().add(siBox);
		
		salad = new JLabel("Salad");
		salad.setBounds(10,side.getY()+entree.getHeight(),80,30);
		mainMenuWindow.getContentPane().add(salad);
		
		saBox = new JComboBox(menuM.getSalads().toArray());
		saBox.setBounds(salad.getX() + salad.getWidth(), salad.getY(), 150, 30);
		mainMenuWindow.getContentPane().add(saBox);
		
		dessert = new JLabel("Dessert");
		dessert.setBounds(10,salad.getY()+entree.getHeight(),80,30);
		mainMenuWindow.getContentPane().add(dessert);
		
		dBox = new JComboBox(menuM.getDesserts().toArray());
		dBox.setBounds(dessert.getX() + dessert.getWidth(), dessert.getY(), 150, 30);
		mainMenuWindow.getContentPane().add(dBox);
	}

	public static void main(String[] args) {

	}

}
