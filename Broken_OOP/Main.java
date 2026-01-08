import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static float readInput(String text, float min, float max) {
        float num;

        while (true) {
            try {
                System.out.print(text);
                num = scanner.nextFloat();

                if (num >= min || num <= max)
                return num;
            } catch (Exception e) {
                System.out.println("Nepareiza ievade!");
                scanner.nextLine();
            }
        }

    }

    public static void main(String[] args) {

        System.out.print("|===> Hipotekārā kredīta kalkulators <===|\n");

        int totalCreditSum = (int) readInput("Ievadiet kredīta summu: ", 1_000, 1_000_000);

        float yearlyPercentageRate = (float) readInput("Ievadiet gada procentu likmi: ", 0.1f, 30f);

        int years = (int) readInput("Ievadiet periodu gados: ", 1, 30);

        var rounded = new MortgageCalculator(totalCreditSum, yearlyPercentageRate, years);
        double roundedMonthlyMortgagePayment = rounded.calculateMortgage();

        System.out.println("Ikmēneša maksājums: " + roundedMonthlyMortgagePayment + " EUR");

        scanner.close();
    }

}