package javamasterclass.udemy;

public class Main {
        public static final String ERROR_MESSAGE = "Invalid Value";
    public static void main(String[] args) {
        printYearsAndDays(5, 30);
        printYearsAndDays(1);


    }

    public static void printYearsAndDays(long minutes, long seconds){
        if((minutes < 0) || (seconds > 60)){
            System.out.println(ERROR_MESSAGE);
        }
        else if (minutes > 0) {
            long hours = minutes / 60;
            long days = hours / 24;
            long remainingDays = days % 365;
            long year = days / 365;
            long totalSec = seconds * minutes;

            System.out.println(totalSec + "s" + " = " + minutes + " minutes = " + year + " years and " + remainingDays + " days");
        }
    }

    public static void printYearsAndDays(int years){
        if(years < 0){
            System.out.println(ERROR_MESSAGE);
        }
        else if (years > 0) {
            int days = years * 365;
            System.out.println(years + " years is = " + days + " days");
        }
    }
}
