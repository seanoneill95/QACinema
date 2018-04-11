import java.util.Scanner;

public class Age_Ticket {

	public static void checkAge() {
		  System.out.println("Please Enter Your Age");
		  Scanner ageScanner = new Scanner(System.in);
		  int age = ageScanner.nextInt();
		  if (age>=65) {
			  System.out.println("You Qualify For An OAP Ticket");
			  Ticket.oapPrice();
		  } else if (age <= 12) {
			  System.out.println("You Qualify For a Child Ticket");
			  Ticket.childPrice();
		  } else if (age >12 && age < 65) {
			  System.out.println("Are You A Student? (Y/N)");
			  Scanner student = new Scanner(System.in);
			  String x = student.next();
				 if  (x.equals("Y") | x.equals("y")){
					 System.out.println("You Qualify For A Student Ticket");
					 Ticket.studentPrice();
				 } else if  (x.equals("N") | x.equals("n")){
						 System.out.println("You Qualify For A Standard Ticket");
						 Ticket.standardPrice();
						 student.close();
			  ageScanner.close();
			}
		  }
		}
	}
