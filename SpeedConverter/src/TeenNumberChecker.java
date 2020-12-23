import org.w3c.dom.ranges.Range;

public class TeenNumberChecker {

    public static void main(String[] args) {
        System.out.println(isTeen(9));
        System.out.println(isTeen(13));
        System.out.println(isTeen(19));
        System.out.println("\n");
        System.out.println(hasTeen(9,99,19));
        System.out.println(hasTeen(23,15,42));
        System.out.println(hasTeen(22,23,34));
    }

    public static boolean hasTeen(int age1, int age2, int age3) {
        return ((age1 >= 13 && age1 < 20)||(age2 >= 13 && age2 < 20)||(age3 >= 13 && age3 < 20));
    }

    public static boolean isTeen(int a){
        return (a >= 13 && a < 20);
    }
    }
//        if( (age1 >= 13 && age1 <= 19)) {
//            return true;
//        }
//        if(age2 >= 13 && age2 <= 19) {
//            return true;
//        }
//        if(age3 >= 13 && age3 <= 19) {
//            return true;
//        }
//        else return false;
//
//    }
//
//    public static boolean isTeen(int age){
//        if(age < 13){
//            return false;
//        }
//        if(age >=13 && age <= 19){
//            return true;
//        }
//        return false;
//    }
//}
