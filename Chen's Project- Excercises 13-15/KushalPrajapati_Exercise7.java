public class KushalPrajapati_Exercise7 {
    public static void main(String[] args) {
        int animals=10;
        int food=1000;
        int counter=0;
        while (animals<food){
            animals=animals*2;
            food=food+4000;
            counter ++;
            System.out.println("The number of animals is: "+animals);
            System.out.println("The amount of food is: "+food);
            System.out.println("The number of hours is: "+counter);
        }

    }
}