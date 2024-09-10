public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
            return;
        }
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
    }

    public static void main(String[] args) {
        System.out.println(toMilesPerHour(1.5) + " mi/h");
        System.out.println(toMilesPerHour(10.25) + " mi/h");
        System.out.println(toMilesPerHour(-5.6) + " mi/h");
        System.out.println(toMilesPerHour(25.42) + " mi/h");
        System.out.println(toMilesPerHour(75.114) + " mi/h");

        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
    }
}