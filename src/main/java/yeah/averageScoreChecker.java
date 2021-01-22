package yeah;

public class averageScoreChecker {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Mikhail", "Lukashenko", 5),
                new Student("Pavel", "Ded", 3.8),
                new Student("Ivan", "Collega", 4.1),
                new Student("Telegram", "Durov", 4.9),
                new Student("Sredniy", "Chelovek", 3.7),
                new Student("Ezhik", "Vtumanov", 3),
                new Student("Petr", "Takovoy", 2.4),
                new Student("Trouble", "Maker", 1.1)
        };

        double averageScoreMin = 3;
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            if (student.getAverageScore() >= averageScoreMin) {
                System.out.println(student.getFirstName());
                System.out.println(student.getSecondName());
                System.out.println(student.getAverageScore());
                System.out.println(student.getStatus());
                System.out.println("-----");
            }
        }
    }
}
