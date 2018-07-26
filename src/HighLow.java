import java.util.Scanner;

public class HighLow {

    public static Scanner sc = new Scanner(System.in);


    public static void main(String[] args){

        boolean playAgain;

        do{

            int randomNum = (int)((Math.random() * 100) + 1);

            System.out.println("We've chosen a random number. You get 20 guesses. Now start guessing!");

            boolean playing = true;

            int guessCount = 0;

            while(playing) {


                int guess = sc.nextInt();

                if(guess == randomNum){

                    System.out.println("GOOD GUESS! YOU WIN!");
                    playing = false;

                    guessCount++;
                    String numEnd = "th";

                    if(guessCount == 1){numEnd = "st";}
                    else if(guessCount == 2){numEnd = "nd";}
                    else if(guessCount == 3){numEnd = "rd";}

                    System.out.println("You won on your " + guessCount  + numEnd + " guess!");
                } else if(guessCount >= 19){

                    System.out.println("Wrong! That was your 20th guess! Game Over!");
                    playing = false;
                }else if (guess < randomNum){

                    System.out.println("HIGHER!");
                    System.out.println("You've guessed: " + ++guessCount + " times.");

                }else if (guess > randomNum){

                    System.out.println("LOWER!");
                    System.out.println("You've guessed: " + ++guessCount + " times.");

                }else{
                    System.out.println("What have you done!!!!");
                }
            }

            System.out.println("Want to play again? (y/n)");

            char yN = sc.next().charAt(0);
            sc.nextLine();

            playAgain = yN == 'y';

        }while(playAgain);



    }

}
