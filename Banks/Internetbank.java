

// 1.udz.  lietotājam ir 4 izvēlnes: pievienot un izņemt naudu, apskatīt balansu, iziet.
import java.util.Scanner;
import java.util.InputMismatchException;

public class Internetbank extends Account{
    private Scanner myobj = new Scanner(System.in);

    public Internetbank(String name){
        super(name);
    }

    public void balance(){
         System.out.println("Balance  " + super.balance + "$");
    }

    public void withdraw(){
        System.out.println("Enter withdraw sum");
        try{
            double sum = myobj.nextDouble();
            if(sum > super.balance){
                System.out.println("Insufficient funds!");
            } else {
                super.balance -= sum;
            }
        } catch(InputMismatchException e){
            System.out.println("Wrong input type!");
            myobj.nextLine();
        }
    }

    public void deposit(){
        System.out.println("Enter deposit sum");
        try{
            double sum = myobj.nextDouble();
            super.balance += sum;
        } catch(InputMismatchException e){
            System.out.println("Wrong input type!");
            myobj.nextLine();
        }
    }


}