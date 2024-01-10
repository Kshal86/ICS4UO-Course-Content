
import java.util.Scanner;

public class KushalPrajapati_Exercise16 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Boolean [] array = {true, false , false , true , true , true , false , false};
        int count = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] == true){
                count++;
            }
        }
        System.out.println(count);
    }
}
