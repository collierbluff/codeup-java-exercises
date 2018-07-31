import java.util.Random;

public class ServerNameGenerator {

    static String adjectives[] = new String[]{"Adamant", "Adroit", "Arcadian", "Baleful", "Comely", "Didactic", "Fastidious", "Judicious", "Luminous", "Pernicious"};

    static String nouns[] = new String[]{"Raptor", "Eagle", "Dragon", "Mongoose", "Porcupine", "Cacophony", "Ocelot", "Orchestra", "Magic", "Lookout"};

    static String random(String arrayName[]){

        Random random = new Random();

        return arrayName[random.nextInt(9)];

    }

    public static void main(String[] args) {

        System.out.println("Here is your server name:");

        System.out.println(random(adjectives) + "-" + random(nouns));
    }
}
