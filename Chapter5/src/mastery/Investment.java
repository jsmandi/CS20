package mastery;

public class Investment {

	public static void main(String[] args) {
		
		// Declaration
		double principal = 2500.0;
        double target = 5000.0;
        double interestRate = 0.075; // 7.5% annual interest
        int years = 0;
        
        // loop that calculates how long it will take the investment to grow to $5000
        while (principal < target) {
            principal += principal * interestRate;
            years++;
        }

        // Print amount of years
        System.out.println("It will take " + years + " years for the investment to be worth at least $" + target);
  

	}

}
