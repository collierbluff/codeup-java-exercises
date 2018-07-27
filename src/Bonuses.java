import java.util.Arrays;
import java.util.Scanner;

public class Bonuses {

    public static Scanner sc = new Scanner(System.in);


    public static void main(String[] args){

//        String input = "Apricots, Eagles, and Counts";

//        countVowels(input);

//        System.out.println(capitalLetters(input));

//        System.out.println(getType(32));

//        pointless("\nWhy would we ever use this method?\n");

//        System.out.println(isPalindrome("Palindrome"));

//        System.out.println(wordToNum("twenty-three"));

//        calculator();

//        timeConversion();

//        hangman();

//        dateConverter();
    }

    public static void dateConverter(){

        System.out.println("Please enter a date in MM/DD/YYYY format:");

        String inputDate = sc.nextLine().trim();

        String months[] = new String[]{
                "Pointless String", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"
        };

        String dateArr[] = inputDate.split("/");

        int month = Integer.parseInt(dateArr[0]);
        int day = Integer.parseInt(dateArr[1]);
        int year = Integer.parseInt(dateArr[2]);

        System.out.println(months[month] + " " + day + ", " + year);


    }

    public static void hangman(){

        System.out.println("\nPlayer 1, please enter a word:\n");

        String wordToGuess = sc.nextLine().toUpperCase().trim();

        StringBuilder guessedLetters = new StringBuilder();
        int guessCount = 9;
        boolean playing = true;

        while (playing) {

            System.out.println("Current Visible Letters: ");
            for (int i = 0; i < wordToGuess.length(); i++) {

                if (guessedLetters.toString().contains(wordToGuess.substring(i, i + 1))) {

                    System.out.print(" " + wordToGuess.charAt(i) + " ");
                } else {
                    System.out.print(" _ ");
                }
            }

            System.out.println("\n\nPreviously guessed letters: " + guessedLetters + "\n");

            System.out.println("You have " + guessCount + (guessCount > 1 ? " guesses": " guess") + " remaining!");

            System.out.println("\nPlayer 2, Guess a letter or try to solve!\n");

            String guess = sc.nextLine().toUpperCase().trim();

            if (guess.length() > 1){

                if(guess.equals(wordToGuess)){
                    System.out.println("Game Over! Player 2 Wins!\n\n");

                    playing = false;
                }

            }else {
                guessedLetters.append(guess);}


            if (--guessCount == 0){

                System.out.println("Game Over! Player 1 Wins!\n\n");

                playing = false;
            }

        }

        System.out.println("Want to play again? (y/n)");

        String yN = sc.nextLine();

        if (yN.equalsIgnoreCase("y")){

            hangman();
        }



    }

    public static void timeConversion(){

        boolean am;

        System.out.println("What kind of time will you enter? (12/24)");

        int mode = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter a time to convert (Formatted with a :) \n");

        String startTime = sc.nextLine();

        if (mode == 24){

            String timeArr[] = startTime.split(":");

            int left = Integer.parseInt(timeArr[0]);

            int right = Integer.parseInt(timeArr[1]);

            if (right == 0){}

            if (left > 12){
                am = false;
                left -= 12;

            }else{am = true;}

            System.out.println(left + ":" + (right == 0 ? "00" : right) + (am ? "am" : "pm"));

        }else if (mode == 12){

            int left = Integer.parseInt(startTime.substring(0,startTime.indexOf(":")));

            int right = Integer.parseInt(startTime.substring(startTime.indexOf(":") + 1, startTime.indexOf("m") - 1 ));
            am = startTime.contains("am");

            if (!am){left += 12;}


            System.out.println(left + ":" + (right == 0 ? "00" : right));

        }

    }

    public static void calculator(){

boolean goAgain = false;

        do {
            double total = 0;

            System.out.println("Please enter some math: ");

            String math = sc.nextLine();

            String mathArr[] = math.split(" ");

            double a = Double.parseDouble(mathArr[0]);

            char operator = mathArr[1].charAt(0);

            double b = Double.parseDouble(mathArr[2]);

            switch (operator) {

                case '+':
                    total = add(a, b);
                    break;
                case '-':
                    total = subtract(a, b);
                    break;
                case '*':
                    total = multiply(a, b);
                    break;
                case '/':
                    total = divide(a, b);
                    break;
                case '%':
                    total = modulus(a, b);
                    break;
                default:
                    System.out.println("Invalid Operator!");
            }

            System.out.println("Total: " + total);

            System.out.println("Want to calculate something else? (y/n)");

            String yN = sc.nextLine();

            if(yN.equalsIgnoreCase("y")){
                goAgain = true;
            }else{goAgain = false;}

        }while(goAgain);
    }

    public static double add(double a, double b){

        return a + b;
    }

    public static double subtract(double a, double b){

        return a - b;
    }

    public static double multiply(double a, double b){

        return a * b;
    }

    public static double divide(double a, double b){

        return (a / b);
    }

    public static double modulus(double a, double b){

        return (a % b);
    }

    public static int wordToNum(String input){

//        Notably breaks if the input includes a bigNum string but not a hyphenated addition (twenty-three works, twenty doesn't)

        String[] num = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

        String[] bigNum = new String[]{"twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

        input = input.toLowerCase().trim();

        int output = 0;

        if (input.contains("-")){

            int tens;

            String inputArr[] = input.split("-");

            input = inputArr[1];

            switch (Arrays.asList(bigNum).indexOf(inputArr[0])) {

                case 0: tens = 20; break;
                case 1: tens = 30; break;
                case 2: tens = 40; break;
                case 3: tens = 50; break;
                case 4: tens = 60; break;
                case 5: tens = 70; break;
                case 6: tens = 80; break;
                case 7: tens = 90; break;
                default: tens = 0;

            }

            output += tens;
        }

        output += Arrays.asList(num).indexOf(input);

        return output;
    }


    public static boolean isPalindrome(String input){

        input = input.toLowerCase();

        String reverse = "";

        for (int i = input.length() - 1; i >= 0; i--){

            reverse += input.charAt(i);
        }

        System.out.println(reverse);

        return input.equals(reverse);

    }

    public static void pointless(String input){

        if(input.length() == 0){

            return;
        }

        System.out.print(input.charAt(0));

        pointless(input.substring(1));

    }

    public static String getType(String input){

        return "String";
    }

    public static String getType(int input){

        return "Integer";
    }

    public static String getType(boolean input){

        return "Boolean";
    }

    public static String getType(char input){

        return "Character";
    }

    public static String getType(double input){

        return "Double (Decimal)";
    }

    public static int capitalLetters(String input){

        int count = 0;

        for (int i = 0; i < input.length(); i++){

            if((input.toUpperCase().charAt(i) == input.charAt(i)) && input.charAt(i) !=' ' && input.charAt(i) != ',')
            {count++;}
        }

        return count;
    }

    public static int countVowels(String input){

        int count = 0;

        System.out.println(input);

        count += countAs(input);
        System.out.print("| A: " + countAs(input) + " ");
        count += countEs(input);
        System.out.print("| E: " + countEs(input) + " ");
        count += countIs(input);
        System.out.print("| I: " + countIs(input) + " ");
        count += countOs(input);
        System.out.print("| O: " + countOs(input) + " ");
        count += countUs(input);
        System.out.print("| U: " + countUs(input) + " | ");

        System.out.println("Total: " + count);

        return count;
    }


    public static int countAs(String input){

        int count = 0;

        for (int i = 0; i < input.length(); i++){

            if(input.toLowerCase().charAt(i) == 'a'){count++;}
        }

        return count;
    }

    public static int countEs(String input){

        int count = 0;

        for (int i = 0; i < input.length(); i++){

            if(input.toLowerCase().charAt(i) == 'e'){count++;}
        }

        return count;
    }

    public static int countIs(String input){

        int count = 0;

        for (int i = 0; i < input.length(); i++){

            if(input.toLowerCase().charAt(i) == 'i'){count++;}
        }

        return count;
    }

    public static int countOs(String input){

        int count = 0;

        for (int i = 0; i < input.length(); i++){

            if(input.toLowerCase().charAt(i) == 'o'){count++;}
        }

        return count;
    }

    public static int countUs(String input){

        int count = 0;

        for (int i = 0; i < input.length(); i++){

            if(input.toLowerCase().charAt(i) == 'u'){count++;}
        }

        return count;
    }

}
