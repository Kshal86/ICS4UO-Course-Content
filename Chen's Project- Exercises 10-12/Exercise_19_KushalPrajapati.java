
import java.util.Scanner;

public class Exercise_19_KushalPrajapati {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);//Scanner class
        System.out.println("Enter the mark");
        int mark = sc.nextInt();//Input mark
        if (mark >= 0 && mark <= 100) {
            if (mark >= 80) {
                System.out.println("A");
            } else if (mark >= 70) {
                System.out.println("B");
            } else if (mark >= 60) {
                System.out.println("C");
            } else if (mark >= 50) {
                System.out.println("D");
            } else if (mark >= 40) {
                System.out.println("E");
            } else if (mark > 0) {
                System.out.println("F");
            }
        } else {
            System.out.println("Invalid mark");
        }
    }
}


