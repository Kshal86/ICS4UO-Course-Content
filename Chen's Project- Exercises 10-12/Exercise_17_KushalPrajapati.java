
import java.util.Scanner;

public class  Exercise_17_KushalPrajapati {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);//Scanner class

        System.out.println("Enter a :");
        int a = sc.nextInt();//Input a
        System.out.println("Enter b:");
        int b = sc.nextInt();//Input b
        System.out.println("Enter c:");
        int c = sc.nextInt();//Input c

        int largest;

        if (a >= b) {
            if (a >= c) {
                largest = a;}
            else {
                largest = c;}
        }
        else {
            if (b >= c) {
                largest = b;}
            else {
                largest = c;}

        }

        System.out.println("The largest number is: " + largest);
    }
}




