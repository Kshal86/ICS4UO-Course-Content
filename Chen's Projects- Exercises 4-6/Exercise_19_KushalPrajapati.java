import java.util.Scanner;

public class Exercise_19_KushalPrajapati {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter the height of the can:  ");
            double height = sc.nextDouble();
            int radius=10;
            double area= (Math.PI*Math.pow(radius,2))*height;
            System.out.println("The volume of the can is " + area);



        }
    }
}
