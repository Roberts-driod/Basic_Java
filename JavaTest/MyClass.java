import java.util.Scanner;

    public class MyClass{
        public static void main(String[] args){
        boolean result;
         Scanner myobj = new Scanner(System.in);
         System.out.println("Enter a number");
         int userInput = myobj.nextByte();

         String output = userInput % 2 == 0 ? "Even" : "Odd";

         System.out.println("The number is " + output);


        //  if(userInput % 2 > 0){
        //      result = true;
        //  } else { result = false; }

        //  if(result)
        //  {
        //     System.out.println("Number is Odd" );
        //  } else {System.out.println("Number is Even" ); }

        }
    }