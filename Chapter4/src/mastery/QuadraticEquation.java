package mastery;

import java.util.Scanner;

public class QuadraticEquation {

	public static void main(String[] args) {
		
		// Declaration
		int a;
		int b;
		int c;
		double root1;
		double root2;
		
		// Scanner Setup
		Scanner userinput = new Scanner(System.in);
		
		
		// Ask user for a, b and c
		System.out.print("Enter Value For A: ");
        a = userinput.nextInt();
		
        System.out.print("Enter Value For B: ");
        b = userinput.nextInt();
        
        System.out.print("Enter Value For C: ");
        c = userinput.nextInt();
        
        // Quadratic Formula written in code
        root1 = (-b + Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
        root2 = (-b - Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
        
        // Print out the roots
        System.out.printf("The roots are " + root1);
        System.out.printf(" and " + root2);


	}

}
