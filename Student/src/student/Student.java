package student;

/*
 Homework 2: Student Enrollment
 Program By: Kevin Parnell
 GitHub: https://github.com/KevinParnell
 File Name: Student.java
 Function: This program enrolls a student with basic information
 */

import java.util.Scanner;

public class Student {

    private String name;
    private double gpa;
    private String grade;

    private Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Welcome to Student Enrollment!");

        // Initializes the student methods
        Student student1, student2;
        student1 = new Student();
        student2 = new Student();

        // Simple output for the public voids
        student1.enroll();
        student1.displayInfo();
        student2.enroll();
        student2.displayInfo();
    }

    // Initializes the inputs for the student enrollments, used twice
    public void enroll() {
        System.out.println("Enter Student's name: ");
        name = scan.nextLine();
        System.out.println("Enter Student's GPA: ");
        gpa = scan.nextDouble();
        // Stops the previous scan from eating the next scan
        scan.nextLine();
        System.out.println("Enter Student's grade: ");
        grade = scan.nextLine();
    }

    // Initializes the outputs for the student enrollments, used twice
    public void displayInfo() {
        System.out.println(name + " has a gpa of " + gpa + " and is in the " + grade + " grade.");
    }
}
