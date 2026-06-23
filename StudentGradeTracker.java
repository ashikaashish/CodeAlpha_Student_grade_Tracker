package OOP;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    double grade;

    Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }
}

public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Grade: ");
            double grade = sc.nextDouble();
            sc.nextLine();

            students.add(new Student(name, grade));
        }

        double total = 0;
        double highest = students.get(0).grade;
        double lowest = students.get(0).grade;
        String highestStudent = students.get(0).name;
        String lowestStudent = students.get(0).name;

        for (Student s : students) {
            total += s.grade;

            if (s.grade > highest) {
                highest = s.grade;
                highestStudent = s.name;
            }

            if (s.grade < lowest) {
                lowest = s.grade;
                lowestStudent = s.name;
            }
        }

        double average = total / students.size();

        System.out.println("\n===== STUDENT REPORT =====");
        System.out.println("Name\t\tGrade");

        for (Student s : students) {
            System.out.println(s.name + "\t\t" + s.grade);
        }

        System.out.println("\nAverage Score : " + average);
        System.out.println("Highest Score : " + highest + " (" + highestStudent + ")");
        System.out.println("Lowest Score  : " + lowest + " (" + lowestStudent + ")");

        sc.close();
    }
}