package javamasterclass.udemy;

public class AllFactors {

    public static void main(String[] args) {
        printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(-1);
    }
    public static void printFactors(int number) {

        if (number < 1) {
            System.out.println("Invalid Value");
        }
        int div = 1;
        while (div <= number) {
            if (number % div == 0) {
                System.out.println(div);
            }
            div++;
        }
    }
}
