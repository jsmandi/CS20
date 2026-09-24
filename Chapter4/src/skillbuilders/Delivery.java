package skillbuilders;
import java.util.Scanner;

public class Delivery {

	public static void main(String[] args) {
		// Declaration of variables
		int length;
		int width;
		int height;
		
		// Scanner Setup
		Scanner userinput = new Scanner(System.in);
		
		// Enter value for length width and height
		System.out.print("Enter the length of the Package: ");
		length = userinput.nextInt();
		
		System.out.print("Enter the width of the Package: ");
		width = userinput.nextInt();
		
		System.out.print("Enter the height of the Package: ");
		height = userinput.nextInt();
		 // Package under 10 rule setup
		 if (length > 10 || width > 10 || height > 10) {
	            System.out.println("Package Rejected: Dimensions exceed the limit.");
	        } else {
	            System.out.println("Package Accepted.");
	        }
			

	}

}
