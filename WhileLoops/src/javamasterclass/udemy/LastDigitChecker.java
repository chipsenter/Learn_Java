package javamasterclass.udemy;

public class LastDigitChecker {

    public static void main(String[] args) {
        System.out.println("Last digit is = " + hasSameLastDigit(41,22,71));
        System.out.println("Last digit is = " + hasSameLastDigit(23,32,42));
        System.out.println("Last digit is = " + hasSameLastDigit(9,99,999));
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3){

        if (isValid(num1) && isValid(num2) && isValid(num3)) {
            num1%=10;

            num2%=10;

            num3%=10;

            if(num1==num2 || num1==num3 || num2 ==num3) {
                return true;
            }
        } else
            return false;

        return false;

    }
    public static  boolean isValid(int n) {

        if(n>=10 && n<=1000) {

            return true;

        } else

            return false;
    }
}
