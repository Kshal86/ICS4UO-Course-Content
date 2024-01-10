import java.util.Scanner;

class Exercise_4_KushalPrajapati {
    public static void main(String[] args) {
     
        try (Scanner sc = new Scanner(System.in)){

        System.out.println("Enter the total number of hours");
        int hours = sc.nextInt();
        double numdays= hours/24.0;
        System.out.println("There are " + numdays + " days in " + hours + " hours");


        }
           
    }
}