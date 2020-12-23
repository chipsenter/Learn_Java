package javamasterclass.udemy;

public class PrimeNumber {

    public static void main(String[] args) {

        for(int number = 100; number < 160; number += 10){
            System.out.println("number= " + number);
        }

        int count = 0;
        for(int i = 11; i < 20; i++){
            if(isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number");
                if(count == 20) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }

        for(int i=2; i <= (long) Math.sqrt(n); i++){
            System.out.println("Looping " + i);
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

}
