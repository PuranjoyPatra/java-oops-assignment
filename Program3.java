
/**
 * another program example
 */
import java.util.*;

class Number {
    int num;

    Number() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        num = sc.nextInt();
    }

    void display() {
        System.out.println(num);

    }

}

public class Program3 {
    public static void main(String[] args) {

        Number n1[] = new Number[3];
        for (int i = 0; i < 3; i++)
            n1[i] = new Number();

        System.out.println("Array is:");
        for (int i = 0; i < 3; i++)
            n1[i].display();

        for (int i = 0; i < 3; i++)
            if (n1[i] > n1[0]) {

                n1[i].display();
            }

    }
}
