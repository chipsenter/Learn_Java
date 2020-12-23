package javamasterclass.udemy;

public class Challenge1 {

    public static void main(String[] args) {
        printDayOfTheWeek(0);
        printDayOfTheWeek(-7);
        printDayOfTheWeek(4);
        printDayOfTheWeek(8);
    }

    public static void printDayOfTheWeek(int day){

        int dayOfWeek = day;
        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Day!");
        }
    }
}
