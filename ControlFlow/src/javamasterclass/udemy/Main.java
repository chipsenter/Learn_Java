package javamasterclass.udemy;

public class Main {

    public static void main(String[] args) {

        int switchValue = 3;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
                System.out.println("Value was 3");
                break;
            default:
                System.out.println("Was not 1,2 or 3");
                break;
        }
    }
}
