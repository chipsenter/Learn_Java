package javamasterclass.udemy;

public class Main {

    public static void main(String[] args) {

        int count = 1;
        while (count != 6) {
            System.out.println("While Loop 1 counting " + count);
            count++;
        }

        count = 1;
        while (true) {
            if (count == 6) {
                break;
            }
            System.out.println("While Loop 2 counting " + count);
            count++;
        }

        for(count = 1; count < 6; count++){
            System.out.println("For Loop 1 counting " + count);
        }

        count = 6;
        do {
            System.out.println("Do While Loop 1 counting " + count);
            count++;

            if(count > 100){
                break;
            }

        } while (count != 6);
    }
}
