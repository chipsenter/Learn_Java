package javamasterclass.udemy;

public class NumberPalidrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(11));
    }

    public static boolean isPalindrome(int number) {
        int num = number, reversedInteger = 0, remainder, originalInteger;

        originalInteger = num;

        // reversed integer is stored in variable
        while( num != 0 )
        {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num  /= 10;
        }

        // palindrome if orignalInteger and reversedInteger are equal
        if (originalInteger == reversedInteger) {
            return true;
        }
        return false;
    }
}

