import java.util.Scanner;
public class KushalPrajapati_Exercise32 {
    public static void main(String[] args) {

       //A homeowner takes out a mortgage for $225,000 at an annual interest rate of 6.75%. A payment of $25,000 is made at the end of each year. Output a neat table that displays the first ten years data : year, beginning balance, interest payable, principal payment, ending balance.
        //Modify the above so that it is interactive! Ask the user how much should be borrowed, what the interest rate is, how much should be paid back every year, ...

        Scanner input= new Scanner(System.in);
        System.out.println("Enter the amount to borrow: ");
        int amount=input.nextInt();
        System.out.println("Enter the interest rate: ");
        int interestRate=input.nextInt();
        System.out.println("Enter the amount to pay back every year: ");
        int payBack=input.nextInt();
        int interest=0;
        int moneyInAccount=0;
        int startingBalance=0;

        for (int i=1;i<=10;i++) {
            interest=amount*interestRate;
            moneyInAccount=amount+interest;
            System.out.println("The interest after "+i+" year is: "+interest);
            System.out.println("The money in account after "+i+" year is: "+moneyInAccount);
            amount=moneyInAccount-payBack;
        }

        System.out.println("The interest after 10 years is: "+interest);


    }
}