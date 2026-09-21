package mastery;

import java.util.Scanner;

public class PizzaCost {

	public static void main(String[] args) {
		
		// Declaration.
		
		double LaborCost = 0.75;
		double RentCost = 1.00;
		double diameter;
		double materials;
		double cost;
		
		// Setup Scanner
		
		Scanner userinput = new Scanner(System.in);
		
		// Input Diameter
		
		System.out.print("Enter the diameter of the Pizza in inches: ");
		diameter = userinput.nextInt();
		
		// Cost Formula
		materials = 0.05* diameter * diameter;
		cost = materials + LaborCost + RentCost;
		// Output Cost
		
		System.out.printf("The Cost of making the Pizza is: $%.2f%n", cost);

	}

}
