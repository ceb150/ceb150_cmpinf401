import javax.swing.JOptionPane;

public class UnitConverter {

	public static void main(String[] args) {

		String userInput=JOptionPane.showInputDialog("Enter a distance or weight: ");
		
		String[] parts = userInput.split(" ");
		String value = parts[0];
		String unit = parts[1];
		
		double userDouble = Double.parseDouble(value);
		double newDouble = 0;
		
		switch(unit) {
		case "in":
			unit="cm";
			newDouble=userDouble*2.54;
			break;
		case "cm":
			unit="in";
			newDouble=userDouble*0.393701;
			break;
		case "m":
			unit="yd";
			newDouble=userDouble*1.09361;
			break;
		case "yd":
			unit="m";
			newDouble=userDouble*0.9144;
			break;
		case "oz":
			unit="g";
			newDouble=userDouble*28.3495;
			break;
		case "g":
			unit="oz";
			newDouble=userDouble*0.035274;
			break;
		case "lb":
			unit="kg";
			newDouble=userDouble*0.453592;
			break;
		case "kg":
			unit="lb";
			newDouble=userDouble*2.20462;
			break;
		default:
			System.out.println("ERROR. Try again.");
			break;
		}
		
		
		System.out.println(userInput + " = " + newDouble + " " + unit);
		
		
		
	}

}
