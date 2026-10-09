package skillbuilders;

import java.util.Scanner;

public class TimeConverter {
	// Use Methods for each selection
    public static void HourstoMinutes(double hours) {
        double minutes = hours * 60;
        System.out.println(hours + " hours is equal to " + minutes + " minutes.");
    }

    public static void DaysToHours(double days) {
        double hours = days * 24;
        System.out.println(days + " days is equal to " + hours + " hours.");
    }

    public static void MinutestoHours(double minutes) {
        double hours = minutes / 60.0;
        System.out.println(minutes + " minutes is equal to " + hours + " hours.");
    }

    public static void HourstoDays(double hours) {
        double days = hours / 24.0;
        System.out.println(hours + " hours is equal to " + days + " days.");
    }

    public static void main(String[] args) {
        // Scanner Setup
    	Scanner userinput = new Scanner(System.in);

        System.out.println("Time Converter");
        System.out.println("1. Hours to Minutes");
        System.out.println("2. Days to Hours");
        System.out.println("3. Minutes to Hours");
        System.out.println("4. Hours to Days");
        System.out.print("Choose an option (1-4): ");
        
        // asks user to choose converter and enter amount of time
        int choice = userinput.nextInt();
        if (choice == 1) {
            System.out.print("Enter hours: ");
            HourstoMinutes(userinput.nextDouble());
        } else if (choice == 2) {
            System.out.print("Enter days: ");
            DaysToHours(userinput.nextDouble());
        } else if (choice == 3) {
            System.out.print("Enter minutes: ");
            MinutestoHours(userinput.nextDouble());
        } else if (choice == 4) {
            System.out.print("Enter hours: ");
            HourstoDays(userinput.nextDouble());
        } else {
            System.out.println("Invalid option selection.");
        }      
        userinput.close();
    }
}
