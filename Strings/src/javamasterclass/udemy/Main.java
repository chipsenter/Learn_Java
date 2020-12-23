package javamasterclass.udemy;

public class Main {

    public static void main(String[] args) {
        //Strings are treated as a class
        // 8 Data types
        // byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean
        String myString = "This is my first String";
        System.out.println("my string is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);
        myString = myString + " \u00A9 2020";
        System.out.println("myString is equal to " + myString);
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);
    }
}
