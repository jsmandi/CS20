package skillbuilders;

import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
		
		 int twodigitnumber;
	
		 Scanner userinput = new Scanner(System.in);
		 
		 // Ask User user for a two digit number
		 System.out.print("Enter a two digit number:" );
		 twodigitnumber = userinput.nextInt();
		 
		 // Define what a tens place and ones place is
		 int tens = twodigitnumber / 10;
		 int ones = twodigitnumber % 10;
		 
		 // Print ones place and tens place of int
		 System.out.println("The tens place digit is: " + tens);
		 System.out.println("The ones place digit is: " + ones);
	}

}
