import java.util.Scanner;

class Rectangle {
    double length, breadth;

    void read(Scanner sc) {
        System.out.println("Enter length and breadth of the rectangle:");
        length = sc.nextDouble();
        breadth = sc.nextDouble();
    }

    double calculateArea() {
        return length * breadth;
    }

    double calculatePerimeter() {
        return 2 * (length + breadth);
    }

    void display() {
        System.out.println("Area of the rectangle: " + calculateArea());
        System.out.println("Perimeter of the rectangle: " + calculatePerimeter());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rect = new Rectangle();
        rect.read(sc);
        rect.display();
        sc.close();
    }
}
