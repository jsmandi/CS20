package skillbuilders;
import java.util.Scanner;
import java.util.Random;

public class RandomNum {

	public static void main(String[] args) {
		
		// Declare scanner and Random Number
		Scanner userinput = new Scanner(System.in);
		Random RandomNumber = new Random();
		
		// Ask User for Minimum Number
		System.out.print("Enter minimum value: ");
        int min = userinput.nextInt();

        // Ask User for Maximum Number
        System.out.print("Enter maximum value: ");
        int max = userinput.nextInt();
        
        // Use RandomNumber to get random number of those two numbers (i had to use AI i didnt know how to use random number)
        int result = RandomNumber.nextInt((max - min) + 1) + min;
        
        // print random number
        System.out.printf("Your random number is: " + result);
        
        

	   }

	}


