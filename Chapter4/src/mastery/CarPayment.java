package mastery;

import java.util.Scanner;

public class CarPayment {

	public static void main(String[] args) {
		
		// Declarations
		double PrincipalOwning;
		double InterestRate;
		int MonthlyPayment;
		double CarPaymentFormula;
		
		// Scanner Setup
		Scanner userinput = new Scanner(System.in);
		
		// Ask User for Principal Owning, Interest Rate, Number of Monthly Payments
		System.out.print("Principal: ");
        PrincipalOwning = userinput.nextDouble();
		
        System.out.print("Interest Rate: ");
        InterestRate = userinput.nextDouble();
        
        System.out.print("Number of Monthly Payments: ");
        MonthlyPayment = userinput.nextInt();
        
        // Formula for Car Payment
        CarPaymentFormula = (PrincipalOwning * (InterestRate / 12.0)) / (1 - Math.pow(1 + (InterestRate / 12.0), -MonthlyPayment));
        
        //Print Monthly Payment
        System.out.printf("The monthly payment is: $%.2f%n", CarPaymentFormula);
        

	}

}
