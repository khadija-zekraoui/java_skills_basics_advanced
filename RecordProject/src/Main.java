public class Main {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            Student s = new Student("S92300" + i,
                    switch (i) {
                        case 1 -> "Mia";
                        case 2 -> "olaf";
                        case 3 -> "bee";
                        case 4 -> "Luna";
                        case 5 -> "Lisa";
                        default -> "Anonymous";
                    },
                    "05/11/2022",
                    "Java Masterclass");
            System.out.println(s);
        }
    }
}
