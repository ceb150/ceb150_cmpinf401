package lab2;

import javax.swing.JOptionPane;

public class Problemtwo {

	public static void main(String[] args) {
		
		String userRad=JOptionPane.showInputDialog("Enter a radius: ");
		double r=Double.parseDouble(userRad);
		
		double p=2*Math.PI*r;
		double a=Math.PI*r*r;
		JOptionPane.showMessageDialog(null,"The circle with radius "+r+" has an area of "+a+" and a perimeter of "+p);

	}

}
