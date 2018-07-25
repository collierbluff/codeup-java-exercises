import java.util.Scanner;

public class ControlFlowExercises {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter An Integer");

        int input = sc.nextInt();

        System.out.println("number   | squared | cubed");

        for (int i = 1; i <= input; i++){

            System.out.print(i + "        | ");
            System.out.print((i*i)+ "       | ");
            System.out.println(i*i*i);

        }

    }

}
