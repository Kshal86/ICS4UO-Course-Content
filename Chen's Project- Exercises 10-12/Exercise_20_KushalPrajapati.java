
import java.util.Scanner;

public class Exercise_20_KushalPrajapati {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//Scanner class
        System.out.println("Enter the number of pellets");
        int pellets = sc.nextInt();//Input pellets
        int total = 52 + pellets;
        if (total <= 100) {
            System.out.println("I’m still hungry. FEED me MORE!!");
        } else if (total > 101 && total <= 150) {
            System.out.println("Thanks!");
        } else if (total > 151) {
            System.out.println("no more please. I’m full!");

        }
    }
}


