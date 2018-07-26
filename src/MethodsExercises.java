import java.util.Scanner;

public class MethodsExercises {

     public static Scanner sc = new Scanner(System.in);


    public static void main(String[] args){



//        Part 1:
        int a = 5;
        int b = 2;
//
//        System.out.println("Add: " + add(a,b));
//        System.out.println("Subtract: " + subtract(a,b));
//        System.out.println("Multiply: " + multiply(a,b));
//        System.out.println("Divide: " + divide(a,b));
//        System.out.println("Modulus: " + modulus(a,b));

//        Part 2:
//        int input = getInteger(1, 10);

//        Part 3:
//        factorial();

//        Part 4:
//        roll();


    }


//    Part 1:

    public static int add(int a, int b){

        return a + b;
    }

    public static int subtract(int a, int b){

        return a - b;
    }

//    Bonus: multiply without *

    public static int multiply(int a, int b){

        int total = 0;

        for(int i = 1; i <= b; i++){

            total += a;
        }

        return total;
    }

    public static double divide(double a, double b){

        return (a / b);
    }

    public static int modulus(int a, int b){

        return (a % b);
    }

//    Part 2:

    public static int getInteger(int min, int max){

        System.out.println("Please enter a number between " + min + " and " + max);

        int num = sc.nextInt();
        sc.nextLine();

        if (num < min){

            getInteger(min, max);
        }else if (num > max){

            getInteger(min, max);
        }

        return num;
    }

//    Part 3:

    public static void factorial(){

        boolean looping = true;

        while(looping) {

            int input = getInteger(1, 25);

            long total = 1;

            StringBuilder output = new StringBuilder();

            for(int i = 1; i <= input; i++){

                total = total * i;

                if(i == input){
                    output.append(i);
                }else {
                    output.append(i).append(" x ");
                }
            }

            System.out.println(input + "! = " + output + " = " + total);


            System.out.println("Want to continue? (y/n)");

            char yN = sc.nextLine().charAt(0);

            if(yN == 'n'){
                looping = false;
            }

        }


    }

//    Part 4:

    public static void roll(){

        System.out.println("Please choose how many sides are on your die:");

        int diceSides = sc.nextInt();
        sc.nextLine();

        System.out.println("Wanna roll the dice? (y/n)");

        char yN = sc.next().charAt(0);
        sc.nextLine();
        boolean rolling = (yN == 'y');

        while(rolling) {

            System.out.println("You rolled a " + (int)((Math.random() * diceSides) + 1) + " and a " + (int)((Math.random() * diceSides) + 1));

            System.out.println("Roll again? (y/n)");

            yN = sc.next().charAt(0);
            sc.nextLine();

            rolling = (yN == 'y');
        }

    }



}
