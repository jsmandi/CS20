package skillbuilders;

public class RectangleP3of5 {

    public static class Rectangle {
        private double length;
        private double width;

        public Rectangle() {
            length = 0;
            width = 0;
        }

        public Rectangle(double l, double w) {
            length = l;
            width = w;
        }

        public void setLength(double l) { length = l; }
        public void setWidth(double w) { width = w; }
        public double getLength() { return length; }
        public double getWidth() { return width; }

        public double area() { return length * width; }
        public double perimeter() { return 2 * (length + width); }

        public static void displayAreaFormula() {
            System.out.println("Formula: A = length * width");
        }

       
        @Override
        public String toString() {
            return "Rectangle: " + length + " x " + width;
        }

        
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            
            Rectangle other = (Rectangle) obj;
            return length == other.length && width == other.width;
        }
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 4);
        Rectangle r2 = new Rectangle(5, 4);
        Rectangle r3 = new Rectangle(3, 2);

        // Test toString()
        System.out.println(r1);
        System.out.println(r3);

        // Test equals()
        System.out.println("r1 equals r2: " + r1.equals(r2)); // true
        System.out.println("r1 equals r3: " + r1.equals(r3)); // false
    }
}
