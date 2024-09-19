public class SimpleCalculator {

    private double firstNumber; // 0.0 by default
    private double secondNumber; // 0.0 by default

    // == public methods ==
    public double getAdditionResult() {
        return firstNumber + secondNumber;
    }

    public double getSubtractionResult() {
        return firstNumber - secondNumber;
    }

    public double getMultiplicationResult () {
        return firstNumber * secondNumber;
    }

    public double getDivisionResult() {

        if (secondNumber == 0) {
            return 0;
        }
        return firstNumber / secondNumber;
    }

    // == getters/setters ==
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
}
