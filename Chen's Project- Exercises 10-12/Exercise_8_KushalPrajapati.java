import java.util.Scanner;

public class Exercise_8_KushalPrajapati {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);//Scanner class
    System.out.println("Enter the age of the moviegoer:");
    int age=sc.nextInt();//Input age
    int ticket_price=20;
    final double discount_rate=0.90;


    if ((age>65)||(age<5)){
        System.out.println("This moviegoer qualifies for a discount rate.");
        int finalPrice=(int)(ticket_price*discount_rate);

        System.out.println("The ticket price is "+ finalPrice);
    }
    else {
        System.out.println("The ticket price is "+ticket_price);
    }
    }
}





