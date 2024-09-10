public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2) {

        // use long instead of int prevents potential overflow issues
        long number1CastedValue = (long) (number1 * 1000);
        long number2CastedValue = (long) (number2 * 1000);

        return number1CastedValue == number2CastedValue;
    }

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }

}
