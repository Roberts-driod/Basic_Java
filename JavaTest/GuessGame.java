import java.util.Scanner;

public class GuessGame{

    public static void main(String[] args){
        Scanner myobj = new Scanner(System.in);
        int rnd = (int)(Math.random() * 101); 
        byte HP = 10;
        int points = 0;
        boolean condition = true;
        String output = "";


        do{
            if(HP == 0){System.out.println("Jūs zaudējāt!"); System.out.println("Kopējais punktu skaits --> " + points); break; }

            System.out.println(rnd);
            System.out.println("Welcome To Guess Game!");
            System.out.println("Guess the number --> ");
            int guess = myobj.nextByte();

             output = guess > rnd ? "Ievadītais skaitlis ir lielāks par nezināmo!" :  guess < rnd ? "Ievadītais skaitlis ir mazāks par nezināmo!" 
             : "nezināmais skaitlis ir uzminēts!";

            System.out.println(output);

            if(guess == rnd){
                points += HP * 10;
                System.out.println("Vai turpināsi spēlēt? (Yes/No)");
                myobj.nextLine();
                String con = myobj.nextLine();

                if(con.equalsIgnoreCase("Yes")){
                    HP = 10;
                    rnd = (int)(Math.random() * 101); 
                } else {
                 System.out.println("Kopējais punktu skaits -->  " + points);
                 break;
                 }

            } else{  HP -= 1; }


        }while(condition);
    }

}