
import java.util.Scanner;

public class Exercise_10_KushalPrajapati {
    
    public static void main(String[] args) {

    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter Length: ");
        int Len=sc.nextInt();
        System.out.println("Enter Width: ");
        int Wid=sc.nextInt();
        System.out.println("Enter Depth: ");
        int Dep=sc.nextInt();

        int vol=Len*Wid*Dep;
        System.out.println(vol+"units cubed");
    }
        
    
    


    }
}
