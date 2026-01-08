import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("|===> Hipotekārā kredīta kalkulators <===|\n");

        int totalCreditSum = (int) validateInput(
                "Ievadiet kredīta summu: ", 1_000, 1_000_000, "Kredīta summai jābūt robežās no 1'000 līdz 1'000'000\n");

        float yearlyPercentageRate = validateInput(
                "Ievadiet gada procentu likmi: ", 0, 30, "Procentu likmei jābūt robežās no 0 līdz 30\n");

        int years = (int) validateInput(
                "Ievadiet periodu gados: ", 1, 30, "Periodam jābūt robežās no 1 līdz 30\n");

        double monthlyMortgagePayment = calculateMortgage(totalCreditSum, yearlyPercentageRate, years);

        System.out.println("Ikmēneša maksājums: " + monthlyMortgagePayment + " EUR");
        scanner.close();
    }

    public static double calculateMortgage(int credit, float yearlyPercentageRate, int years) {
        final byte MONTH_IN_YEAR = 12;
        final byte PERCENT = 100;

        // https://www.luminor.lv/lv/privatpersonam/hipotekara-kredita-kalkulators
        int months = years * MONTH_IN_YEAR;
        float monthlyRate = yearlyPercentageRate / PERCENT / MONTH_IN_YEAR;
        double futureValueInterestFactor = Math.pow((1 + monthlyRate), months);

        double monthlyMortgagePayment = credit * (monthlyRate * futureValueInterestFactor)
                / (futureValueInterestFactor - 1);

        return (double) Math.round(monthlyMortgagePayment * 100d) / 100d; // two digits after the decimal point
    }

    public static float validateInput(String prompt, int lowLimit, int highLimit, String errorMessage) {
        float input;
        while (true) {
            System.out.print(prompt);
            input = scanner.nextFloat();

            if (input >= lowLimit && input <= highLimit)
                break;

            System.out.print(errorMessage);
        }

        return input;
    }
}