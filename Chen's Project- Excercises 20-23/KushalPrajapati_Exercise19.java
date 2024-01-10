
// Name: Kushal Prajapati
// Date: 2023-04-26
// Description: The purpose of this code is to make a functioning speed dial component.
// This code allows you to store different numbers within an array
// After saving the number, using the menu you can navigate whether you want to print the number or exit the program
// If you chose to press exit, the menu will close and the program will be terminated

import java.util.Scanner; // importing scanner class
class KushalPrajapati_Exercise19 {
    public static void main(String[] args) { // main method
        Scanner sc= new Scanner(System.in);
        System.out.println("1. Enter a number"); // creating a menu
        System.out.println("2. Dial a number");
        System.out.println("3. Exit ");

        System.out.println("Enter your choice"); // asking for user input
        int choice = sc.nextInt();
        int [] numbers = new int[10];
        if (choice==1){
            System.out.println("Enter the speed dial number (1-10)"); // asking for user input
            int speedDialNumber = sc.nextInt()-1;
            System.out.println ("Enter a phone number");
            int number =sc.nextInt();
            numbers[speedDialNumber]=number;

        }

        if (choice==2){

            System.out.println("Enter the speed dial number (1-10)");
            int speedDialNumber = sc.nextInt()-1;
            System.out.println("Dialing "+numbers[speedDialNumber]);
            System.out.println("Dial"+"......" );

        }

        if (choice==3){

            System.out.println("Exiting...");
            System.exit(0);
        }


        }
    }

