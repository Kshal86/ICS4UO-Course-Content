import java.util.Scanner;
public class KushalPrajapati_Exercise31 {
    public static void main(String[] args) {

        //$1000 is deposited in a bank account for 10 years, and collects interest at an annual rate of 4%.  Write a program which outputs the following data in a neat table for the ten year period: year, starting balance, interest earned, ending balance
        //Modify so that it is interactive! Have the program ask the user how much to deposit, what the interest rate is, and how many years the money should be left in the account. Then generate a table based on these numbers.

        Scanner input= new Scanner(System.in);
        System.out.println("Enter the amount to deposit: ");
        int amount=input.nextInt();
        System.out.println("Enter the interest rate: ");
        int interestRate=input.nextInt();
        System.out.println("Enter the number of years: ");
        int years=input.nextInt();
        int interest=0;
        int moneyInAccount=0;
        int startingBalance=0;

        for (int i=1;i<=years;i++) {
            interest=amount*interestRate;
            moneyInAccount=amount+interest;
            System.out.println("The interest after "+i+" year is: "+interest);
            System.out.println("The money in account after "+i+" year is: "+moneyInAccount);
            amount=moneyInAccount;
        }

        System.out.println("The interest after "+years+" years is: "+interest);
    }
}