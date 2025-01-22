// Custom exception class
class CheckArgument extends Exception {
    public CheckArgument(String message) {
        super(message);
    }
}

public class ques5 {
    public static void main(String[] args) {
        try {
            if (args.length < 4) {
                throw new CheckArgument("Insufficient arguments. At least 4 arguments are required.");
            }

            int sumOfSquares = 0;
            for (int i = 0; i < 4; i++) {
                int number = Integer.parseInt(args[i]);
                sumOfSquares += number * number;
            }

            System.out.println("The addition of squares of the first four elements is: " + sumOfSquares);

        } catch (CheckArgument e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: All arguments must be integers.");
        }
    }
}
