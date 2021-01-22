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
            if (student.averageScore >= averageScoreMin) {
                System.out.println(student.firstName);
                System.out.println(student.secondName);
                System.out.println(student.averageScore);
                System.out.println(student.status);
                System.out.println("-----");
            }
        }
    }
}
