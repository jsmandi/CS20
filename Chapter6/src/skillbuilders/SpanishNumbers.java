package skillbuilders;
import java.util.Scanner;

public class SpanishNumbers {
	// Setup methods for numbers 1-10
	public static void uno(int number) {
	    if (number == 1) {
	        System.out.println("uno");
	    }
	}

	public static void dos(int number) {
	    if (number == 2) {
	        System.out.println("dos");
	    }
	}

	public static void tres(int number) {
	    if (number == 3) {
	        System.out.println("tres");
	    }
	}

	public static void cuatro(int number) {
	    if (number == 4) {
	        System.out.println("cuatro");
	    }
	}

	public static void cinco(int number) {
	    if (number == 5) {
	        System.out.println("cinco");
	    }
	}

	public static void seis(int number) {
	    if (number == 6) {
	        System.out.println("seis");
	    }
	}

	public static void siete(int number) {
	    if (number == 7) {
	        System.out.println("siete");
	    }
	}

	public static void ocho(int number) {
	    if (number == 8) {
	        System.out.println("ocho");
	    }
	}

	public static void nueve(int number) {
	    if (number == 9) {
	        System.out.println("nueve");
	    }
	}

	public static void diez(int number) {
	    if (number == 10) {
	        System.out.println("diez");
	    }
	}


	public static void main(String[] args) {
		// Scanner Setup
		Scanner userinput = new Scanner(System.in);
		// Ask for a digit to convert it to Spanish
		System.out.println("Enter an English Number to Convert it to a Spanish Number (1-10): ");
		int choice = userinput.nextInt();
        if (choice == 1) {
            uno(choice);
        } else if (choice == 2) {
            dos(choice);
        } else if (choice == 3) {
            tres(choice);
        } else if (choice == 4) {
            cuatro(choice);
        } else if (choice == 5) {
            cinco(choice);
        } else if (choice == 6) {
            seis(choice);
        } else if (choice == 7) {
            siete(choice);
        } else if (choice == 8) {
            ocho(choice);
        } else if (choice == 9) {
            nueve(choice);
        } else if (choice == 10) {
            diez(choice);
        } else {
            System.out.println("Invalid option selection.");
        }      
        userinput.close();
    } 


}


