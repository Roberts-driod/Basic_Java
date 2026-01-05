

public class CalculateMortgage{
private final static byte MONTH_IN_YEAR = 12;
private final static byte PERCENT = 100;
private double sum;
private float proc;
private int year;

    public CalculateMortgage(double sum, float proc, int year){
        this.sum = sum;
        this.proc = proc;
        this.year = year;
    }

    public  double calculate(){
       float procent = (this.proc/PERCENT)/MONTH_IN_YEAR;
       int months = this.year * MONTH_IN_YEAR;
       double result = this.sum * (procent * Math.pow((1 + procent),months)) / (Math.pow((1+procent),months) -1);

       return Math.round(result);
    }
}
