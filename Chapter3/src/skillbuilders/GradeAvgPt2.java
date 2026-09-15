package skillbuilders;

import java.util.Scanner;

public class GradeAvgPt2 {

	public static void main(String[] args) {
	    // Declaration of total sum variable
        
		int totalGrades = 0; 
        double average; 

        // Scanner Setup 
        
        Scanner userinput = new Scanner(System.in); 

        // Get all five grades and add them directly to the total
        
        System.out.print("Grades Average Calculator\n"); 

        System.out.print("Enter your first grade: "); 
        totalGrades += userinput.nextInt(); 

        System.out.print("Enter your second grade: "); 
        totalGrades += userinput.nextInt(); 

        System.out.print("Enter your third grade: "); 
        totalGrades += userinput.nextInt(); 

        System.out.print("Enter your fourth grade: "); 
        totalGrades += userinput.nextInt(); 

        System.out.print("Enter your fifth grade: "); 
        totalGrades += userinput.nextInt(); 

        // Formula for Average
        
        average = totalGrades / 5; 

        // Print Grade Average formatted as a percentage
        
        System.out.printf("Your Average Grade is: %.0f%%\n", average);
    

	}

}
