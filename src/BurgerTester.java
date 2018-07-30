public class BurgerTester {

    public static void main(String[] args) {

        BurgerTools burger = new BurgerTools("Pickles", 3, 10000);


        System.out.println(burger.averageDaysBeforeExpiration + burger.mostPopularTopping + burger.temperatureWhenCooked);
    }

}
