// 7.uzdevums
// Programmai jālasa un jāsaskaita veseli skaitļi, līdz lietotājs ievada 0 (0 kalpo kā “beigu” signāls).
// Lietotājs var ievadīt arī negatīvus skaitļus; tie tiek ignorēti, bet neaptur programmu.
//     continue: Ja ievadītais skaitlis ir negatīvs, izvadīt ziņojumu “Negatīvs skaitlis ignorēts” un turpināt nākamo iterāciju, nepievienojot šo skaitli summai.
//     break: Ja ievadītais skaitlis ir lielāks par 100, izvadīt ziņojumu “Skaitlis > 100 – cikls apturēts” un pārtraukt ciklu, neatverot turpmāku ievadi.

import java.util.Scanner;

public class Void{

    public static void main(String[] args){
        Scanner myobj = new Scanner(System.in);
        int result = 0;
        boolean condition = true;
        do{
            System.out.println("Ievadiet skaitli --> ");
            short input = myobj.nextShort();
            if(input < 0) {
                System.out.println("Negatīvs skaitlis ignorēts");
                continue;
            }
            if(input > 100){
                System.out.println("Skaitlis ir lielāks par 100, cikls apturēts");
                condition = false;
            }

            if(input == 0 ){
                System.out.println("GoodBye!");
                break;
            }

            result += input;

            System.out.println("Kopā --> " + result);


        } while(condition);


    }

}