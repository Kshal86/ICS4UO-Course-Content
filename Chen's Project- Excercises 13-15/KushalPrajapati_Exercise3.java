import java.util.Scanner;

public class KushalPrajapati_Exercise3 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        int counter=0;
        int number=5;
        while (number!=0){
            System.out.println("Enter a number: ");
            number=input.nextInt();
            System.out.println("The number is: "+number);
            System.out.println("Two times the number is: "+(number*2));
            System.out.println("Three times the number is: "+(number*3));
            counter ++;

        }
        System.out.println("Number of times executed: "+counter);

    }
}
