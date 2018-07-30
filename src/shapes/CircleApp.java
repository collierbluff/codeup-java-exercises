package shapes;

import util.Input;

public class CircleApp {


    public static void main(String[] args){

        Input input = new Input();
        boolean inNeedOfCircles;

        do {

            System.out.println("I need a radius...");

            double radius = input.getDouble();

            Circle circle = new Circle(radius);

            System.out.println("Area: " + circle.getArea());
            System.out.println("Circumference " + circle.getCircumference());

            System.out.println("Wanna make another circle?");

            Circle.incrementCircleCount();

            inNeedOfCircles = input.yesNo();

        }while(inNeedOfCircles);

        System.out.println("You've made " + Circle.getCircleCount() + " circles!");

    }

}
