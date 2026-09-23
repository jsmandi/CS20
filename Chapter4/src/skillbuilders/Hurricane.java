package skillbuilders;

import java.util.Scanner;

public class Hurricane {

	public static void main(String[] args) {
		
		// Scanner setup
		Scanner userinput = new Scanner(System.in);
		
		// Ask user for Hurricane Category
		System.out.print("Enter a hurricane category (1-5): ");
		int HurricaneCategory = userinput.nextInt();
	 	
		// Define what each category means, and to print whatever category user printed
		switch (HurricaneCategory) {
        case 1:
            System.out.println("74-95 mph, 64-82 kt, 119-153 kmh");
            break;
        case 2:
            System.out.println("96-110 mph, 83-95 kt, 154-177 kmh");
            break;
        case 3:
            System.out.println("111-130 mph, 96-113 kt, 178-209 kmh");
            break;
        case 4:
            System.out.println("131-155 mph, 114-135 kt, 210-249 kmh");
            break;
        case 5:
            System.out.println("greater than 155 mph, 135 kt, 249 kmh");
            break;
        default:
            System.out.println("Invalid category!");
		}

	}

}
