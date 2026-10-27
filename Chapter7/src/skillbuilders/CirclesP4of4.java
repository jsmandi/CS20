package skillbuilders;

public class CirclesP4of4 {

    public static class Circle {
        private double radius;

        // Default constructor
        public Circle() {
            this.radius = 0;
        }

        // Overloaded constructor
        public Circle(double radius) {
            this.radius = radius;
        }

        
        public void setRadius(double radius) {
            this.radius = radius;
        }

        
        public double getRadius() {
            return this.radius;
        }

        // Circumference method
        public double circumference() {
            return 2 * Math.PI * radius;
        }

        // Area method
        public double area() {
            return Math.PI * Math.pow(radius, 2);
        }

        // Class method from Part 3
        public static void displayAreaFormula() {
            System.out.println("The formula for the area of a circle is A = Pi * r * r");
        }

        
        @Override
        public String toString() {
            return "Circle [Radius = " + this.radius + "]";
        }

        
        @Override
        public boolean equals(Object obj) {
            // If they point to the exact same memory address, they are equal
            if (this == obj) {
                return true;
            }
            // If the passed object is null or not a Circle class, they cannot be equal
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
         
            Circle other = (Circle) obj;
            return Double.compare(this.radius, other.radius) == 0;
        }
    }

    public static void main(String[] args) {
        // Instantiate test objects
        Circle circle1 = new Circle(4.5);
        Circle circle2 = new Circle(4.5);
        Circle circle3 = new Circle(7.0);

        System.out.println("Testing toString() ");
        // Passing the objects directly to println automatically calls their toString() method
        System.out.println("Circle 1: " + circle1);
        System.out.println("Circle 2: " + circle2);
        System.out.println("Circle 3: " + circle3);

        System.out.println("\nTesting equals()");
        // Test matching objects
        System.out.println("Does circle1 equal circle2? " + circle1.equals(circle2)); // Expected: true
        
        // Test non-matching objects
        System.out.println("Does circle1 equal circle3? " + circle1.equals(circle3)); // Expected: false
    }
}
