

import java.util.Scanner;
public class KushalPrajapati_Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] number = new String[10];
        int choice;
        do {
            System.out.println("1 - Enter a number");
            System.out.println("2 - Dial a number");
            System.out.println("3 - Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            if (choice == 1) {
                System.out.println("Enter the speed dial location (0-9): ");
                int location = input.nextInt();
                System.out.println("Enter the telephone number: ");
                number[location] = input.next();
            } else if (choice == 2) {
                System.out.println("Enter the speed dial location (0-9): ");
                int location = input.nextInt();
                if (number[location] == null) {
                    System.out.println("There is no current number stored in " + location);
                } else {
                    System.out.println("Dialing.....");
                    System.out.println(number[location]);
                }
            } else if (choice == 3) {
                System.out.println("Exiting...");
            } else {
                System.out.println("Invalid choice");

            }
        } while (choice != 3);

    }
}
