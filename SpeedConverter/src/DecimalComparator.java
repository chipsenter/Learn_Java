public class DecimalComparator {

    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        areEqualByThreeDecimalPlaces(3.175, 3.176);
        areEqualByThreeDecimalPlaces(3.0, 3.0);
        areEqualByThreeDecimalPlaces(-3.123, 3.123);
    }

    public static boolean areEqualByThreeDecimalPlaces(double one, double two){

        if( (int) (one * 1000) == (int) (two * 1000)){
            System.out.println(true);
            return true;
        }
        else
            System.out.println(false);
            return false;
    }
}
