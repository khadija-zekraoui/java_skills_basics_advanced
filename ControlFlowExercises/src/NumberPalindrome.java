public class NumberPalindrome {
    public static boolean isPalindrome(int number) {

        int reversedNumber = 0;
        int numberToReverse = number;

        while (numberToReverse != 0) {
            int lastDigit = numberToReverse % 10;
            reversedNumber *= 10;
            reversedNumber += lastDigit;
            numberToReverse /= 10;
        }

        return (number == reversedNumber);
    }

    public static void main(String[] args) {
        System.out.println("Is -1221 a palindrome number: " + isPalindrome(-1221)); //true
        System.out.println("Is 707 a palindrome number: " + isPalindrome(707)); //true
        System.out.println("Is 11212 a palindrome number: " + isPalindrome(11212)); //false
    }
}
