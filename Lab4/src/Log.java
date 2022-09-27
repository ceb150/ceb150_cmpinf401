import javax.swing.JOptionPane;

public class Log {

	public static void main(String[] args) {

		int userLog=-1;
		int userBase=0;
		int floor=0;
		
		while(userLog<=0) {
		String userX= JOptionPane.showInputDialog("Please enter a value, greater than zero: ");
		userLog=Integer.parseInt(userX);
		}
		while(userBase<=1) {
		String userB= JOptionPane.showInputDialog("Please enter a base, greater than one: ");
		userBase=Integer.parseInt(userB);
		}
		while(userLog>=userBase) {
			userLog=userLog/userBase;
			floor++;
		}
		System.out.println("Y = "+floor);
		
	}

}
