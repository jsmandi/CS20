package skillbuilders;
import java.util.Scanner;
public class NumbersSum {

	public static void main(String[] args) {
		 // scanner setup
        Scanner userinput = new Scanner(System.in);
        
        // Prompt the user for a number
        System.out.print("Enter a number: ");
        int userNumber = userinput.nextInt();
        
        // Declare Sum
        int sum = 0;
        
        // Loop from 1 through the entered number
        for (int i = 1; i <= userNumber; i++) {
            System.out.println(i);
            sum += i;              
        }
        
        // Print out sum at bottom
        System.out.println("The sum is: " + sum);
        

	}

}
