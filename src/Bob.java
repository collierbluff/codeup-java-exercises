import java.util.Scanner;

public class Bob {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Talk to Bob!");

        String input = sc.nextLine();

        if (input.equals("")){

            System.out.println("Fine. Be that way!");

        }else if (input.endsWith("?")){

            System.out.println("Sure.");

        }else if ((input.equals(input.toUpperCase())) || input.endsWith("!")){

            System.out.println("Whoa, chill out!");

        }else{

            System.out.println("Whatever.");

        }


    }


}
