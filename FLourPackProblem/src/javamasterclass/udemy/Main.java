package javamasterclass.udemy;

public class Main {

    public static void main(String[] args) {
        System.out.println(canPack(1,0,4));
    }

    public static boolean canPack ( int bigCount, int smallCount, int goal){
        if (bigCount < 0 || smallCount < 0 || goal < 0) return false;

        for (int i = 0; i <= bigCount; i++) {

            for (int j = 0; j <= smallCount; j++) {

                if (goal == (i * 5) + (j)) return true;
            }

        }

        return false;


    }
}
