
import java.util.Scanner;

public class Exercise_15_KushalPrajapati {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);//Scanner class
        System.out.println("Enter a mark");
        int mark=sc.nextInt();

        switch (mark) {
            case 8, 9, 10 -> {
                System.out.println("The mark is an A");
                System.out.println("Excellent");
            }
            case 7 -> {
                System.out.println("The mark is a B");
                System.out.println("Good");
            }
            case 6 -> {
                System.out.println("The mark is a C");
                System.out.println("Satisfactory");
            }
            case 5 -> {
                System.out.println("The mark is a D");
                System.out.println("Poor");
            }
            case 4, 3, 2, 1, 0 -> {
                System.out.println("The mark is an F");
                System.out.println("Fail");
            }
        }

    }
}






