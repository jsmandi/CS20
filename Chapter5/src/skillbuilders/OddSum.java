package skillbuilders;

import java.util.Scanner;

public class OddSum {

	public static void main(String[] args) {
		// Scanner Setup
		Scanner userinput = new Scanner(System.in);
		
		// asks user for number
		System.out.print("Enter a number: ");
        int t = userinput.nextInt();
        
        // declare sum
        int sum = 0;
        
        // loop to get the odd number
        for (int i = 1; i <= t; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }

        // Display the sums
        System.out.println("The sum of odd numbers from 1 to " + t + " is: " + sum);

        
	}

}
