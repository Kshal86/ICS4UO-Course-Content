
import java.util.Scanner;

public class Exercise_4_KushalPrajapati {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);//Scanner class
        System.out.println("Enter a value for x for the formula y = (5x+l)/(x-6):\n");
        int x=sc.nextInt();//Input x
        int y=(5*x+1)/(x-6);//Formula for y
        if (x==6.0){
            System.out.println("The value of y is undefined");//Output y is undefined
        }
        else {
            System.out.println("The value of y is: " + y);//Output y
        }
    }
}


