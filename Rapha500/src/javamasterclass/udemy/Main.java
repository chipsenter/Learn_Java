package javamasterclass.udemy;

public class Main {

    public static void main(String[] args) {
        totalKilometersPerDay(500,8);
    }

    public static void totalKilometersPerDay(int kilometer, int days){

        int km = kilometer;
        int total = (km / days);
        double miles = (total / 1.6);
        System.out.println("You need to spin " + total + "km or "+  + miles +
                "miles every day for " + days + " days to reach your goal of " + kilometer + "km");

    }
}
