import java.util.Scanner;

public class KushalPrajapati_Exercise11 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        String username="";
        String password="";
        int count=0;
        do {
            System.out.println("Enter the username: ");
            username=input.nextLine();
            System.out.println("Enter the password: ");
            password=input.nextLine();
            count++;
            if (username.equals("12345") && password.equals("pass")){
                System.out.println("Identity confirmed!");
            }
            else if (count==3){
                System.out.println("Access denied!");
            }
        } while (!username.equals("12345") || !password.equals("pass") && count<3);
    }
}