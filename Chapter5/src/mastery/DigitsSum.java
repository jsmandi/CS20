package mastery;
import java.util.Scanner;

public class DigitsSum {

	public static void main(String[] args) {
		// Scanner Setup
		Scanner userinput = new Scanner(System.in);
		
		// Ask user for input
		System.out.print("Enter a number: ");
        int t = userinput.nextInt();
        
        int sum = 0;
        
        // Loop from 1 up to number written
        for (int i = 1; i <= t; i++) {
            sum += i; // Adds the current number to the total sum
        }
        
        System.out.println("The sum from 1 to " + t + " is: " + sum);
		
	}

}
