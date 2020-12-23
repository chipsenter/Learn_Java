package javamasterclass.udemy;

import java.util.Scanner;

public class newScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Import the scanner and start using input from users

        System.out.println("Enter your year of birth");

        boolean hasNextInt = scanner.hasNextInt();

        if(hasNextInt){
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); // handle next line character (enter key)

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            int age = 2020 - yearOfBirth;

            if(age >= 0 && age <=100){
                System.out.println("Your name is " + name + ", and you are " + age + " years old");
            } else {
                System.out.println("Invalid year of birth");
            }
        }else {
            System.out.println("Unable to parse year of birth.");
        }

        scanner.close();
    }


}
