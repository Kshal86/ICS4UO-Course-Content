import java.util.Scanner;

class Exercise_6_KushalPrajapati {
    public static void main(String[] args) {
     
        try (Scanner sc = new Scanner(System.in)){

        System.out.println("Enter Birth Year : ");
        int birthYear = sc.nextInt();
        int age= 2023-birthYear;
        System.out.println("You must be "+age+" years old");

    
           
     }
    }
}