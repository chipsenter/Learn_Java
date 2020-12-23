package javamasterclass.udemy;

public class Main {

    public static void main(String[] args) {

        // ================ FLOAT =================== //

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        // =============== DOUBLE ================== //
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMinDoubleValue);

        // =============== DOUBLE is recommended to use ======= //
        int myIntValue = 5 / 3;
        float myFloatValue = (float) 5;
        float myFloatValue2 = 5f / 3f;
        double myDoubleValue = 5.00d / 3.00d;
        System.out.println("My Int value = " + myIntValue);
        System.out.println("My Float value = " + myFloatValue2);
        System.out.println("My Double value = " + myDoubleValue);
    }
}
