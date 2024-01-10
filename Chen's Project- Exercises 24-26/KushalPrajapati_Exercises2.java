
import java.util.Scanner;
public class KushalPrajapati_Exercises2 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int [] x= {60, 78, 74, 80, 74, 78, 88, 90, 74, 68};
        int [] temp= x;

        for (int i=0; i<temp.length; i++) {
            System.out.println("What should the value of the element at index " + (i+1) + " be?");
            temp[i]= sc.nextInt();
        }

        System.out.println("The values of the new array x are:");
        for (int i=0; i<x.length; i++) {
            System.out.println(x[i]);
        }
    }
}

