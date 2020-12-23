package javamasterclass.udemy;

import javax.swing.border.Border;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;
        long avg = 0L;

        while (counter < 5) {
            System.out.println("Enter number:");

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();
                sum += number;
                counter++;

            } else {
                System.out.println("Invalid number");
                break;
            }
            scanner.nextLine();
        }
        avg = Math.round((double) sum/counter);
        System.out.println("SUM = " + sum + " AVG = " + avg);
        scanner.close();
    }
}

