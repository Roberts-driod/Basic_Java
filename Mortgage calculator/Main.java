
import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner myobj = new Scanner(System.in);
        double creditSum = 0;
        float procentLikme = 0;
        int termin = 0;

        System.out.println("Kredīta kalkulātors");
        var console = new Console();

        String  errorForSum = "Nepareiza Ievade! Ievade jābūt 1.000-100.000.0 robežās";
         creditSum = console.readInputDouble("Kredīta summa -->", 1000, 1000000, errorForSum);


        String errorForRate = "Neprareiza ievade! Ievade jābūt 0-20 robežās";
         procentLikme = console.readInputFloat("Gada procentu likme -->",0,20,errorForRate);


        String errorForYear = "Neprareiza ievade! Ievade jābūt 1-30 robežās";
         termin = console.readInputInt("Atmaksas termiņš(gados) -->",1,30,errorForYear);


        var credit0 = new CalculateMortgage(creditSum, procentLikme, termin);
        System.out.println(credit0.calculate());
    }

}