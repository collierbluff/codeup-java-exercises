public class BurgerTools {

    public String mostPopularTopping;
    public int averageDaysBeforeExpiration;
    public int temperatureWhenCooked;

    public BurgerTools(String topping, int daysBeforeExpiration, int temperature){

        mostPopularTopping = topping;
        averageDaysBeforeExpiration = daysBeforeExpiration;
        temperatureWhenCooked = temperature;

    }


    public void grill(){

        System.out.println("Grilling Burger");

    }

}
