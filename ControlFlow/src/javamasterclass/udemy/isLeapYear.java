package javamasterclass.udemy;

public class isLeapYear {

    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
    }
        public static boolean isLeapYear(int year){
            if((year >= 1) && (year <= 9999)){
                if(year % 4 == 0 && year % 100 != 0){
                    return true;
                } else if(year % 100 == 0 && year % 400 == 0){
                    return true;
                }

            }
            return false;
        }

        public static int getDaysInMonth(int month,int year) {
            boolean leapYearOrNot=isLeapYear(year);

            if((year >= 1) && (year<=9999)){

                switch (month){
                    case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                        return 31;
                    case 2:
                        if(leapYearOrNot){
                            return 29;
                        } return 28;
                    case 4: case 6: case 9: case 11:
                        return 30;
                    default:
                        return -1;
                }
            }
            else return -1;
        }
    }
