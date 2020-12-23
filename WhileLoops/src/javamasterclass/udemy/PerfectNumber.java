package javamasterclass.udemy;

public class PerfectNumber {

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int div = 1;
        int sum = 0;
        while (div < number) {
            if (number % div == 0) {
                sum +=div;
            }
            div++;
        }
        return (number==sum);
    }

    //For loop

//    public static boolean isPerfectNumber(int number) {
//        if (number > 1){
//            int sum = 0;
//            for (int i = 1; i<number; i++){
//                if(number%i==0){
//                    sum+=i;
//                }
//            }
//            return (number==sum);
//        }
//        return false;
//    }

}
