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
            
            if (this == obj) {
                return true;
            }
            
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
         
            Circle other = (Circle) obj;
            return Double.compare(this.radius, other.radius) == 0;
        }
    }

    public static void main(String[] args) {
  
        Circle circle1 = new Circle(4.5);
        Circle circle2 = new Circle(4.5);
        Circle circle3 = new Circle(7.0);

        System.out.println("Testing toString() ");
        
        System.out.println("Circle 1: " + circle1);
        System.out.println("Circle 2: " + circle2);
        System.out.println("Circle 3: " + circle3);

        System.out.println("\nTesting equals()");
       
        System.out.println("Does circle1 equal circle2? " + circle1.equals(circle2)); 
        
        
        System.out.println("Does circle1 equal circle3? " + circle1.equals(circle3));
    }
}
