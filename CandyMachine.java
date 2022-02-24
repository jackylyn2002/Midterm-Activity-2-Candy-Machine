package Activity2;

import java.util.Scanner;

public class CandyMachine {
	static Scanner keyboard = new Scanner(System.in);{
		
	}
	// Displays item choices	
	public static double displayChoices() {
		double price = -1;
		
		System.out.println("Here are your choices:");
		System.out.println("A. 	Frutos Candy 		36.00");
		System.out.println("B. 	Flat tops 		51.50");
		System.out.println("C. 	Pringles 		85.00");
		System.out.println("D. 	Doublemint 			18.75");
		System.out.println("E. 	Chocolate chip cookies 			71.90");
		
		System.out.println();
		System.out.print("Which would you like? Please choose a letter.");
		String choice = keyboard.next().toUpperCase(); 
		
		if(choice.equals("A")){
			price = 36.00;
			     return 36.00;
		}
		else if(choice.equals("B")){
			price = 51.50;
			return 51.50;
		}
		else if(choice.equals("C")){
			price = 85.00;
			return 85.00;
		}
		else if(choice.equals("D")){
			price = 18.75;
			return 18.75;
		}
		else if(choice.equals("E")) {
			price = 71.90;
			return 71.90;
		}
		else {
			return price;
		}
		 
	}
		// to dispense candy and return change
	public static void dispense(double moneyinserted, double candyPrice) {
		if(moneyinserted > candyPrice) {
			System.out.println("Vending...");
			System.out.println("Here is your candy!");
			double change = moneyinserted - candyPrice;
			System.out.println("Here's your "+change+" in change");
		}
		else {
			System.out.println("Sorry! You don't have enough money. Here's your "+moneyinserted+" back. Thank You!");
		}
	}
		
	public static void main(String[] args) {
		// Welcome statement of the Candy machine
		System.out.println("Welcome to Jacky's Candy Machine!");
		
		System.out.print("How much money do you have?");
		double moneyinserted = keyboard.nextDouble();
		
		double candyPrice = displayChoices();
		
		dispense(moneyinserted, candyPrice);

	}

}