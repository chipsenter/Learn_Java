package javamasterclass.udemy;

public class EvenDigitSum {

    public static void main(String[] args) {
        System.out.println("The sum of the Even numbers = " + getEvenDigitSum(123456789));
        System.out.println("The sum of the Even numbers = " + getEvenDigitSum(252));
        System.out.println("The sum of the Even numbers = " + getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(int number){
        int sumEvenNumber = 0;
        if(number < 0){
            return -1;
        }

        do {

            int lastNumber = number % 10;
            if(lastNumber % 2 == 0){
                sumEvenNumber += lastNumber;
            }
            number /= 10;
        }
        while (number !=0);
        return sumEvenNumber;
    }
}
