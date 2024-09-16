public class SharedDigit {

    public static boolean hasSharedDigit(int number1, int number2) {
        if ((number1 < 10 || number2 > 99) || (number2 < 10 || number1 > 99)) {
            return false;
        }


        int num12FirstDigit = number2 / 10;
        int num2SecondDigit = number2 % 10;
        int i = number1;
        do {
            if (i % 10 == num12FirstDigit || i % 10 == num2SecondDigit) {
                return true;
            }
            i /= 10;
        } while(i > 0);
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23)); //true
        System.out.println(hasSharedDigit(9, 99)); //false
        System.out.println(hasSharedDigit(15, 55)); //true
        System.out.println(hasSharedDigit(13, 35)); //true
    }
}
