import java.util.Scanner;

class Exercise_2_KushalPrajapati {
    public static void main(String[] args) {
     
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the height of the rectangle ");
            int height = sc.nextInt();
            System.out.println("Enter the width of the rectangle ");
            int width = sc.nextInt();

            int area = height * width;
            System.out.println("The area of the rectangle is " + area );
        }

    }
}