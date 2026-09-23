package skillbuilders;
import java.util.Scanner;
import java.util.Random;

public class RandomNum {

	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		Random RandomNumber = new Random();
		
		System.out.print("Enter minimum value: ");
        int min = userinput.nextInt();

        System.out.print("Enter maximum value: ");
        int max = userinput.nextInt();

	}

}
