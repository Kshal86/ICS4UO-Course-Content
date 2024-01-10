
import java.util.Scanner;
public class KushalPrajapati_Exercise15 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int [] marks = {66, 78, 74, 100, 40, 78, 88, 90, 33};
        for (int i = 0; i < marks.length; i++){
            System.out.println(marks[i]);
        }
        System.out.println("Every other index starting with 0");
        for (int i = 0; i < marks.length; i+=2){
            System.out.println(marks[i]);
        }
        System.out.println("Every other index starting with 1");
        for (int i = 1; i < marks.length; i+=2){
            System.out.println(marks[i]);
        }
        System.out.println("Valid marks");
        for (int i = 0; i < marks.length; i++){
            if (marks[i] >= 0 && marks[i] <= 100){
                System.out.println(marks[i]);
            }
        }
        System.out.println("Marks above the prompted value");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a mark: ");
        int mark = input.nextInt();
        for (int i = 0; i < marks.length; i++){
            if (marks[i] > mark){
                System.out.println(marks[i]);
            }
        }
        System.out.println("Search for a mark");
        System.out.println("Enter a mark: ");
        int mark2 = input.nextInt();

        for (int i = 0; i < marks.length; i++){
            if (marks[i] == mark2){
                System.out.println("The mark has been found");
            }
        }
        System.out.println("Search for a mark and stop once found");
        System.out.println("Enter a mark: ");
        int mark3 = input.nextInt();

        for (int i = 0; i < marks.length; i++){
            if (marks[i] == mark3){
                System.out.println("The mark has been found");
                break;
            }
        }
        System.out.println("Search for a mark and count how many times it appears");
        System.out.println("Enter a mark: ");
        int mark4 = input.nextInt();
        int count = 0;
        for (int i = 0; i < marks.length; i++){
            if (marks[i] == mark4){
                count++;
            }
        }
        System.out.println("The mark has been found " + count + " times");



    }




}
