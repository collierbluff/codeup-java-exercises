public class RestaurantTest {

    public static void main(String[] args) {

        RestaurantDish dish = new RestaurantDish(2000, "Pizza", true);

        dish.setCostInCents(1800);

        dish.setNameOfDish("Large Pizza");


        System.out.println(dish.getCostInCents());
        System.out.println(dish.getNameOfDish());
        System.out.println(dish.isWouldRecommend());


        dish.eat();


    }





}
