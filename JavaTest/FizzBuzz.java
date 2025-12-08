// 5.uzdevums: Izveidojiet programmu FizzBuzz
// Programmai jāpieprasa lietotājam ievadīt veselu skaitli ar Scanner.nextInt()
//     Ja skaitlis dalās gan ar 3, gan ar 5 (dalāmība ar 15) – izvadīt "FizzBuzz".
//     Ja skaitlis dalās tikai ar 3 – izvadīt "Fizz".
//     Ja skaitlis dalās tikai ar 5* – izvadīt "Buzz".
//     Pretējā gadījumā – izvadīt pašam skaitlim (kā tekstu).

import java.util.Scanner;

public class FizzBuzz{

    public static void main(String[] args){
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter number --> ");
        byte userInput = myobj.nextByte();
        String result = (userInput % 3 == 0 && userInput % 5 == 0) ? "FizzBuzz" 
        : (userInput % 3 == 0) ? "Fizz" 
        : (userInput % 5 == 0) ? "Buzz" : String.valueOf(userInput);

        System.out.println(result);

        

    }

}