import java.util.Scanner;

public class App {
static final Scanner inputScanner = new Scanner(System.in);



private static String getString(String prompt) {
    System.out.printf(prompt);
    String stringGet = inputScanner.nextLine();
    return stringGet;
}

private static double getDouble(String prompt) {
    System.out.printf(prompt);
    double doubleGet = inputScanner.nextDouble();
    return doubleGet;
}

public static void main(String[] args) {
    while(true) {
        double num1 = getDouble("Enter first number: ");
        double num2 = getDouble("Enter second number: ");

        Calculator calculator = new Calculator();
        double resultAdd = calculator.add(num1, num2);
        System.out.printf("%.1f + %.1f = %.1f%n", num1, num2, resultAdd);

        double resultSub = calculator.subtract(num1, num2);
        System.out.printf("%.1f - %.1f = %.1f%n", num1, num2);

        double resultMult = calculator.multiply(num1, num2);
        System.out.printf("%.1f * %.1f = %.1f%n", num1, num2, resultMult);

        double resultDiv = calculator.divide(num1, num2);
        System.out.printf("%.1f / %.1f = %.1f%n", num1, num2, resultDiv);
        
        String status = getString("Continue? y/n");
        if (status.equals("n")) {
            System.out.printf("Goodbye");
            break;
        }

    }
}



}