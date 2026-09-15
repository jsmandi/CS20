package skillbuilders;

import java.util.Scanner;

public class GradeAvgPt1 {

	public static void main(String[] args) {
		// Declaration of Grades
		
		int grade1;
		int grade2;
		int grade3;
		int grade4;
		int grade5;
		int average;
		
		// Scanner Setup
		
		Scanner userinput = new Scanner(System.in);
		
		//Get all five grades
		
		System.out.print("Grades Average Calculator\n");
		
		System.out.print("Enter your first grade: ");
		grade1 = userinput.nextInt();
		
		System.out.print("Enter your second grade: ");
		grade2 = userinput.nextInt();
		
		System.out.print("Enter your third grade: ");
		grade3 = userinput.nextInt();
		
		System.out.print("Enter your fourth grade: ");
		grade4 = userinput.nextInt();
		
		System.out.print("Enter your fifth grade: ");
		grade5 = userinput.nextInt();
		
		// Specify Averaging Formula for grades
		
		average = (grade1 + grade2 + grade3 + grade4) / 5;
		
		// Print Grade Average
		
		System.out.println("Your Average Grade is: " + average);
		
		

	}

}
