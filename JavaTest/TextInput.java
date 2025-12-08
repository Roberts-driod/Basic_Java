
import java.util.Scanner;

public class TextInput{
    
    public static void main(String[] args){
        Scanner myobj = new Scanner(System.in);

        System.out.println("Enter your username -->");
        String userName = myobj.nextLine();

        System.out.println("Your username is --> " + userName);

    }

}