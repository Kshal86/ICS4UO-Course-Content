import java.util.Scanner;
public class KushalPrajapati_Exercise16 {
    public static void main(String[] args) {

        //Write a program that will prompt the user for the first value (first), last value (last), and common difference (diff) of an arithmetic sequence. Output the sum of the sequence.

        Scanner input= new Scanner(System.in);
        System.out.println("Enter the first value: ");
        int first=input.nextInt();
        System.out.println("Enter the last value: ");
        int last=input.nextInt();
        System.out.println("Enter the common difference: ");
        int diff=input.nextInt();
        int sum=0;

        for (int i=first;i<=last;i+=diff) {
            System.out.println(i);
            sum+=i;

        }
        System.out.println("The sum of the sequence is: "+sum);


    }
}