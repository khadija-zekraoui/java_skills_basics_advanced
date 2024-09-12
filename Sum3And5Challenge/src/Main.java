public class Main {

    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for (int i = 1; count < 5 && i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) { // OR if (i % 15 == 0) {
                sum += i;
                count++;
                System.out.println("Found a match = " + i);
            }
        }

        System.out.println("The sum of the numbers: " + sum);
    }
}
