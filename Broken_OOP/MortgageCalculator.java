
public class MortgageCalculator {
    int totalSum;
    float precentage;
    int year;

    public MortgageCalculator(int totalCreditSum,float yearlyPercentageRate, int years) {
        this.totalSum = totalCreditSum ;
        this.precentage = yearlyPercentageRate;
        this.year = years;
    }

    public double calculateMortgage() {
        final byte MONTH_IN_YEAR = 12;
        final byte PERCENT = 100;

        int months = year * MONTH_IN_YEAR;
        float monthlyRate = precentage / PERCENT / MONTH_IN_YEAR;

        double factor = Math.pow(1 + monthlyRate, months);

        double monthlyMortgagePayment = totalSum * (monthlyRate * factor) / (factor - 1);

        return Math.round(monthlyMortgagePayment * 100d) / 100d;
    }
}