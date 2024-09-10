public class TeenNumberChecker {
    public static boolean hasTeen(int number1, int number2, int number3) {
        return isTeen(number1) || isTeen(number2) || isTeen(number3);
    }

    public static boolean isTeen(int number) {
        return (number >= 13 && number <= 19);
    }

    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
    }
}
