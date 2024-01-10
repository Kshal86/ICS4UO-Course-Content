import java.util.Scanner;

public class KushalPrajapati_Exercise14 {
    public static void main(String[] args) {


        Scanner input= new Scanner(System.in);
        int number=0;
        int sum=0;
        int digit=0;
        do {
            System.out.println("Enter a positive integer: ");
            number=input.nextInt();
        } while (number<0);

        do {
            digit=number%10;
            sum+=digit;
            number=number/10;
        } while (number>0);
        System.out.println("The sum of the digits is: "+sum);


    }
}