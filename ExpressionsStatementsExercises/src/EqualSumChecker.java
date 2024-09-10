public class EqualSumChecker {
    public static boolean hasEqualSum(int number1, int number2, int number3) {
        return (number1 + number2) == number3;
    }

    public static void main(String[] args) {
        System.out.println("Has equal sum " + hasEqualSum(1, 1, 1));
        System.out.println("Has equal sum " + hasEqualSum(1, 1, 2));
        System.out.println("Has equal sum " + hasEqualSum(1, -1, 1));
    }
}
