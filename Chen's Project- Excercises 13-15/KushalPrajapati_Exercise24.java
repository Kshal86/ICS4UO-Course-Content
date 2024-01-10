import java.util.Scanner;
public class KushalPrajapati_Exercise24 {
    public static void main(String[] args) {

        // An arithmetic series can be modeled with the formula sn = (n/2) [2a + (n -1) d] where n is the number of terms in a sequence, a is the first value, and d is the difference between terms (amount of the step). Create variables for each of n, a, d and prompt the user for their values. Calculate the sum using the formula.

        int n=0;
        int a=0;
        int d=0;
        int sum=0;
        Scanner input= new Scanner(System.in);

        System.out.println("Enter the number of terms in the sequence: ");
        n=input.nextInt();
        System.out.println("Enter the first value: ");
        a=input.nextInt();
        System.out.println("Enter the common difference: ");
        d=input.nextInt();

        for (int i=1;i<=n;i++){
            sum+=((n/2)*(2*a+(n-1)*d));

        }

        System.out.println("The sum of the sequence is: "+sum);
    }
}