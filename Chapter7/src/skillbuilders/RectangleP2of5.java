package skillbuilders;

public class RectangleP2of5 {

    public static class Rectangle {
        private double length;
        private double width;

        // Default constructor
        public Rectangle() {
            this.length = 0;
            this.width = 0;
        }

        // Overloaded constructor
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

       
        public static void displayAreaFormula() {
            System.out.println("The formula for the area of a rectangle is A = length * width");
        }
    }

   
    public static void main(String[] args) {
      
        Rectangle.displayAreaFormula();
        System.out.println();

        
        Rectangle rect = new Rectangle(8.0, 4.5);
        System.out.println("Rectangle Length: " + rect.getLength());
        System.out.println("Rectangle Width: " + rect.getWidth());
        System.out.println("Rectangle Area: " + rect.area());
        System.out.println("Rectangle Perimeter: " + rect.perimeter());
    }
}
