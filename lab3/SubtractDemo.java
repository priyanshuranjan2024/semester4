class Calculator {
    int subtract(int a, int b) {
        return a - b;
    }

    double subtract(double a, double b) {
        return a - b;
    }

    int subtract(int a, int b, int c) {
        return a - b - c;
    }
}

public class SubtractDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Subtract two integers: " + calc.subtract(10, 5));
        System.out.println("Subtract two doubles: " + calc.subtract(12.5, 3.5));
        System.out.println("Subtract three integers: " + calc.subtract(20, 10, 5));
    }
}
