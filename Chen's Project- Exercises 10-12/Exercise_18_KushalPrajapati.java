
import java.util.Scanner;

public class Exercise_18_KushalPrajapati {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);//Scanner class
        System.out.println("Enter the number of toppings");
        int toppings = sc.nextInt();//Input toppings
        System.out.println("Enter the size of the pizza");
        String size = sc.nextLine();//Input size
        System.out.println("Enter the delivery(d) or pickup(p)");
        String delivery = sc.nextLine();//Input delivery
        if (delivery.equals("d")) {
             int cost=2;
            }
        else if (delivery.equals("p")) {
            int cost=0;
        }


        int s=5;
        int m=6;
        int l=7;
        if (toppings==1){

            if (size.equals("s")){
                System.out.println("The cost of the pizza is:"+(0.75+s+cost));
            }
            else if (size.equals("m")){
                System.out.println("The cost of the pizza is:"+(2+m+cost));
            }
            else if (size.equals("l")){
                System.out.println("The cost of the pizza is:"+(1.25*3+l+cost));
            }


        }
        if (toppings==2){

            if (size.equals("s")){
                System.out.println("The cost of the pizza is:"+(0.70+s+cost));
            }
            else if (size.equals("m")){
                System.out.println("The cost of the pizza is:"+(0.90*2+m+cost));
            }
            else if (size.equals("l")){
                System.out.println("The cost of the pizza is:"+(1.00*3+l+cost));
            }
        }

        if (toppings==3){

            if (size.equals("s")){
                System.out.println("The cost of the pizza is:"+(0.65+s+cost));
            }
            else if (size.equals("m")){
                System.out.println("The cost of the pizza is:"+(0.80*2+ m+cost));
            }
            else if (size.equals("l")){
                System.out.println("The cost of the pizza is:"+(1.00*3+l+cost));
            }
        }

    }
}




