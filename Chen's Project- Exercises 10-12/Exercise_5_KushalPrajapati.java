
import java.util.Scanner;

public class Exercise_5_KushalPrajapati {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);//Scanner class

        System.out.println("Enter the total number of hours worked");
        int hours=sc.nextInt();//Input hours
        if (hours>40){
            double overtime=hours-40;
            double pay=(40*14.50)+(overtime*17.00);
            System.out.println("The gross weekly pay is $"+pay);
        }
        else{
            double pay=hours*14.50;
            System.out.println("The gross weekly pay is $"+pay);
        }


    }
}


