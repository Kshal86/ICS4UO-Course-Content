
import java.util.Scanner;

public class KushalPrajapati_Exercises3 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int [] x= {60, 78, 74, 80, 74, 78, 88, 90, 74, 68};
        int[]temp= new int[10];
        int num=10;

        for (int i=0; i<x.length; i++) {
            temp[i]=x[num-1];
            num--;
            System.out.println(temp[i]);
        }

        for (int i=0; i<x.length; i++) {
            System.out.println(x[i]);
        }
    }
}

