public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {

        if (first < 10 || second < 10) {
            return -1;
        }

        int minimumNumber = Math.min(first, second);
        int maximumNumber = Math.max(first, second);
        int divider = 1;

        for (int i = 1; i <= minimumNumber; i++) {
            if(minimumNumber % i == 0 && maximumNumber % i == 0) {
                divider = i;
            }
        }
        return divider;
    }

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15)); //5
        System.out.println(getGreatestCommonDivisor(12, 30)); //6
        System.out.println(getGreatestCommonDivisor(9, 18)); //-1
        System.out.println(getGreatestCommonDivisor(81, 153)); //9
    }
}
