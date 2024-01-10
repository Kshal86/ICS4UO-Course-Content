import java.util.Scanner;

public class KushalPrajapati_Exercise13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Write a program that prompts the user for a username and a password. If the username is “000000” and the password is “password”, output the string “access granted”, otherwise output “access denied, you have X more attempts” where X is the number of attempts at entering a correct username/password. The program will continue to prompt the user for the above information for three more times OR until the information is correct.
        String username = "";
        String password = "";
        int count = 0;
do {
            System.out.println("Enter the username: ");
            username = input.nextLine();
            System.out.println("Enter the password: ");
            password = input.nextLine();
            count++;
            if (username.equals("000000") && password.equals("password")) {
                System.out.println("Access granted!");
            } else if (count == 3) {
                System.out.println("Access denied!");
            } else {
                System.out.println("Access denied, you have " + (3 - count) + " more attempts");
            }
        } while (!username.equals("000000") || !password.equals("password") && count < 3);
    }
}