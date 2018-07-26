import java.util.Arrays;

public class Bonuses {

    public static void main(String[] args){

//        String input = "Apricots, Eagles, and Counts";

//        countVowels(input);

//        System.out.println(capitalLetters(input));

//        System.out.println(getType(32));

//        pointless("\nWhy would we ever use this method?\n");

//        System.out.println(isPalindrome("Palindrome"));

        System.out.println(wordToNum("twenty-three"));


    }

    public static int wordToNum(String input){

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
