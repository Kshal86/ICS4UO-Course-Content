
import java.util.Scanner;

public class Exercise_7_KushalPrajapati {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);//Scanner class
        System.out.println("Enter a");
        int a=sc.nextInt();//Input a
        System.out.println("Enter b");
        int b=sc.nextInt();//Input b
        System.out.println("Enter c");
        int c_input=sc.nextInt();//Input c

        double c_formula=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));//Formula for area
        if (c_input==c_formula){//If c is right-angled
            System.out.println("The triangle is right-angled");//Output
            double area=(a*b)/2.0;
            System.out.println("The area of the triangle is: "+area);//Output
        }
        else{ //If c is not right-angled
            System.out.println("The triangle is not right-angled");// Output not right-angled
            double s=0.5*(a+b+c_input);//Formula for s
            double area=Math.sqrt(s*(s-a)*(s-b)*(s-c_input));//Formula for area
        }

    }
}






