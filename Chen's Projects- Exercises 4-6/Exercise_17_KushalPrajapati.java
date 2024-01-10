import java.util.Scanner;

class Exercise_17_KushalPrajapati {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter the height of the right-angled triangle ");
            int height = sc.nextInt();
            System.out.println("Enter the length of the right-angled triangle ");
            int length = sc.nextInt();
            int hypotenuse = (int) Math.sqrt((height * height) + (length * length));

            System.out.println("The hypotenuse of the right-angled triangle is " + Math.round(hypotenuse));

        }

    }
}