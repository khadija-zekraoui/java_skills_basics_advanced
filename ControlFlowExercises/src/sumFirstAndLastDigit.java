public class sumFirstAndLastDigit {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int fistDigit = number;
        int lastDigit = number % 10;

        while (fistDigit >= 10) {
            fistDigit /= 10;
        }

        return fistDigit + lastDigit;
    }

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252)); //4
        System.out.println(sumFirstAndLastDigit(257)); //9
        System.out.println(sumFirstAndLastDigit(0)); //0
        System.out.println(sumFirstAndLastDigit(5)); //10
        System.out.println(sumFirstAndLastDigit(-10)); //-1
    }
}
