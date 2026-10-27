package skillbuilders;

public class CirclesP3of4 {

    public static class Circle {
        private double radius;

        //  constructor
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

        
        public double circumference() {
            return 2 * Math.PI * radius;
        }

        // Area method
        public double area() {
            return Math.PI * Math.pow(radius, 2);
        }

        /**
         * Class method (static) that prints the formula for a circle's area.
         */
        public static void displayAreaFormula() {
            System.out.println("The formula for the area of a circle is A = Pi * r * r");
        }
    }

    public static void main(String[] args) {
      
        Circle spot = new Circle(5.0);

        
        System.out.println("Circle radius: " + spot.getRadius());
        System.out.println("Circle circumference: " + spot.circumference());
        System.out.println("Circle area: " + spot.area());

        System.out.println(); 

       
        Circle.displayAreaFormula();
    }
}
