
import java.util.Scanner;

public class Exercise_9_KushalPrajapati {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);//Scanner class
        System.out.println("Enter the length");
        int length=sc.nextInt();
        System.out.println("Enter the width");
        int width=sc.nextInt();
        if ((width>0)&&(length>0)){
            System.out.println("The area is: "+(width*length));
        }
        else{
            System.out.println("Error: there cannot be a negative side length for a rectangle");
        }


    }
}






