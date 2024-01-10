
import java.util.Scanner;
public class Exercise_3_KushalPrajapati {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);//Scanner class
        System.out.println("Enter a number");
        int num=sc.nextInt();
        if (num%5==0) {
            System.out.println(num+"is divisible by 5");
        }
        else {
            System.out.println(num+"is not divisible by 5");
        }
    }
}


