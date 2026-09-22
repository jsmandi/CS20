package mastery;

import java.util.Scanner;

public class Change {

	public static void main(String[] args) {
		//Scan User Input for an Amount
		Scanner userinput = new Scanner(System.in);
		
		System.out.print("Enter an amount of change less than $1.00 (as a whole number): ");
		
		// Declare what is considered a cent, quarter, dime nickels and pennies are and what the formula to get them are.
		int cents = userinput.nextInt();
		
		int quarters = cents / 25;
		cents %= 25;
		
		int dimes = cents / 10;
        cents %= 10;
        
        int nickels = cents / 5;
        cents %= 5;
        
        int pennies = cents;
        
        // Print out final quarter dimes nickels and pennies
        System.out.println("Minimum coins needed:");
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: " + pennies);

	}

}
