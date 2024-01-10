
import java.util.Scanner;

public class Exercise_13_KushalPrajapati {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius;
        final double pi = 3.14159;
        System.out.println("Enter the radius of a circle: ");
        radius = sc.nextDouble();
        double area = pi * (radius * radius);
        System.out.println("The area of the circle is: " + Math.round(area*10.0)/10.0);


    }
}