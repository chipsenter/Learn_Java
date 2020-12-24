package javamasterclass.udemy;

public class Main {

    public static void main(String[] args) {

        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("addition= " + calculator.getAdditionResult());
        System.out.println("subtraction= " + calculator.getSubtracitionResult());
        System.out.println("multiplication= " + calculator.getMultiplicationResult());
        System.out.println("division= " + calculator.getDivisionResult());
        calculator.setFirstNumber(10);
        calculator.setSecondNumber(10);
        calculator.setThirdNumber(10);
        System.out.println("total numbers= " + calculator.getTotalResult());
    }
}
