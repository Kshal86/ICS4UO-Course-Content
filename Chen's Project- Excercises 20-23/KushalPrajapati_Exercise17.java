

public class KushalPrajapati_Exercise17 {
    public static void main(String[] args) {

        int[] numbers = {23, 32, 4, 52, 42};
        int count = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] > 0){
                count++;
            }
        }
        System.out.println(count);

    }
}
