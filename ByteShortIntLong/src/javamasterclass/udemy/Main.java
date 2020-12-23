package javamasterclass.udemy;

public class Main {

    public static void main(String[] args) {

        // ==================== INTEGER ===========================//
        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted Maximum Value (Overflow) = " + (myMaxIntValue + 1));
        System.out.println("Busted Minimum Value (Underflow) = " + (myMinIntValue - 1));

        int myMaxIntTest = 2_147_483_647;

        // ==================== BYTE ===========================//

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);
        System.out.println("Busted Maximum Value (Overflow) = " + (myMaxByteValue + 1));
        System.out.println("Busted Minimum Value (Underflow) = " + (myMinByteValue - 1));

        // ==================== SHORT ===========================//

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);
        System.out.println("Busted Maximum Value (Overflow) = " + (myMaxShortValue + 1));
        System.out.println("Busted Minimum Value (Underflow) = " + (myMinShortValue - 1));

        // ==================== LONG ===========================//

        long myLongValue = 100L;
        long myMaxLongValue = Long.MAX_VALUE;
        long myMinLongValue = Long.MIN_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);
        System.out.println("Busted Maximum Value (Overflow) = " + (myMaxLongValue + 1));
        System.out.println("Busted Minimum Value (Underflow) = " + (myMinLongValue - 1));
        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);

        // =================== CASTING ======================== //
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        System.out.println(myNewByteValue);

        short myNewShortValue = (short) (myNewByteValue / 2);
        System.out.println(myNewShortValue);

    }
}
