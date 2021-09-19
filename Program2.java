
/*
 MCA (2020-2022) session 1st Year Java Assignment 1 => 2nd Program
 Name: Puranjoy Patra
 
*/
import java.util.*;

class Student {
    String fname, lname;
    int roll;
    int marks1, marks2;

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student\'s First Name:");
        fname = sc.next();
        System.out.println("Enter Student\'s Last Name:");
        lname = sc.next();
        System.out.println("Enter Student\'s Roll:");
        roll = sc.nextInt();
        System.out.println("Enter Student\'s first Subject Marks:");
        marks1 = sc.nextInt();
        System.out.println("Enter Student\'s second Subject Marks:");
        marks2 = sc.nextInt();
    }

    void display() {
        int total = 0;
        float percentage;
        total = marks1 + marks2;
        percentage = (total / 2);
        System.out.println("Student Name: " + fname + " " + lname);
        System.out.println("Student Roll: " + roll);
        System.out.println("Student First Marks: " + marks1);
        System.out.println("Student Second Marks: " + marks2);
        System.out.println("Student Total Marks: " + total);
        System.out.println("Student Marks Percentahe: " + percentage + "%");

    }
}

public class Program2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.getData();
        s1.display();
    }
}
