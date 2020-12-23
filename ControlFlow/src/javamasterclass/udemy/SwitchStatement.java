package javamasterclass.udemy;

import java.util.Locale;

public class SwitchStatement {

    public static void main(String[] args) {

        int switchValue = 7;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:case 4:case 5:
                System.out.println("Value was a 3, or a 4, or a 5");
                System.out.println("Actually it was " + switchValue);
                break;
            default:
                System.out.println("Was not 1,2,3, 4 or 5");
                break;
        }

        char switchChar = 'D';

        switch(switchChar) {
            case 'A':
                System.out.println("Char was value A");
                break;
            case 'B':
                System.out.println("Char was value B");
                break;
            case 'C':
                System.out.println("Char was value C");
                break;
            case 'D':
                System.out.println("Char was value D");
                break;
            case 'E':
                System.out.println("Char was value A");
                break;
            default:
                System.out.println("Char was not found above!");
        }

        String month = "January";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Month is " + month);
                break;
            case "february":
                System.out.println("Month is " + month);
                break;
            case "march":
                System.out.println("Month is " + month);
                break;
            default:
                System.out.println("Month was not found above!");

        }


    }

}
