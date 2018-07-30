package shapes;

public class Circle {

    private double radius;

    private static int circleCount = 0;

    public static void incrementCircleCount(){
        circleCount ++;
    }

    public static int getCircleCount() {
        return circleCount;
    }

    public Circle(double radius){
        this.radius = radius;
    }
    public double getArea(){

        return (Math.PI * (radius * radius));
    }
    public double getCircumference(){

        return (Math.PI * 2 * radius);
    }
}
