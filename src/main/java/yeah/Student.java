package yeah;

public class Student {

    private final String firstName;
    private final String secondName;
    private final double averageScore;
    private String status;

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

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Студент по имени "
                + firstName + ", с фамилией " + secondName + " и средним баллом " + averageScore +
                " баллов, благодаря своим стараниям имеет статус " + status;
    }
}
