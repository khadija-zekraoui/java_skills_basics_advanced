public class BarkingDog {
    // write code here
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }

        return barking && (hourOfDay < 8 || hourOfDay > 22);
    }

    public static void main(String[] args) {
        System.out.println("Should you wake up: " + shouldWakeUp(true, 1));
        System.out.println("Should you wake up: " + shouldWakeUp(false, 2));
        System.out.println("Should you wake up: " + shouldWakeUp(true, 8));
        System.out.println("Should you wake up: " + shouldWakeUp(true, -1));
    }
}