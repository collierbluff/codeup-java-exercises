import java.util.Scanner;

public class ControlFlowExercises {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        char confirm = 'y';

while(confirm == 'y') {

    System.out.println("Please enter a grade to translate: ");
    byte input = sc.nextByte();

    if (input > 87) {
        System.out.println("That's an A");
    } else if (input > 79) {
        System.out.println("That's a B");
    } else if (input > 66) {
        System.out.println("That's a C");
    } else if (input > 59) {
        System.out.println("That's a D");
    } else {
        System.out.println("That's an F");
    }

    System.out.println("Would you like to continue? (y/n)");

    String confirmationString = sc.next();

    confirm = confirmationString.charAt(0);


}


    }

}
