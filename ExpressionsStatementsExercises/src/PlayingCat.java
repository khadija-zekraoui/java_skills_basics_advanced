public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        int upperLimitTemperature = summer ? 45 : 35;
        return (temperature >= 25 && temperature <= upperLimitTemperature);
    }

    public static void main(String[] args) {
        System.out.println("Is cat playing: " + isCatPlaying(true, 10)); // should return false
        System.out.println("Is cat playing: " + isCatPlaying(false, 36)); // should return false
        System.out.println("Is cat playing: " + isCatPlaying(false, 35)); // should return true
    }
}
