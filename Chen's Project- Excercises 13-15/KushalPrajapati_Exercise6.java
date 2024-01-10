public class KushalPrajapati_Exercise6 {
    public static void main(String[] args) {

        double price=427000;
        double finalPrice=376000;
        double counter=0;
        while (price>finalPrice){
            price=price-(price*0.05);
            counter ++;

        }

        System.out.println("The number of months it took for the price to reach this point is: "+counter);
    }
}