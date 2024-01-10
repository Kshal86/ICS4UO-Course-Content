import java.util.Scanner;

class Exercise_5_KushalPrajapati {
    public static void main(String[] args) {
     
        try (Scanner sc = new Scanner(System.in)){

        System.out.println("Enter the total number of minutes");
        double minutes = sc.nextDouble();
        double days=(minutes/60)/24;
        System.out.println("There are " + days + " days in " + minutes + " minutes");
    

        }
           
    }
}