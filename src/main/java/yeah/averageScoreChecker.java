package yeah;

import java.util.Scanner;

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

        double averageScoreMin = averageScoreInput();

        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
            studentWriter(student, averageScoreMin);
        }
    }

    public static double averageScoreInput(){
        double averageScoreMinInput;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите минимальный проходной балл от 0 до 5 с плавающей запятой");
        averageScoreMinInput = scanner.nextDouble();

        while (true) {
            if (averageScoreMinInput < 0 || averageScoreMinInput > 5) {
                System.out.println("Введите снова. Балл не может быть меньше 0 или больше 5!!!");
                averageScoreMinInput = scanner.nextDouble();
            } else {break;}
        }
        return averageScoreMinInput;
    }

    public static void studentWriter(Student student, double averageScoreMin) {
        if (student.getAverageScore() >= averageScoreMin) {
            System.out.println(student);
            System.out.println("-----");
        }
    }
}
