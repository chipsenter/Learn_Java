package javamasterclass.udemy;

public class Challenge1 {

    public static void main(String[] args) {

        byte myByteValue = 100;
        short myShortValue = 10000;
        int myIntValue = 1_000_000;
        long myLongValue = 50000L + 10L * (myByteValue + myShortValue + myIntValue);
        System.out.println(myLongValue);
    }
}
