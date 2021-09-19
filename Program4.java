
/**
 MCA (2020-2022) session 1st Year Java Assignment 2 => 1st Program
 Name: Puranjoy Patra
 Roll: 10271020020
 */

import java.util.*;

class Sample {

    int num;

    Sample() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter interger value:");
        num = sc.nextInt();
    }

    void display() {
        System.out.println("value: " + num);
    }
}

public class Program4 {
    public static void main(String[] args) {
        Sample s = new Sample(); // single object creation
        Sample s1[] = new Sample[6];// array of 6 object creation
        for (int i = 0; i < 6; i++)
            s1[i] = new Sample();

        System.out.println("Single object value:");
        s.display();

        System.out.println("Array is:");
        for (int i = 0; i < 6; i++)
            s1[i].display();
    }
}
