package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner = new Scanner(System.in);

    public String getString(){

        return scanner.nextLine();
    }

    public boolean yesNo(){

        System.out.println("Y/N?");

        String input = scanner.nextLine().trim().toLowerCase();

        return input.contains("y");
    }

    public int getInt(int min, int max){

//        System.out.println("Gimme a number between " + min + " and " + max + "!");
        int input = scanner.nextInt();
        scanner.nextLine();

        if (input >= min && input <= max){return input;}
        else{getInt(min, max);}

        return 0;
    }

    public int getInt(){
        System.out.println("Gimme a number!");

        int input = scanner.nextInt();
        scanner.nextLine();

        return input;

    }

    public double getDouble(double min, double max){

        System.out.println("Gimme a number between " + min + " and " + max + "!");
        double input = scanner.nextDouble();
        scanner.nextLine();

        if (input >= min && input <= max){return input;}
        else{getDouble(min, max);}

        return 0;
    }

    public double getDouble(){
        System.out.println("Gimme a number!");

        double input = scanner.nextDouble();
        scanner.nextLine();

        return input;

    }
}
