import javax.swing.JOptionPane;


public class Runner {

	public static void main(String[] args) {

		int intBase10 = 0;
		String hexAnswer = "";
		boolean cont = true;
		String keepGoing = "";
		
		Runner myRunner = new Runner();
		Converter myConverter = new Converter();
		
		myRunner.welcome();
		
		while (cont) {
			
			intBase10 = myRunner.enterInteger();

			hexAnswer = myConverter.changeToHex(intBase10);
			
			JOptionPane.showMessageDialog(null, "0-255 entry: " + intBase10 + ", hex conversion: " + hexAnswer);
			keepGoing = JOptionPane.showInputDialog("Would you like to enter another number? Yes or No");
			
			if (keepGoing.equals("Y")) {
				
			}
			else {
				cont = false;
			}
			
		}

	}

	private int enterInteger() {
		
		boolean cont = false;
		int number = 0;
		while (!cont) {
			number = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number between 0 and 255"));
			if (number < 0 || number > 255) {
				JOptionPane.showMessageDialog(null, "It needs to be a number between 0 and 255!");
			}
			else {
				cont = true;
			}
		}
		
		
		return number;
	}

	private void welcome() {
		JOptionPane.showMessageDialog(null,
				"Welcome, this program converts base-10 integers " + "between 0-255 to hexadecimal");
	}

}
