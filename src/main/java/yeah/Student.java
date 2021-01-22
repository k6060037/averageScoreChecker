package yeah;

public class Student {
    String firstName;
    String secondName;
    double averageScore;
    String status;

    Student(String firstName, String secondName, double averageScore){
        this.firstName = firstName;
        this.secondName = secondName;
        this.averageScore = averageScore;
        if (averageScore == 5) {
            this.status = "Genius";
        } else if (4 <= averageScore && averageScore < 5) {
            this.status = "Promising";
        } else if (3 <= averageScore && averageScore < 4) {
            this.status = "Standard";
        } else if (2 < averageScore && averageScore < 3) {
            this.status = "Edge walking";
        } else {
            this.status = "Wasted";
        }

    }
}
