package javamasterclass.udemy;

public class Challange1 {

    public static void main(String[] args) {

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (isCar) {
            System.out.println("This is false");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;

        if (wasCar){
            System.out.println("Was car true or false? " + wasCar);
            System.out.println();
        }
    }
}
