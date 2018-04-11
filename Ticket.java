import java.util.Scanner;

public class Ticket {
	
		private static int price;
		
		
		public Ticket (int price) {
		Ticket.price = price;
		}
		
		private static void setprice(int x) {
			price = x;
			
		}
		
		public static int getprice() {
		  return price;
		}

		public static void standardPrice() {
		  setprice(8);	  
		  System.out.println("Is it Wednesday? (Y/N)");
		  Scanner discount = new Scanner(System.in);
		  String x = discount.next();
		 if  (x.equals("Y") | x.equals("y")){
			 price = price - 2;
			 System.out.println("Your Discount Has Been Added, This Ticket Costs : £" + getprice());
		 discount.close();
		} if ( x.equals("N") | x.equals("n"))
			System.out.println("Come On A Wednesday for £2 Discount! This Ticket Costs : £" + getprice());
			discount.close();
		}
		

		public static void oapPrice(){
			  setprice(6);
			  System.out.println("Is it Wednesday? (Y/N)");
			  Scanner discount = new Scanner(System.in);
			  String x = discount.next();
			 if  (x.equals("Y") | x.equals("y")){
				 price = price - 2;
				 System.out.println("Your Discount Has Been Added, This Ticket Costs : £" + getprice());
			 discount.close();
			} if ( x.equals("N") | x.equals("n"))
				System.out.println("Come On A Wednesday for £2 Discount! This Ticket Costs : £" + getprice());
				discount.close();
			}
			
		
		public static void studentPrice() {
			  setprice(6);
			  System.out.println("Is it Wednesday? (Y/N)");
			  Scanner discount = new Scanner(System.in);
			  String x = discount.next();
			 if  (x.equals("Y") | x.equals("y")){
				 price = price - 2;
				 System.out.println("Your Discount Has Been Added, This Ticket Costs : £" + getprice());
			 discount.close();
			} if ( x.equals("N") | x.equals("n"))
				System.out.println("Come On A Wednesday for £2 Discount! This Ticket Costs : £" + getprice());
				discount.close();
			}
			
		
		public static void childPrice() {
			  setprice(4);
			  System.out.println("Is it Wednesday? (Y/N)");
			  Scanner discount = new Scanner(System.in);
			  String x = discount.next();
			 if  (x.equals("Y") | x.equals("y")){
				 price = price - 2;
				 System.out.println("Your Discount Has Been Added, This Ticket Costs : £" + getprice());
			 discount.close();
			} if ( x.equals("N") | x.equals("n"))
				System.out.println("Come On A Wednesday for £2 Discount! This Ticket Costs : £" + getprice());
				discount.close();
			}
			
		
		public static void exitMenu() {

			System.out.println("Thank you for using the Cinema System. \nPlease Come Back Soon.");

			System.exit(0);
		}


		public static void groupPrice() {
			System.out.println("Enter How Many Of Each Ticket You Require");
			System.out.println("OAP Ticket");
			Scanner total = new Scanner(System.in);
			int a = total.nextInt();
			System.out.println("Is it Wednesday? (Y/N)");
			Scanner discount = new Scanner(System.in);
			  String x = discount.next();
			if  (x.equals("Y") | x.equals("y")){
				 setprice(4);
			} else if (x.equals("N") | x.equals("n")) {
				setprice(6);
		}
			int oap = (a* price);
	
			System.out.println("Child Ticket");
			Scanner total2 = new Scanner(System.in);
			int b = total2.nextInt();
			System.out.println("Is it Wednesday? (Y/N)");
			Scanner discount2 = new Scanner(System.in);
			  String x2 = discount2.next();
			if  (x2.equals("Y") | x2.equals("y")){
				 setprice(2);
			} else if (x2.equals("N") | x2.equals("n")) {
				setprice(4);
		}
			int child = (b* price);

	
			System.out.println("Student");
			Scanner total3 = new Scanner(System.in);
			int c = total3.nextInt();
			System.out.println("Is it Wednesday? (Y/N)");
			Scanner discount3 = new Scanner(System.in);
			  String x3 = discount3.next();
			if  (x3.equals("Y") | x3.equals("y")){
				 setprice(4);
			} else if (x3.equals("N") | x3.equals("n")) {
				setprice(6);
		}
			int student = (c* price);
		
			System.out.println("Standard");
			Scanner total4 = new Scanner(System.in);
			int d = total4.nextInt();
			System.out.println("Is it Wednesday? (Y/N)");
			Scanner discount4 = new Scanner(System.in);
			  String x4 = discount4.next();
			if  (x4.equals("Y") | x4.equals("y")){
				 setprice(6);
			} else if (x4.equals("N") | x4.equals("n")) {
				setprice(8);
		}
			int standard = (d* price);
		
		System.out.println("The Total Cost Is: £" + (oap+child+student+standard));
		discount.close();
		total.close();
		discount2.close();
		total2.close();
		discount3.close();
		total3.close();
		discount4.close();
		total4.close();
		}
		
}