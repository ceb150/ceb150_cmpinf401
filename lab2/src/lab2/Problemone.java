package lab2;

import javax.swing.JOptionPane;

public class Problemone {

	public static void main(String[] args) {
		
		String userInputOne=JOptionPane.showInputDialog("Enter side length: ");
		String userInputTwo=JOptionPane.showInputDialog("Enter another side length: ");

		double inputOne=Double.parseDouble(userInputOne);
		double inputTwo=Double.parseDouble(userInputTwo);
		
		double result= Math.sqrt(Math.pow(inputOne,2)+Math.pow(inputTwo, 2));
		double mresult= result*100;
		double rresult=Math.round(mresult);
		double hypotenuse= rresult/100;
		JOptionPane.showMessageDialog(null,"The hypotenus is: " + hypotenuse);
		
		

	}

}
