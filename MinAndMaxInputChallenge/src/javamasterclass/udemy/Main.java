package javamasterclass.udemy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int count = 0;

        while (count < 5){
            System.out.println("Enter number:");
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt){

                int number = scanner.nextInt();

//                if(first) {
//                    first = false;
//                    min = number;
//                    max = number;
//                }

                if(number > max){
                    max = number;
                }

                if(number < min){
                    min = number;
                }
            count++;
            } else {
                System.out.println("Invalid number!");
                break;
            }
            scanner.nextLine();
        }
        System.out.println("min = " + min + ", max= " + max);
        scanner.close();
    }
}
