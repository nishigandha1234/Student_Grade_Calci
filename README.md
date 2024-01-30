package studentassociation;
import java.util.ArrayList;
import java.util.Scanner;

class Student {}

class StudentManagementSystem {
    private ArrayList<Student> students;

    public StudentManagementSystem() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully.");
    }

    public void removeStudent(int rollNumber) {
        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {
                students.remove(student);
                System.out.println("Student removed successfully.");
                return;
            }
        }
        System.out.println("Student with Roll Number " + rollNumber + " not found.");
    }

    public void searchStudent(int rollNumber) {
        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {
                System.out.println(student);
                return;
            }
        }
        System.out.println("Student with Roll Number " + rollNumber + " not found.");
    }

    public void displayAllStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

public class StudentGrade
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManagementSystem sms = new StudentManagementSystem();

        while (true) {
            System.out.println("\nStudent Management System Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter student roll number: ");
                    int rollNumber = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character

                    System.out.print("Enter student grade: ");
                    String grade = scanner.nextLine();

                    sms.addStudent(new Student(name, rollNumber, grade));
                    break;

                case 2:
                    System.out.print("Enter roll number of student to remove: ");
                    int rollToRemove = scanner.nextInt();
                    sms.removeStudent(rollToRemove);
                    break;

                case 3:
                    System.out.print("Enter roll number of student to search: ");
                    int rollToSearch = scanner.nextInt();
                    sms.searchStudent(rollToSearch);
                    break;

                case 4:
                    sms.displayAllStudents();
                    break;

                case 5:
                    System.out.println("Exiting Student Management System. Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
