package skillbuilders;

public class RectangleP1of5 {

    public static class Rectangle {
        //  variables
        private double length;
        private double width;

        //  Default constructor
        public Rectangle() {
            this.length = 0;
            this.width = 0;
        }

        //  Overloaded constructor 
        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        
        public void setLength(double length) {
            this.length = length;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        
        public double getLength() {
            return this.length;
        }

        public double getWidth() {
            return this.width;
        }

        
        public double area() {
            return this.length * this.width;
        }

       
        public double perimeter() {
            return 2 * (this.length + this.width);
        }
    }

    
    public static void main(String[] args) {
        System.out.println("Testing Default Constructor");
        Rectangle rect1 = new Rectangle();
        rect1.setLength(5.0);
        rect1.setWidth(4.0);
        System.out.println("Rectangle 1 Length: " + rect1.getLength());
        System.out.println("Rectangle 1 Width: " + rect1.getWidth());
        System.out.println("Rectangle 1 Area: " + rect1.area());
        System.out.println("Rectangle 1 Perimeter: " + rect1.perimeter());

        System.out.println("\n Testing Overloaded Constructor ");
        Rectangle rect2 = new Rectangle(10.5, 3.5);
        System.out.println("Rectangle 2 Length: " + rect2.getLength());
        System.out.println("Rectangle 2 Width: " + rect2.getWidth());
        System.out.println("Rectangle 2 Area: " + rect2.area());
        System.out.println("Rectangle 2 Perimeter: " + rect2.perimeter());
    }
}
