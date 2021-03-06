package yeah;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageScoreChecker {

    public static void main(String[] args) {
        List<Student> studentsList = studentsListInput();
        //Student[] students = studentsArrayInput(); для массива
        double averageScoreMin = averageScoreInput();
        for (int i = 0; i < studentsList.size(); i++) {
            Student student = studentsList.get(i);
            studentWriter(student, averageScoreMin);
        }
    }

    public static ArrayList studentsListInput(){
        List<Student> studentsList = new ArrayList<>();
        studentsList.add(new Student("Mikhail", "Lukashenko", 5));
        studentsList.add(new Student("Pavel", "Ded", 3.8));
        studentsList.add(new Student("Ivan", "Collega", 4.1));
        studentsList.add(new Student("Telegram", "Durov", 4.9));
        studentsList.add(new Student("Sredniy", "Chelovek", 3.7));
        studentsList.add(new Student("Ezhik", "Vtumanov", 3));
        studentsList.add(new Student("Petr", "Takovoy", 2.4));
        studentsList.add(new Student("Trouble", "Maker", 1.1));
        return (ArrayList) studentsList;
    }


    /* array students
    public static Student[] studentsArrayInput(){
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
        return students;
    }
    */


    public static double averageScoreInput(){
        double averageScoreMinInput;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число с плавающей запятой от 0 до 5 включительно");
        while (true) {
            if (scanner.hasNextDouble()) {
                averageScoreMinInput = scanner.nextDouble();
                if (averageScoreMinInput >= 0 && averageScoreMinInput <= 5) {
                    break;
                } else {
                    System.out.println("Введенное число за пределами допустимых границ, введите заново");
                }
            } else {
                System.out.println("Необходимо вводить число от 0 до 5 включительно с разделителем-запятой, напр. \"1,1\"");
                scanner.next();
                continue;
            }
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
