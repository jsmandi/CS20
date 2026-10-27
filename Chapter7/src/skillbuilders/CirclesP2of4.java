package skillbuilders;

public class CirclesP2of4 {

    public static class Circle {
        private double radius;

    
        public Circle() {
            this.radius = 0;
        }

        // Overloaded constructor 
        public Circle(double radius) {
            this.radius = radius;
        }

        // Set radius method 
        public void setRadius(double radius) {
            this.radius = radius;
        }

        // Get radius method 
        public double getRadius() {
            return this.radius;
        }

        // Circumference
        public double circumference() {
            return 2 * Math.PI * radius;
        }
    }

    public static void main(String[] args) {
        //  default constructor
        Circle spot1 = new Circle();
        spot1.setRadius(3);
        System.out.println("Spot 1 radius: " + spot1.getRadius());
        System.out.println("Spot 1 circumference: " + spot1.circumference());
        // Print blank line
        System.out.println(); 

       
        Circle spot2 = new Circle(5.5);
        System.out.println("Spot 2 radius: " + spot2.getRadius());
        System.out.println("Spot 2 circumference: " + spot2.circumference());
    }
}
