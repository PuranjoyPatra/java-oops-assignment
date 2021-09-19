
/**
      Object Oriented Concepts in Java
 MCA (2020-2022) session 1st Year Java Assignment 2 => 2nd Program
 Name: Puranjoy Patra
 Roll: 10271020020
 */

import java.util.*;

class Salary {

    int basic;
    float da, hra, gross;

    Salary() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Basic Pay:");
        basic = sc.nextInt();
        da = (basic * 50) / 100;
        hra = (basic * 40) / 100;
        gross = basic + da + hra;
    }

    void display() {
        System.out.println("Basic Salary: " + basic);
        System.out.println("DA: " + da);
        System.out.println("HRA: " + hra);
        System.out.println("Gross Salary: " + gross);
    }
}

class Employee extends Salary {
    String eid, name;

    Employee() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Id:");
        eid = sc.next();

        System.out.println("Enter Employee Full Name:");
        name = sc.next();

    }

    void display() {
        System.out.println("Employee Id: " + eid);
        System.out.println("Employee Name: " + name);
        super.display();
    }
}

public class Program5 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.display();
    }
}
