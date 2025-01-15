class Rectangle {
    double length, breadth;

    // Default Constructor
    Rectangle() {
        length = 0;
        breadth = 0;
    }

    // Parameterized Constructor
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double calculateArea() {
        return length * breadth;
    }

    void display() {
        System.out.println("Area of the rectangle: " + calculateArea());
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        System.out.println("Default Constructor:");
        rect1.display();

        Rectangle rect2 = new Rectangle(5.0, 3.0);
        System.out.println("Parameterized Constructor:");
        rect2.display();
    }
}
