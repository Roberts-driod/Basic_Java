
import java.util.Scanner;

public class Calculator {
    // Basic operations
    static double add(double a, double b) { return a + b; }
    static double subtract(double a, double b) { return a - b; }
    static double multiply(double a, double b) { return a * b; }
    static double divide(double a, double b) {
        if (b == 0) throw new ArithmeticException("Cannot divide by zero");
        return a / b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Simple Java Calculator");
        while (true) {
            try {
                System.out.print("\nEnter first number (or 'q' to quit): ");
                String s = in.nextLine().trim();
                if (s.equalsIgnoreCase("q")) break;
                double a = Double.parseDouble(s);

                System.out.print("Enter operator (+ - * /): ");
                String op = in.nextLine().trim();
                if (op.equalsIgnoreCase("q")) break;

                System.out.print("Enter second number: ");
                double b = Double.parseDouble(in.nextLine().trim());

                double result;
                switch (op) {
                    case "+": result = add(a, b); break;
                    case "-": result = subtract(a, b); break;
                    case "*": result = multiply(a, b); break;
                    case "/": result = divide(a, b); break;
                    default:
                        System.out.println("Unknown operator. Use + - * /");
                        continue;
                }

                System.out.println("Result: " + result);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format. Try again.");
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
        System.out.println("Goodbye.");
    }
}
