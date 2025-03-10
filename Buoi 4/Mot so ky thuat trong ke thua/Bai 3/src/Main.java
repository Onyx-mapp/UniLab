public class Main {
    abstract class Shape {
        protected String color;
        protected boolean filled;
        public Shape (String s, boolean b) {
            this.color = s;
            this.filled = b;
        }
        Shape() {}
        public String getColor() {
            return color;
        }
        public void setColor(String s) {
            this.color = s;
        }
        public boolean isFilled() {
            return filled;
        }
        public void setFilled(boolean b) {
            this.filled = b;
        }
        abstract public double getArea();
        abstract public double getPerimeter();
        abstract public String toString();
    }
    class Circle extends Shape {
        private double radius;
        public Circle (double r, String c, boolean b) {
            this.radius = r;
            this.color = c;
            this.filled = b;
        }

        public double getRadius() {
            return radius;
        }
        public void setRadius(double radius) {
            this.radius = radius;
        }
        public double getArea() {
            return radius * radius * 3.14;
        }
        public double getPerimeter() {
            return radius * 2 * 3.14;
        }
        public String toString() {
            return "Name: Circle, " + "Color: " + this.color + ", Filled: " + this.filled + ", Radius: " + this.radius;
        }
    }
    class Rectangle extends Shape {
        private double length;
        private double width;
        public Rectangle (double a, double b, String c, boolean d) {
            this.length = a;
            this.width = b;
            this.color = c;
            this.filled = d;
        }
        Rectangle () {}
        public double getLength() {
            return length;
        }
        public void setLength(double length) {
            this.length = length;
        }
        public double getWidth() {
            return width;
        }
        public void setWidth(double width) {
            this.width = width;
        }
        public double getArea() {
            return length * width;
        }
        public double getPerimeter() {
            return 2 * length + 2 * width;
        }
        public String toString() {
            return "Name: Rectangle, " + "Color: " + this.color + ", Filled: " + this.filled + ", Length: " + this.length + ", Width: " + this.width;
        }
    }
    class Square extends Rectangle {
        private double side;
        public Square (double r, String c, boolean b) {
            this.side = r;
            this.color = c;
            this.filled = b;
        }

        public double getSide() {
            return side;
        }
        public void setSide(double radius) {
            this.side = radius;
        }
        public double getArea() {
            return side * side * 3.14;
        }
        public double getPerimeter() {
            return side * 4;
        }
        public String toString() {
            return "Name: Square, " + "Color: " + this.color + ", Filled: " + this.filled + ", Side: " + this.side;
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}