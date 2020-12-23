package javamasterclass.udemy;

public class Main {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(0));

    }

    public static int getLargestPrime(int number) {

        if (number <= 1) {

            return -1;

        }

        for (int i = number-1; i >=2; i--) {

            if (number % i == 0) {

                number = i;

            }


        }

        return number;

    }

}
