/*
 MCA (2020-2022) session 1st Year 2nd Sem Java Assignment 3 => 1st Program
 Name: Puranjoy Patra
 
*/

import java.util.Scanner;

class Sample {
    int num;

    Sample() {
        Scanner scn = new Scanner(System.in);
        System.out.printf("Enter Sample value: ");
        num = scn.nextInt();
    }

    Sample(Sample s) {
        num = s.num;
    }

    static void Sort(Sample[] arr) {
        Sort(arr, true);
    }

    static void Sort(Sample[] arr, boolean ascending) {
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = i + 1; j < arr.length; j++)
                if ((arr[i].num > arr[j].num && ascending) || (arr[i].num < arr[j].num && !ascending)) {
                    Sample temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
    }

    void display() {
        System.out.printf(" " + num);
    }

    static void display(Sample[] arr) {
        for (int i = 0; i < arr.length; i++)
            arr[i].display();
    }
}

public class Program6 {
    public static void main(String args[]) {
        int length = 5;
        Sample[] arr = new Sample[length];
        for (int i = 0; i < length; i++)
            arr[i] = new Sample();

        System.out.printf("\nArray of Samples:");
        Sample.display(arr);

        System.out.printf("\nArray of Samples Sorted in Ascending Order:");
        Sample.Sort(arr);
        Sample.display(arr);

        System.out.printf("\nArray of Samples Sorted in Decending Order:");
        Sample.Sort(arr, false);
        Sample.display(arr);
    }
}
