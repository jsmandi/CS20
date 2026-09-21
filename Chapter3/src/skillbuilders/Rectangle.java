package skillbuilders;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) 
	{
		//Declaration 
				int length;
				int width;
<<<<<<< master
				int area;
				int perimeter;
=======
>>>>>>> 4cd51c2 9:40 AM
				
				//Create Scanner object 
				Scanner userinput = new Scanner(System.in);
				
				// Get user input from keyboard
				System.out.print("Enter width: ");
				width = userinput.nextInt();
				
				// 
				System.out.print("Enter length: ");
				length = userinput.nextInt();
<<<<<<< master
				
				// specify formula for area and perimeter
				perimeter = (2 * width) + (2 * length);
				area = length * width;
				
				// Print Perimeter and Area of Rectangle
				System.out.println("Perimeter of the Rectangle is: " + perimeter);
				System.out.println("Area of the Rectangle is: " + area);
=======
>>>>>>> 4cd51c2 9:40 AM
	}

}
