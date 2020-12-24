package javamasterclass.udemy;

public class SimpleCalculator {

    double firstNumber;
    double secondNumber;
    double thirdNumber;

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getThirdNumber() {
        return thirdNumber;
    }

    public void setThirdNumber(double thirdNumber) {
        this.thirdNumber = thirdNumber;
    }

    public double getAdditionResult() {
        return getFirstNumber() + getSecondNumber();
    }

    public double getSubtracitionResult() {
        return getFirstNumber() - getSecondNumber();
    }

    public double getMultiplicationResult() {
        return getFirstNumber() * getSecondNumber();
    }

    public double getTotalResult() {
        return getFirstNumber() + getSecondNumber() + getThirdNumber();
    }


    public double getDivisionResult() {
        if(getSecondNumber() == 0){
            return 0;
        }
        return getFirstNumber() / getSecondNumber();
    }

}
