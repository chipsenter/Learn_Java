package javamasterclass.udemy;

public class Main {

    public static void main(String[] args) {
        // Create an object
        Car porsche = new Car();
        Car holden = new Car();
        porsche.setModel("922");
        System.out.println("Model is " + porsche.getModel());
    }
}
