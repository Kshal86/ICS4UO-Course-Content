
import java.util.Scanner;

public class Exercise_6_KushalPrajapati {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);//Scanner class

        System.out.println("Enter the total number of cones sold:");
        int cones=sc.nextInt();//Input cones
        int bonus=0;

        if (cones<150){
            bonus+=10;
        }
        else if (cones>150){
            int bonus1=cones-150;
            bonus+=(bonus1*0.10);

        }
        else if (cones>250){
            int bonus2=cones-250;
            bonus+=(bonus2*0.25);
        }

        else if (cones>350){
            int bonus3=cones-350;
            bonus+=(bonus3*0.35);
        }

        System.out.println("The bonus is: "+bonus);
    }
}






