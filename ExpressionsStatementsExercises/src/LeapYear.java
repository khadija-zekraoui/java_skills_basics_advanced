public class LeapYear {
    // write code here
    public static boolean isLeapYear(int year) {

        if (year <= 0 || year > 9999) {
            return false;
        }

        if ((year % 4) == 0) {
            if ((year % 100) == 0) {
                if ((year % 400) == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Is leap year: " + isLeapYear(-1600));
        System.out.println("Is leap year: " + isLeapYear(1600));
        System.out.println("Is leap year: " + isLeapYear(2017));
        System.out.println("Is leap year: " + isLeapYear(2000));
    }
}