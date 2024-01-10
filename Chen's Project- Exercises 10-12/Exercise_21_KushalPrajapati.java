
import java.util.Scanner;

public class Exercise_21_KushalPrajapati {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//Scanner class
        System.out.println("Enter the number of cones sold per week");
        int cones = sc.nextInt();//Input cones
        if (cones <= 150) {
            System.out.println("No bonus");}
        else if (cones <= 250) {
            System.out.println("Bonus is:" + (10 + (cones - 150) * 0.1));}
        else if (cones <= 350) {
            System.out.println("Bonus is:" + (10 + (cones - 150) * 0.1 + (cones - 250) * 0.25));}
        else {
            System.out.println("Bonus is:" + (10 + (cones - 150) * 0.1 + (cones - 250) * 0.25 + (cones - 350) * 0.35));

        }
    }
}


