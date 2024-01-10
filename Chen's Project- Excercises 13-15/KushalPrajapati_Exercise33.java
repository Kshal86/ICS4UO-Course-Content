import java.util.Scanner;
public class KushalPrajapati_Exercise33 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount to borrow: ");
        int amount = input.nextInt();
        System.out.println("Enter the interest rate: ");
        int interestRate = input.nextInt();
        System.out.println("Enter the amount to pay back every year: ");
        int payBack = input.nextInt();
        int interest = 0;
        int moneyInAccount = 0;



        for (int i = 1; i <= 10; i++) {

            interest = amount * interestRate;
            moneyInAccount = amount + interest;
            System.out.println(i + "\t" + amount + "\t\t\t" + interest + "\t\t\t" + payBack + "\t\t\t" + (moneyInAccount - payBack));
            amount = moneyInAccount - payBack;
            System.out.println("Year\tBeginning Balance\tInterest Payable\tPrincipal Payment\tEnding Balance");
        }

        System.out.println("The interest after 10 years is: " + interest);
    }
}

