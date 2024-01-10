import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        //1. Calculate the difference
        //2. Calculate the difference of Squares
        //3. Calculate the Exponent
        //4. Find the Greatest Common Factor
        //5. Exit
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter another number: ");
        int number2 = scanner.nextInt();



        // main calculator
        System.out.println("Welcome to the Calculator");
        System.out.println("1. Calculate the difference");
        System.out.println("2. Calculate the difference of Squares");
        System.out.println("3. Calculate the Exponent");
        System.out.println("4. Find the Greatest Common Factor");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> Methods.difference(number1, number2);
            case 2 -> Methods.squarediff(number1, number2);
            case 3 -> Methods.Exp(number1, number2);
            case 4 -> Methods.GCF(number1, number2);
            case 5 -> System.out.println("Goodbye!");
            default -> System.out.println("Invalid choice");
        }
    }
}