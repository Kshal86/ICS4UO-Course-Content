
import java.util.Scanner;

public class Exercise_11_KushalPrajapati {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter the height of a right-angled triangle: ");
        double height = sc.nextDouble();
        final double base = 10.5;
        double area = (height * base) / 2;
        System.out.println("The area of the triangle is: " + area);

    }

}