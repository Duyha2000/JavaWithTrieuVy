package StudentProject;

public class Student {
    private int studentId;
    private String studentName;
    private double averageScore;

    public Student(int studentId, String studentName, double averageScore) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.averageScore = averageScore;
    }

    public Student() {
        this.studentId = 0;
        this.studentName = "";
        this.averageScore = 0.0;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public String toString() {
        return "Student ID: " + studentId + "\nStudent Name: " + studentName + "\nAverage Score: " + averageScore;
    }
}