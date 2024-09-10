public class IntEqualityPrinter {
    public static void printEqual(int number1, int number2, int number3) {
        if (number1 < 0 || number2 < 0 || number3 < 0) {
            System.out.println("Invalid Value");
        } else if (isEqual(number1, number2) && isEqual(number2, number3)) {
            System.out.println("All numbers are equal");
        } else if (!isEqual(number1, number2) && !isEqual(number2, number3) && !isEqual(number1, number3)) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }

    public static boolean isEqual(int number1, int number2) {
        return number1 == number2;
    }

    public static void main(String[] args) {
        printEqual(1, 1, 1); //should print text All numbers are equal
        printEqual(1, 1, 2); //should print text Neither all are equal or different
        printEqual(-1, -1, -1); //should print text Invalid Value
        printEqual(1, 2, 3); //should print text All numbers are different
    }
}
