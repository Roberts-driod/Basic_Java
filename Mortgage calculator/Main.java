
import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner myobj = new Scanner(System.in);
        System.out.println("Kredīta kalkulātors");

        System.out.println("Kredīta summa -->");
        double creditSum = myobj.nextDouble();
        System.out.println("Gada procentu likme -->");
        float procentLikme = myobj.nextFloat();
        System.out.println("Atmaksas termiņš(gados) -->");
        int termin = myobj.nextInt();
    }

}