package javamasterclass.udemy;

import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Import the scanner and start using input from users

        int counter = 0;
        int sum = 0;

        while (counter < 10) {
            int order = counter + 1;
            System.out.println("Enter number #" + order + ":");

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();
                counter++;
                sum += number;
//                if(counter == 10){
//                    break;
//                }
            } else {
                System.out.println("Invalid number");
            }
            scanner.nextLine();
        }
        System.out.println("Sum = " + sum);
        scanner.close();
    }
}
