
import java.util.Scanner;
public class Exercise_1_KushalPrajapati {


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);//Scanner class
        System.out.println("Enter Student Number: ");//Enter Student Number
        int Student_num=sc.nextInt();//Input Student Number
        System.out.println("Enter Mark: ");//Enter Mark
        int Mark=sc.nextInt();//Input Mark

        if (Mark>=50){//If Mark is greater than or equal to 50
            System.out.println("Satisfactory");// Output Satisfactory
        }
        else{
            System.out.println("Unsatisfactory-Parental Interview Required");//if Mark is less than 50 then Output Unsatisfactory-Parental Interview Required

        }
    }

}


