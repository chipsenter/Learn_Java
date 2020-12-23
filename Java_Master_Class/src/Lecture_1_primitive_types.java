import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Lecture_1_primitive_types {

    public static void main(String[] args) {

        String hello = "Hello";
        String world = "World";

        ArrayList<String> str1 = new ArrayList<String>();
            str1.add("H");
            str1.add("e");
            str1.add("l");
            str1.add("l");
            str1.add("o");

        ArrayList<String> str2 = new ArrayList<String>();
            str2.add("W");
            str2.add("o");
            str2.add("r");
            str2.add("l");
            str2.add("d");


        for(var i = 0; i < hello.length(); i++) {
            System.out.println("I'm printing iteration " + i + " " + str1 + str2);
        }

        int myFirstNumber = (10 + 5) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println(myTotal);
        int myLastNumber = 1000 - myTotal;
        System.out.println(myLastNumber);

    }
}
