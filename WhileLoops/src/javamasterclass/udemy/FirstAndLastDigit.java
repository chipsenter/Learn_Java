package javamasterclass.udemy;

public class FirstAndLastDigit {

    public static void main(String[] args) {
        System.out.println("First and Last number should =" + sumFirstAndLastDigit(923));
    }

    public static int sumFirstAndLastDigit(int number){
        if(number< 0){
            return -1;
        }
        int remainingDigit = number;
        int lastDigit = number % 10;
        while (remainingDigit > 9){
            remainingDigit = remainingDigit / 10;
        }
        return (remainingDigit + lastDigit);
    }

}
