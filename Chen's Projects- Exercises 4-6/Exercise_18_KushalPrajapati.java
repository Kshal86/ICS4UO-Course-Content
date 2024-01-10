import java.util.Scanner;
public class Exercise_18_KushalPrajapati {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the height of the right-angled triangle ");
            int height = sc.nextInt();
            System.out.println("Enter the hypotenuse of the right-angled triangle ");
            int hypotenuse = sc.nextInt();
            int length= (int) Math.sqrt((hypotenuse * hypotenuse) -(height*height));
            System.out.println("The length of the right-angled triangle is " + Math.round(length));

        }
    }
}
