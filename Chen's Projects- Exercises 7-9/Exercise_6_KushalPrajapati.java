public class Exercise_6_KushalPrajapati {

    public static void main(String[] args) {

        double mark1 = 80.5;
        double mark2 = 77.5;
        double mark3 = 85;
        double mark4 = 70.2;
        double average = ((mark1+mark2+mark3+mark4)/4);
        System.out.println(Math.ceil(average));
        System.out.println(Math.floor(average));
        double high, low;
        low = Math.min(mark1, mark2);
        high = Math.max(Math.max(Math.max(mark1,mark2),mark3),mark4);
        System.out.println(low + " " + high);

    }
}
