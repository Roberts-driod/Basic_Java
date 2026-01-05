
import java.util.Scanner;
import java.util.InputMismatchException;

public class Console{

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