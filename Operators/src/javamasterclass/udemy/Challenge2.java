package javamasterclass.udemy;

public class Challenge2 {

    public static void main(String[] args) {

        double myFirstDouble = 20.00d;
        double mySecondDouble = 80.00d;
        double myAddedDoubles = (myFirstDouble + mySecondDouble) * 100d;
        System.out.println(myAddedDoubles);
        double theRemainder = myAddedDoubles % 40.00d;
        System.out.println(theRemainder);

        boolean isNoRemainder = (theRemainder == 0) ? true : false;
        System.out.println("There is no remainder = " + isNoRemainder);
        if (!isNoRemainder) {
            System.out.println("Got some remainder = " + isNoRemainder);
        }



    }
}
