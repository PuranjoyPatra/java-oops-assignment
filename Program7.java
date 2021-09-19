/*
 MCA (2020-2022) session 1st Year 2nd Sem Java Assignment 3 => 2nd Program
 Name: Puranjoy Patra
 Roll: 10271020020
*/

import java.util.*;

class Salary {
    float basic, da, hra, gross;

    Salary() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter salary details >>");
        System.out.printf("Enter base salary (in $): ");
        basic = scn.nextFloat();
    }

    void calculation() {
        da = 0.5f * basic;
        hra = 0.4f * basic;
        gross = basic + da + hra;
    }

    void display() {
        System.out.println("Basic salary: " + basic + "$\nD.A.: " + da + "$");
        System.out.println("H.R.A.: " + hra + "$\nGross salary: " + gross + "$");
    }
}

class Deduction extends Salary {
    float medical, pf, ptax, net;

    void deduction() {
        super();
    }

    void deductioncalculation() {
        super.calculation();
        medical = basic * 0.05;
        pf = (basic - medical) * 0.08;
        ptax = (basic - medical - pf) * 0.02;
        net = basic + da + hra - medical - pf - ptax;
    }

    void display(){
        super().display();
        System.out.println("Medical: " + medical + "$\nP.F.: " + pf + "$");
        System.out.println("P.Tax: " + ptax + "$\nNet salary: " + net + "$");
    }
}

class Employee extends Deduction {
    String eid, name;

    Employee() {
        super();
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter employee details >>");
        System.out.printf("Enter name: ");
        name = scn.next().toString();
        System.out.printf("Enter employee ID: ");
        eid = scn.next().toString();
    }

    void display() {
        super.display();
        System.out.printf("\nName: " + name + "\nEmployee ID: " + eid);
    }
}

public class Program7 {
    public static void main(String args[]) {
        Employee e = new Employee();
        e.display();
    }
}
