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

        String input = scanner.nextLine();
        int output = 0;

        try {
            output = Integer.valueOf(input);
        }catch (Exception e){
            System.out.println("That wasn't an Integer!");
            return getInt();
        }

        return output;

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

        String input = scanner.nextLine();
        double output = 0;

        try {
            output = Double.valueOf(input);
        }catch (Exception e){
            System.out.println("That wasn't a Double!");
            return getDouble();
        }

        return output;

    }
}
