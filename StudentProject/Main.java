package StudentProject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManagement student = new StudentManagement();
        boolean isRunning = true;
        do {
            System.out.println("1. Add Student");
            System.out.println("2. Display Student");
            System.out.println("3. Find Student by ID:");
            System.out.println("4. Remove a Student:");
            System.out.println("5. Calculate Average Score of All Students:");
            System.out.println("6. Sort Students by Average Score:");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    student.showAll();
                    break;
                case 2:
                    Student st = new Student(20, "Nguyen Van A", 8.5);

                    student.addStudent(st);
                    break;
                case 3:
                    System.out.print("Enter student ID: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    student.findStudentById(id);
                    break;
                case 4:
                    System.out.print("Enter student ID: ");
                    int id1 = Integer.parseInt(scanner.nextLine());
                    student.removeStudent(id1);
                    break;
                case 5:
                    System.out.println("Average score of all students: " + student.getAverageScore());
                    break;
                case 6:
                    student.sortByScore();
                    break;
                case 0:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (isRunning);
    }
}
