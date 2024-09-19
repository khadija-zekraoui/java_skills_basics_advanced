public class Main {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            LPAStudent s = new LPAStudent("S92300" + i,
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

        Student pojoStudent = new Student("S923006", "Lin",
                "05/11/2022", "Java Masterclass");
        LPAStudent recordStudent = new LPAStudent("S923007", "Lilia",
                "05/11/2025", "Java Masterclass");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");
//        recordStudent.setClassList(recordStudent.classList() + ", Java OCP Exam 829");

        System.out.println(pojoStudent.getName() + " is taking " +
                pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " +
                recordStudent.classList());
    }
}
