import java.util.Scanner;

class Plate {
    double length, width;

    Plate(double length, double width) {
        this.length = length;
        this.width = width;
        System.out.println("Plate dimensions: Length = " + length + ", Width = " + width);
    }
}

class Box extends Plate {
    double height;

    Box(double length, double width, double height) {
        super(length, width);
        this.height = height;
        System.out.println("Box dimensions: Height = " + height);
    }
}

class WoodBox extends Box {
    double thickness;

    WoodBox(double length, double width, double height, double thickness) {
        super(length, width, height);
        this.thickness = thickness;
        System.out.println("WoodBox dimensions: Thickness = " + thickness);
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter dimensions for WoodBox (length, width, height, thickness):");
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        double thickness = sc.nextDouble();

        WoodBox woodBox = new WoodBox(length, width, height, thickness);
        sc.close();
    }
}
