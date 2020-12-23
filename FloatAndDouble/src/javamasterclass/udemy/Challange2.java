package javamasterclass.udemy;

import java.math.BigDecimal;

public class Challange2 {

    public static void main(String[] args) {

        int kg = 85;
        double lbs = 200.00d;
        double lbsConvertedToKG = lbs * 0.45359237f;
        double KGconvertedToLBS = kg * 2.20462f;
        System.out.println("Your weight in lbs " + lbs + " converted to KG is = " + lbsConvertedToKG);
        System.out.println("Your weight in kg " + kg + " converted to LBS is = " + KGconvertedToLBS);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);

    }
}
