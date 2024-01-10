import java.util.Scanner;

public class KushalPrajapati_Exercise2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int counter=0;
        String option=("y");
        while (option.equals("y")){
            System.out.println("I am so smart");
            System.out.println("Do you wish to continue? (y/n)");
            option=input.nextLine();
            counter ++;
        }
        System.out.println("Number of times executed: "+counter);
    }
}



