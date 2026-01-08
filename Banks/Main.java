// Izveidojiet 'while' ciklu, kas ļauj lietotājam veikt vairākas darbības pēc kārtas. Izejot no cikla lietotājs ir beidzis darbu.
// Ar 'switch..case' apstrādājiet naudas pievienošanu, noņemšanu un balansa attēlošanu.
// Iesākumā katrā no darbībām izvadiet tekstu pārliecinoties, ka izvēlnes strādā.

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Scanner myobj = new Scanner(System.in);
        Internetbank bank = null;
        boolean condition = true;
        String accountName = "";
        Account account = null;
       // ArrayList<String> accounts = new ArrayList<String>();

        System.out.println("Welcome to your Ineternetbank!");

        mainLoop:
        do{

        while(true){
            if(accountName.isEmpty()){
                System.out.println("You are not logged in!");
                System.out.println("Registration. Write your name -->");
                try{
                accountName = myobj.nextLine();
                bank = new Internetbank(accountName);
                //accounts.add(account);
                }
                catch(InputMismatchException e){
                    System.out.println("Wrong Input Type!");
                    myobj.nextLine(); 
                    continue;
                }
            } else { break; }
        }
            System.out.println("Choose an option: (Deposit, Withdraw, Log out, Balance)");
            String process = myobj.nextLine();

            switch(process.toLowerCase()){

                case "balance" :
                    bank.balance();
                    break;
                case "deposit" :
                    bank.deposit();
                    break;
                case "withdraw" :
                    bank.withdraw();
                    break;
                case "log out":
                case "logout" :
                    System.out.println("Goodluck!");
                    break mainLoop;             

                default:
                    System.out.println("Inccorect option! Choose beetween: (Deposit, Withdraw, Log out, Balance)");

            }

        } while (condition);

    }
}