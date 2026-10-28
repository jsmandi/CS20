package mastery;

import java.util.Scanner;

public class MySavings {

    public static class PiggyBank {
        private double total;

        public PiggyBank() {
            total = 0.0;
        }
        // Define Pennies, nickels, dime and quarters
        public void addPenny() { total += 0.01; }
        public void addNickel() { total += 0.05; }
        public void addDime() { total += 0.10; }
        public void addQuarter() { total += 0.25; }

        public void takeMoneyOut() {
            total = 0.0;
            System.out.println("The bank is empty!");
        }

        public double getTotal() {
            return total;
        }
    }

    public static void main(String[] args) {
        
        Scanner userinput = new Scanner(System.in);
        PiggyBank bank = new PiggyBank();
        int choice = -1;
        // choose
        while (choice != 0) {
            System.out.println("\n1. Show total in bank.");
            System.out.println("2. Add a penny.");
            System.out.println("3. Add a nickel.");
            System.out.println("4. Add a dime.");
            System.out.println("5. Add a quarter.");
            System.out.println("6. Take money out of bank.");
            System.out.println("Enter 0 to quit");
            System.out.print("Enter your choice: ");
            
            choice = userinput.nextInt();
            // Depending on number inputed, the value is different
            if (choice == 1) {
                System.out.printf("Total in bank: $%.2f\n", bank.getTotal());
            } else if (choice == 2) {
                bank.addPenny();
            } else if (choice == 3) {
                bank.addNickel();
            } else if (choice == 4) {
                bank.addDime();
            } else if (choice == 5) {
                bank.addQuarter();
            } else if (choice == 6) {
                bank.takeMoneyOut();
            }
        }
        System.out.println("Goodbye!");
        userinput.close();
    }
}
