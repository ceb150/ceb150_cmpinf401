import javax.swing.JOptionPane;

public class OddOrEven {

	public static void main(String[] args) {
		String userInput=JOptionPane.showInputDialog("Please enter a number: ");
		int userInputInt=Integer.parseInt(userInput);
		
		if(userInputInt%2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
	}

}
