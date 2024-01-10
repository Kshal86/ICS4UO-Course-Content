import java.util.Scanner;

public class KushalPrajapati_Exercise4 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        // Create a program that firsts asks the user to enter what a test is out of. This program will then continually ask for scores of students and print a mark as a percentage until a negative number is entered. Do not find the percentage of a negative number.

        System.out.println("Enter what the test is out of: ");
        int test=input.nextInt();
        System.out.println("Enter the score of the student: ");
        int score=input.nextInt();
        while (score>=0){
            System.out.println("The percentage of the student is: "+(score*100/test)+"%");
            System.out.println("Enter the score of the student: ");
            score=input.nextInt();


        }

    }
}
