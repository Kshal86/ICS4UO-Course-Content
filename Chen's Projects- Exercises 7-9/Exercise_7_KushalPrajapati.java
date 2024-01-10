public class Exercise_7_KushalPrajapati {

    public static void main(String[] args) {

        double place = 0.01;
        double unrounded = 3.14159;
        double result = Math.round(unrounded/place)*place;
        System.out.println(result);
    }
}
