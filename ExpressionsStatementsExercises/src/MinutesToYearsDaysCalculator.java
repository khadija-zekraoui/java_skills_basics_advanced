public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes) {

        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        long hours = minutes / 60;
        long days = hours / 24;
        long years = days / 365;
        long remainingDays = days % 365;

        System.out.println(minutes + " min = " + years + "y and " + remainingDays + "d");
    }

//    The second solution:
/*    public static void printYearsAndDays(long minutes) {

        long minutesInYear = 60L * 24 * 365;  // Number of minutes in a year
        long minutesInDay = 60L * 24;         // Number of minutes in a day

        long years = minutes / minutesInYear;         // Calculate years
        long remainingMinutes = minutes % minutesInYear;  // Remaining minutes after calculating years
        long days = remainingMinutes / minutesInDay;  // Convert remaining minutes to days

        System.out.println(minutes + " min= " + years + "y and " + days + "d");
    }*/

    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);

        printYearsAndDays(-561600);
    }
}
