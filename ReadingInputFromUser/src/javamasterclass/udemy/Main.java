package javamasterclass.udemy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Import the scanner and start using input from users

        System.out.println("Enter your year of birth");
        int yearOfBirth = scanner.nextInt();
        scanner.nextLine(); // handle next line character (enter key)

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        int age = 2020 - yearOfBirth;

        System.out.println("Enter your city you live in: ");
        String city = scanner.nextLine();

        System.out.println("Enter your weight in KG:");
        double weight = scanner.nextDouble();

        System.out.println("Enter your height in Meters:");
        double height = scanner.nextDouble();

        if(age > 35){
            System.out.println("You getting pretty old there buddy!");
        }
        double bmi = weight / (height * height);

        if(bmi >= 25){
            System.out.println("You are OVERWEIGHT and should consider a gym pass ASAP!");
        } else if(bmi >= 18.5 && bmi <= 24.9){
            System.out.println("You are living an Ideal life , keep it up!");
        }

        System.out.println("Your name is " + name + ", and you are " + age + " years old and your live in " + city + " and your BMI is = " + bmi);

        scanner.close();
    }
}
