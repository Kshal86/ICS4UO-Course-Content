
import java.util.Scanner;

public class Exercise_10_KushalPrajapati {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//Scanner class
        System.out.println("Enter a mark out of 100:");
        int mark = sc.nextInt();

        if (mark > 90) {
            System.out.println("The mark is an A");
        } else if (mark > 80) {
            System.out.println("The mark is a B");
        } else if (mark > 70) {
            System.out.println("The mark is a C");
        } else if (mark > 60) {
            System.out.println("The mark is a D");
        } else if ((mark > 0) && (mark < 60)) {
            System.out.println("The mark is an F");
        } else {
            System.out.println(mark + "is not between 0 and 100");

        }
    }
}






