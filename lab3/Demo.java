import java.util.Scanner;

class Box {
    double length, width, height;

    double volume() {
        return length * width * height;
    }
}

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Box box = new Box();
        System.out.println("Enter length, width, and height of the box:");
        box.length = sc.nextDouble();
        box.width = sc.nextDouble();
        box.height = sc.nextDouble();

        System.out.println("Volume of the box: " + box.volume());
        sc.close();
    }
}
