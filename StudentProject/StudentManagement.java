package StudentProject;

import java.util.ArrayList;
import java.util.Comparator;

public class StudentManagement extends IGenericStudent {
    private ArrayList<Student> students;

    @Override
    public void showAll() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    @Override
    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public void removeStudent(int studentId) {
        for (Student student : students) {
            if (student.getStudentId() == studentId) {
                students.remove(student);
                return;
            }
        }
    }

    @Override
    public Student findStudentById(int studentId) {
        for (Student student : students) {
            if (student.getStudentId() == studentId) {
                return student;
            }
        }
        return null;
    }

    @Override
    public double getAverageScore() {
        double sum = 0;
        for (Student student : students) {
            sum += student.getAverageScore();
        }
        return sum / students.size();
    }

    @Override
    public void sortByScore() {
        students.sort(Comparator.comparingDouble(Student::getAverageScore));
    }

}
