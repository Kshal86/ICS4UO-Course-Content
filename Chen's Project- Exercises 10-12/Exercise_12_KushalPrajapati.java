
import java.util.Scanner;

public class Exercise_12_KushalPrajapati {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);//Scanner class
        System.out.println("Main Menu");
        System.out.println("1. Load Game");
        System.out.println("2. Start Game");
        System.out.println("3. Credits");
        System.out.println("Enter a number:");
        int num=sc.nextInt();

        switch (num){

            case 1:
                System.out.println("Loading Game...");
                break;

            case 2:
                System.out.println("Starting Game...");
                break;
            case 3:
                System.out.println("Credits");
                break;
            default:
                System.out.println("Quit");
                break;

        }
    }
}






