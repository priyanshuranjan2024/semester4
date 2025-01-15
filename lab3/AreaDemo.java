class Shape {
    double area(double radius) {
        return Math.PI * radius * radius;
    }

    double area(double base, double height) {
        return 0.5 * base * height;
    }

    double area(int side) {
        return side * side;
    }
}

public class AreaDemo {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println("Area of Circle: " + shape.area(5.0));
        System.out.println("Area of Triangle: " + shape.area(6.0, 8.0));
        System.out.println("Area of Square: " + shape.area(4));
    }
}
