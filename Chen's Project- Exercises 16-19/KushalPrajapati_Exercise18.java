
import java.util.Scanner;
public class KushalPrajapati_Exercise18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int total = 0;
        for (int c = 0; c<=10;  c=c+1) {

            System.out.println("Enter an integer");
            int number=sc.nextInt();
            total=total+number;
        }

        System.out.println("The average is "+total/10);
    }
}
