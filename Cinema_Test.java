import java.util.Scanner;

public class Cinema_Test {
	
	public static void main (String [] args) {

		    
		Scanner menuChoice = new Scanner (System.in);
		System.out.println("Welcome to the Cinema" + "\nPlease Enter a Number to Choose an Option: \n\n1) Buy A Ticket \n2) Group Purchase \n3) Exit the Menu");

		/**
		 * This do-while statement enables the switch statement to run the menu on repeat as long as integer values are input.
		 * The menu is linked to the scanner so the integer entry corresponds to the switch statement cases. Each case runs one 
		 * of the established methods from the Ticket class. The default prints the error message if an integer which isn't
		 * 1-3 is input. The if statement checks that the input is an integer and if not will prompt the user to enter another value.
		 */

		boolean valid = false;
		do {

			if (menuChoice.hasNextInt()) {
				int number = menuChoice.nextInt();

				switch(number) {
				case 1: Age_Ticket.checkAge(); valid = true; break;
				case 2: Ticket.groupPrice(); valid = true; break;
				case 3: Ticket.exitMenu(); valid = true; break;
				default: System.out.println("ERROR: Please enter a number which corresponds with an option\n"); main(null);

				}
			} else {
				System.out.println("ERROR: Please enter a number which corresponds with an option\n"); main(null);
			}
		}
		while (valid == false);
		menuChoice.close();
		    }
		  }