package javamasterclass.udemy;

public class Main {

    private static final Double PI = Math.PI;

    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));
    }

    public static double area(double radius){
        if(radius < 0){
            return -1.0;
        }
        return PI * Math.pow(radius, 2);
    }

    public static double area(double x, double y){
        if((x < 0) || (y < 0)){
            return -1.0;
        }

        return x * y;
    }
}
