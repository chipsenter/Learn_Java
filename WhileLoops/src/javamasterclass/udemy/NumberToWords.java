package javamasterclass.udemy;

public class NumberToWords {

    public static void main(String[] args) {
        numberToWords(123);
        numberToWords(1010);
        reverse(-121);
        reverse(1212);
        getDigitCount(123);
        getDigitCount(5200);
    }
    public static void numberToWords(int number){
        if(number<0){
            System.out.println("Invalid Value");
        }else if(number==0){
            System.out.println("Zero");
        }else{
            int reversedNo = reverse(number);
            int diffInDigits = getDigitCount(number)-getDigitCount(reversedNo);
            int lastDigit=0;
            while(reversedNo>0){
                lastDigit=reversedNo%10;
                if(lastDigit==0){
                    System.out.println("Zero");
                }else if(lastDigit==1){
                    System.out.println("One");
                }else if(lastDigit==2){
                    System.out.println("Two");
                }else if(lastDigit==3){
                    System.out.println("Three");
                }else if(lastDigit==4){
                    System.out.println("Four");
                }else if(lastDigit==5){
                    System.out.println("Five");
                }else if(lastDigit==6){
                    System.out.println("Six");
                }else if(lastDigit==7){
                    System.out.println("Seven");
                }else if(lastDigit==8){
                    System.out.println("Eight");
                }else if(lastDigit==9){
                    System.out.println("Nine");
                }
                reversedNo/=10;
            }
            for(int i=0;i<diffInDigits;i++){
                System.out.println("Zero");
            }

        }

    }

    public static int reverse(int number){
        int reverse=0;
        while(number!=0){
            reverse=(reverse*10)+(number%10);
            number/=10;

        }
        return reverse;
    }
    public static int getDigitCount(int number){
        int count=0;
        if(number<0){
            return -1;
        }else if(number==0){
            count=1;
        }
        while(number>0){
            number=number/10;
            count++;
        }

        return count;
    }
}
