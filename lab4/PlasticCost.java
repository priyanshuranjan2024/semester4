import java.util.Scanner;

class TwoD {
    double length, width;

    TwoD(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculateCost() {
        return length * width * 40; // Rs 40 per square foot
    }
}

class ThreeD extends TwoD {
    double height;

    ThreeD(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    @Override
    double calculateCost() {
        return length * width * height * 60; // Rs 60 per cubic foot
    }
}

public class PlasticCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter dimensions for 2D (length and width):");
        double length2D = sc.nextDouble();
        double width2D = sc.nextDouble();
        TwoD sheet = new TwoD(length2D, width2D);
        System.out.println("Cost of 2D plastic sheet: Rs " + sheet.calculateCost());

        System.out.println("Enter dimensions for 3D (length, width, and height):");
        double length3D = sc.nextDouble();
        double width3D = sc.nextDouble();
        double height3D = sc.nextDouble();
        ThreeD box = new ThreeD(length3D, width3D, height3D);
        System.out.println("Cost of 3D plastic box: Rs " + box.calculateCost());

        sc.close();
    }
}
