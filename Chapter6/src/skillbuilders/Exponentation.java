package skillbuilders;
import java.util.Scanner;

public class Exponentation {

	public class PowerCalculator {

	    //  Use Methods powerOf()
	    public static int powerOf(int base, int exponent) {
	        return (int) Math.pow(base, exponent); 
	    }

	    public static void main(String[] args) {
	        Scanner userinput = new Scanner(System.in);

	        // Ask user for the two numbers
	        System.out.print("Enter the first number (base): ");
	        int firstNum = userinput.nextInt();

	        System.out.print("Enter the second number (power): ");
	        int secondNum = userinput.nextInt();

	        // Show result
	        int result = powerOf(firstNum, secondNum);
	        System.out.println(firstNum + " powerized by " + secondNum + " is: " + result);

	        userinput.close();
	    }
	}
}	
