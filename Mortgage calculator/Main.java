// 6.uzdevums
// Pilnveidojiet aplikāciju pievienojot ievades datu validāciju. 
// Kredīta summai jābūt robežās no 1_000 līdz 1_000_000.
// Procentu likmei jābūt robežās no 0 līdz 20.
// Periodam jābūt robežās no 1 līdz 30.
// Pēc nederīgas ievades lietotājam dod iespēju vērtību ievadīt atkārtoti līdz tā ir derīga.

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main{

    public static void main(String[] args){
        Scanner myobj = new Scanner(System.in);
        double creditSum = 0;
        float procentLikme = 0;
        int termin = 0;

        System.out.println("Kredīta kalkulātors");
        

        String  errorForSum = "Nepareiza Ievade! Ievade jābūt 1.000-100.000.0 robežās";
         creditSum = readInputDouble("Kredīta summa -->", 1000, 1000000, errorForSum);


        String errorForRate = "Neprareiza ievade! Ievade jābūt 0-20 robežās";
         procentLikme = readInputFloat("Gada procentu likme -->",0,20,errorForRate);


        String errorForYear = "Neprareiza ievade! Ievade jābūt 1-30 robežās";
         termin = readInputInt("Atmaksas termiņš(gados) -->",1,30,errorForYear);

        
        var credit0 = new CalculateMortgage(creditSum, procentLikme, termin);
        System.out.println(credit0.calculate());
    }

        public static double readInputDouble(String prompt, double min, double max, String errorMsg) {
        Scanner myobj = new Scanner(System.in);
        double variable0;
        while (true) {
        System.out.println(prompt);
        try {
            variable0 = myobj.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Wrong Input Type!");
            myobj.nextLine(); 
            continue;
            }
        if (variable0 < min || variable0 > max) {
            System.out.println(errorMsg);
        } else {
            return variable0;
                }
            }
        }


    public static float readInputFloat(String prompt, int min, int max, String errorMsg){
        var myobj = new Scanner(System.in);
        Float variable1;
         while(true){
        System.out.println(prompt);
        try {
            variable1 = myobj.nextFloat();
        } catch (InputMismatchException e) {
            System.out.println("Wrong Input Type!");
            myobj.nextLine(); 
            continue;
            }
        if(variable1 < min || variable1 > max){
            System.out.println(errorMsg);
        } else {return variable1; }
         }
    }

    public static int readInputInt(String prompt, int min, int max, String errorMsg){
        var myobj = new Scanner(System.in);
        int variable2;
         while(true){
        System.out.println(prompt);            
        try {
            variable2 = myobj.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Wrong Input Type!");
            myobj.nextLine(); 
            continue;
            }
        if(variable2 < min || variable2 > max){
            System.out.println(errorMsg);
        } else {return variable2; }
         }
    }

}