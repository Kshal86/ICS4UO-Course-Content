import java.util.Scanner;
public class KushalPrajapati_Exercise30 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the initial balance: ");
        int initialBalance=input.nextInt();
        System.out.println("Enter the interest rate: ");
        int interestRate=input.nextInt();
        int interest=0;
        int moneyInAccount=0;
        for (int i=1;i<=5;i++) {
            interest=initialBalance*interestRate;
            moneyInAccount=initialBalance+interest;
            System.out.println("The interest after "+i+" year is: "+interest);
            System.out.println("The money in account after "+i+" year is: "+moneyInAccount);
            initialBalance=moneyInAccount;
        }
        System.out.println("The interest after 5 years is: "+interest);
    }
}