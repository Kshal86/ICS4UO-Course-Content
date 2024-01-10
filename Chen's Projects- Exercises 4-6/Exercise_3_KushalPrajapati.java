import java.util.Scanner;

public class Exercise_3_KushalPrajapati {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

                System.out.println("Enter the object's mass in kg");
                int mass= sc.nextInt();
                System.out.println("Enter the object's acceleration in m/s**2");
                double acceleration = sc.nextDouble();
                System.out.println("The force of the object with a mass of " + mass + "kg and an acceleration of " + acceleration + "m/s**2 is " + mass * acceleration + "N");
            
        }
    }
}
