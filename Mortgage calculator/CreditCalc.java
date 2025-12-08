

public class CreditCalc{
public final static byte MONTH_IN_YEAR = 12;
public final static byte PERCENT = 100;

    public static double calculateMortgage(double sum, float proc, int year){
       float procent = (proc/PERCENT)/MONTH_IN_YEAR;
       int months = year * MONTH_IN_YEAR;
       double result = sum * (procent * Math.pow((1 + procent),months)) / (Math.pow((1+procent),months) -1);

       return Math.round( result);
       
    }

}