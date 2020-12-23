package javamasterclass.udemy;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
        System.out.println("The greatest common divisor is = " + getGreatestCommonDivisor(25,15));
        System.out.println("The greatest common divisor is = " + getGreatestCommonDivisor(12,30));
        System.out.println("The greatest common divisor is = " + getGreatestCommonDivisor(9,18));
        System.out.println("The greatest common divisor is = " + getGreatestCommonDivisor(81,153));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        int minNum = Math.min(first, second);
        // int maxNum = Math.max(first, second);
        int div = 1;
        int gcd = 0;
        while (div <= minNum) {
            // if((minNum%div ==0) && (maxNum%div == 0)) {
            if((first%div ==0) && (second%div == 0)) {
                gcd=+div;
            } div++;
        }
        return gcd;
    }
}
