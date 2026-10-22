package mastery;

public class PerfectIntegers {

	public static void main(String[] args) {
		
		// Tests every number from 1-100
		for (int i = 1; i <= 100; i++) {
            if (isPerfect(i)) {
                System.out.println(i);
            }
        }
    }
	// The method using Boolean
    public static boolean isPerfect(int number) {
        if (number <= 1) {
            return false;
        }
        // Declare sum
        int sum = 0;
        // Loops for potientical factors
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum == number;
    }

}
