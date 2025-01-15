import java.util.Scanner;

class Student {
    int roll;
    String name;
    double cgpa;
}

public class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        Student[] students = new Student[n];
        double lowestCgpa = Double.MAX_VALUE;
        String lowestCgpaStudent = "";

        for (int i = 0; i < n; i++) {
            students[i] = new Student();
            System.out.println("Enter roll number, name, and CGPA for student " + (i + 1) + ":");
            students[i].roll = sc.nextInt();
            sc.nextLine(); // consume newline
            students[i].name = sc.nextLine();
            students[i].cgpa = sc.nextDouble();

            if (students[i].cgpa < lowestCgpa) {
                lowestCgpa = students[i].cgpa;
                lowestCgpaStudent = students[i].name;
            }
        }

        System.out.println("\nDetails of Students:");
        for (Student s : students) {
            System.out.println("Roll: " + s.roll + ", Name: " + s.name + ", CGPA: " + s.cgpa);
        }
        System.out.println("Student with the lowest CGPA: " + lowestCgpaStudent);
        sc.close();
    }
}
