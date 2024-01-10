public class Methods {


    public static void difference(int x, int y){
        System.out.println("The difference between " + x + " and " + y + " is " + (x - y));
    }

    public static void squarediff(int x, int y){

        double a= Math.pow(x,2);
        double b= Math.pow(y,2);
        System.out.println("The difference between " + a + " and " + b + " is " + (a - b));
    }

    public static void Exp(int x, int y){

        double a= Math.pow(x,y);
        System.out.println("The exponential of " + x + " and " + y + " is " + a);
    }

    public static void GCF(int x, int y){

            int a= Math.min(x,y);
            int b= Math.max(x,y);
            int c=0;
            for(int i=1;i<=a;i++){
                if(a%i==0 && b%i==0){
                    c=i;
                }
            }
            System.out.println("The GCF of " + x + " and " + y + " is " + c);
    }

}
