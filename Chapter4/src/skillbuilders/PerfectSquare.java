package skillbuilders;
import java.util.Scanner;


public class PerfectSquare {

	public static void main(String[] args) {
		// Declaration
		int num;
		
		// Scanner Setup
		Scanner userinput = new Scanner(System.in);
		
		System.out.print("Enter an integer to check if it is a Perfect Square: ");
		num = userinput.nextInt();
		

        // Find the square root as a whole number
        int root = (int) Math.sqrt(num);

        // Check if it multiplies back to the original number
        if (root * root == num) {
            System.out.println("It is a perfect square!");
        } else {
            System.out.println("It is NOT a perfect square.");
        }

	}

}
