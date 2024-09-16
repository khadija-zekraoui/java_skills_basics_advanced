public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {

        if (number < 0) {
            return -1;
        }

//        int sum = 0;
//        int digit;
//        while (number != 0){
//            digit = number % 10;
//            if (digit % 2 == 0) {
//                sum += digit;
//            }
//            number /= 10;
//        }

        int sum = 0;
        for (int i = number; i > 0; i /=10) {
            int lastDigit = i % 10;
            if (i % 2 == 0) {
                sum += lastDigit;
            }
        }

        return sum;
    }



    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789)); //20
        System.out.println(getEvenDigitSum(252)); //4
        System.out.println(getEvenDigitSum(-22)); //-1
    }
}
