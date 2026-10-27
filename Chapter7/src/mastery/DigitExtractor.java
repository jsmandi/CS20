package mastery;

import java.util.Scanner;

public class DigitExtractor {

    public static class Num {
        private int number;

        public Num(int number) {
            this.number = number;
        }

        public int getWhole() {
            return number;
        }

        public int getOnes() {
            return Math.abs(number) % 10;
        }

        public int getTens() {
            return (Math.abs(number) / 10) % 10;
        }

        public int getHundreds() {
            return (Math.abs(number) / 100) % 10;
        }
    }

    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int userNum = userinput.nextInt();
        Num numObj = new Num(userNum);
        
        char choice = ' ';

        while (choice != 'Q') {
            System.out.println("\nShow (W)hole number.");
            System.out.println("Show (O)nes place number.");
            System.out.println("Show (T)ens place number.");
            System.out.println("Show (H)undreds place number.");
            System.out.println("(Q)uit");
            System.out.print("Enter your choice: ");
            
            choice = userinput.next().toUpperCase().charAt(0);

            if (choice == 'W') {
                System.out.println("The whole number is: " + numObj.getWhole());
            } else if (choice == 'O') {
                System.out.println("The ones place digit is: " + numObj.getOnes());
            } else if (choice == 'T') {
                System.out.println("The tens place digit is: " + numObj.getTens());
            } else if (choice == 'H') {
                System.out.println("The hundreds place digit is: " + numObj.getHundreds());
            }
        }
        System.out.println("Goodbye!");
    }
}
