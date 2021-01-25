package yeah;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Double, Student> studentMap = new HashMap<>();
        studentMap.put(5.0,  new Student("Mikhail", "Lukashenko", 5));
        studentMap.put(3.8, new Student("Pavel", "Ded", 3.8));
        studentMap.put(4.1, new Student("Ivan", "Collega", 4.1));
        studentMap.put(4.9, new Student("Telegram", "Durov", 4.9));
        studentMap.put(3.7, new Student("Sredniy", "Chelovek", 3.7));
        studentMap.put(3.0, new Student("Ezhik", "Vtumanov", 3));
        studentMap.put(2.4, new Student("Petr", "Takovoy", 2.4));
        studentMap.put(1.1, new Student("Trouble", "Maker", 1.1));
        //Печатаем по ключу
        System.out.println("studentMap.get(5.0) = " + studentMap.get(5.0));
        System.out.println("----");
        //Печатаем от минимальной оценки по объекту
        double minScore = 2.7;
        for (Student student:
             studentMap.values()) {
            if (student.getAverageScore() >= minScore) {
                System.out.println("student = " + student);
            }
        }
        System.out.println("----");
        //Печатаем от минимальной оценки по ключу
        for (double cnt: studentMap.keySet()){
            if (cnt >= minScore) {
                System.out.println("studentMap.get(cnt) = " + studentMap.get(cnt));
            }
        }
    }
}
