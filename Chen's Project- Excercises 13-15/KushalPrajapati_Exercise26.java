
import java.util.Scanner;
public class KushalPrajapati_Exercise26 {
    public static void main(String[] args) {

       //Write a program that will prompt the user for the first term (first), last term (last), and common ratio (rat) of a geometric sequence. Output the sequence up until the last term and the sum of the sequence.

            Scanner input= new Scanner(System.in);
            System.out.println("Enter the first term: ");
            int first=input.nextInt();
            System.out.println("Enter the last term: ");
            int last=input.nextInt();
            System.out.println("Enter the common ratio: ");
            int rat=input.nextInt();
            int sum=0;

            for (int i=first;i<=last;i*=rat) {
                System.out.println(i);
                sum+=i;

            }
            System.out.println("The sum of the sequence is: "+sum);

    }
}