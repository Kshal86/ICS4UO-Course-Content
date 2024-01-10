
import java.util.Scanner;

public class Exercise_16_KushalPrajapati {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);//Scanner class
        System.out.println("Enter the length");
        int length=sc.nextInt();
        System.out.println("Enter the width");
        int width=sc.nextInt();

        System.out.println("Main Menu");
        System.out.println("1. Dimensions");
        System.out.println("2. Perimeter of a rectangle");
        System.out.println("3. Area of a rectangle");
        System.out.println("4. Check if rectangle is a square");

        System.out.println("Enter a number:");
        int num=sc.nextInt();

        switch (num) {
            case 1 -> System.out.println("The dimensions are: " + length + "x" + width);
            case 2 -> System.out.println("The perimeter is: " + (2 * (length + width)));
            case 3 -> System.out.println("The area is: " + (length * width));
            case 4 -> {
                if (length == width) {
                    System.out.println("This is a square");
                } else {
                    System.out.println("This is not a square");
                }
            }
            default -> System.out.println("Quit");
        }


    }
}






