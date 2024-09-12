public class NumberOfDaysInMonth {
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

    public static int getDaysInMonth(int month, int year) {
        if ((month < 1 || month > 12) || (year < 1 || year > 9999)) {
            return -1;
        }

        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;  // Months with 31 days
            case 4, 6, 9, 11 -> 30;            // Months with 30 days
            case 2 -> isLeapYear(year) ? 29 : 28;
            default -> -1;
        };
    }

    public static void main(String[] args) {
        System.out.println("Days in month 1, year 2020: " + getDaysInMonth(1, 2020)); //31
        System.out.println("Days in month 2, year 2020: " + getDaysInMonth(2, 2020)); //29
        System.out.println("Days in month 2, year 2018: " + getDaysInMonth(2, 2018)); //28
        System.out.println("Days in month -1, year 2020: " + getDaysInMonth(-1, 2020)); //-1
        System.out.println("Days in month 1, year -2020: " + getDaysInMonth(1, -2020)); //-1
    }
}
