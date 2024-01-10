import java .util.Scanner;
public class KushalPrajapati_Exercise8 {
    public static void main(String[] args) {

        int number =0;
        Scanner input= new Scanner(System.in);
        do {
            System.out.println("The number is: "+number);
            System.out.println("Enter an integer: ");
            number=input.nextInt();
        } while (number!=-1000);


    }
}