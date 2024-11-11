package StudentProject;

public abstract class IGenericStudent {
    abstract void showAll();

    abstract void addStudent(Student student);

    abstract void removeStudent(int studentId);

    abstract Student findStudentById(int studentId);

    abstract double getAverageScore();

    abstract void sortByScore();

}
