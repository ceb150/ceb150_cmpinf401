package lab2;

import javax.swing.JOptionPane;

public class Problemthree {

	public static void main(String[] args) {

		String userMoney=JOptionPane.showInputDialog("Enter a dollar ammount from 1-9999: ");
		double money=Double.parseDouble(userMoney);
		double g=money/1000;
		double b=money%1000/100;
		double s=money%100/10;
		double c=money%10;
		
		JOptionPane.showMessageDialog(null,g+" grands\n"+b+" Benjamins\n"+s+" sawbucks\n"+c+" bucks");		
		
	}

}
