package skillbuilders;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) 
	{
		        //Declaration 
				int length;
				int width;
				int area;
				
				//Create Scanner object 
				Scanner userinput = new Scanner(System.in);
				
				// Get user input from keyboard (Width first)
				System.out.print("Enter width: ");
				width = userinput.nextInt();
				
				// Get user input from keyboard (then length)
				System.out.print("Enter length: ");
				length = userinput.nextInt();
				
				// specify formula for area
				area = (2 * width) + (2 * length);
				// Print Perimeter of Rectangle
				System.out.println("Perimeter of the Rectangle is: " + area);
	}

}
