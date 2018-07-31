package movies;


import util.Input;

import java.util.Arrays;

public class MoviesApplication {

   private static Input input = new Input();

    public static void main(String[] args) {

        boolean exit = false;

        Movie[] movies = MoviesArray.findAll();


        while (!exit) {


            System.out.println();

            System.out.println("Would you rather: \n0: exit \n1: view all movies \n2: view animated movies\n3: view drama movies\n4: view horror movies\n5: view scifi movies");

            int choice = input.getInt(0, 5);

            if (choice == 0){exit = true;}
            else if (choice == 1){
                for (int i = 0; i < movies.length; i++){
                    System.out.println(movies[i].getName() +" -- " + movies[i].getCategory());
                }
            }else if (choice == 2){
                for (int i = 0; i < movies.length; i++){
                    if(movies[i].getCategory().equals("animated")) {
                        System.out.println(movies[i].getName() + " -- " + movies[i].getCategory());
                    }
                }
            }else if (choice == 3){
                for (int i = 0; i < movies.length; i++){
                    if(movies[i].getCategory().equals("drama")) {
                        System.out.println(movies[i].getName() + " -- " + movies[i].getCategory());
                    }
                }
            }else if (choice == 4){
                for (int i = 0; i < movies.length; i++){
                    if(movies[i].getCategory().equals("horror")) {
                        System.out.println(movies[i].getName() + " -- " + movies[i].getCategory());
                    }
                }
            }else if (choice == 5){
                for (int i = 0; i < movies.length; i++){
                    if(movies[i].getCategory().equals("scifi")) {
                        System.out.println(movies[i].getName() + " -- " + movies[i].getCategory());
                    }
                }
            }

        }

        System.out.println("Goodbye!");


    }

}
