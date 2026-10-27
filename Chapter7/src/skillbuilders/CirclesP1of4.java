package skillbuilders;

public class CirclesP1of4 {


    public static class Circle {
        private double radius;

        
        public Circle() {
            this.radius = 0;
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
    }

    
    public static void main(String[] args) {
        Circle spot = new Circle();

        spot.setRadius(3);
        System.out.println("Circle radius: " + spot.getRadius());
        System.out.println("Circle circumference: " + spot.circumference());
    }
}
