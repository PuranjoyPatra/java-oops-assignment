
/*
 MCA (2020-2022) session 1st Year Java Assignment 1 => 1st Program
 Name: Puranjoy Patra
 
 */
import java.util.*;

class Ttime {

    int hh, mm, ss;

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter time as hour, min and sec :");
        hh = sc.nextInt();
        mm = sc.nextInt();
        ss = sc.nextInt();
    }

    void display() {

        if (mm > 60) {
            hh = hh + (mm / 60);
            mm = mm % 60;
        }
        if (ss > 60) {
            mm = mm + (ss / 60);
            ss = ss % 60;
        }
        System.out.println(hh + " hr : " + mm + " min : " + ss + " sec");
    }

}

public class Program1 {
    public static void main(String[] args) {
        Ttime tt1 = new Ttime();
        Ttime tt2 = new Ttime();
        tt1.getData();
        tt2.getData();
        System.out.println("First Time input by User:");
        tt1.display();
        System.out.println("Second Time input by User:");
        tt2.display();
        tt1.hh = tt1.hh + tt2.hh;
        tt1.mm = tt1.mm + tt2.mm;
        tt1.ss = tt1.ss + tt2.ss;
        System.out.println("Addition of Two Times:");
        tt1.display();

    }

}
