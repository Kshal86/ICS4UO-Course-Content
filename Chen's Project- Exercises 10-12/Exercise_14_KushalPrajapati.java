
import java.util.Scanner;

public class Exercise_14_KushalPrajapati {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);//Scanner class
        System.out.println("Enter a number");
        int month=sc.nextInt();

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println(" This month has 31 days");
            case 4, 6, 9, 11 -> System.out.println(" This month has 30 days");
            case 2 -> System.out.println(" This month has 28 days");
            default -> System.out.println("Error: there is no month with that number");
        }

    }
}






