package mastery;

public class House {

	public static void main(String[] args) {
        // Declare all methods
		addRoof();
        addBase();
        addWalk();
    }
	// Roof method
    public static void addRoof() {
    	System.out.println("   /\\  ");
    	System.out.println("  /  \\ "); 
    	System.out.println(" /    \\ "); 
    	System.out.println("/______\\"); 
    	
    }
    // method of base of house
    public static void addBase() {
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("|______|");
        System.out.println("   **   ");
    }
    // Method for driveway/walk
    public static void addWalk() {
        System.out.println("   ***********   ");
        
    }
}
