
class KushalPrajapati_Exercises10 {


    public static Double norm (Double x, Double y, Double z){

        return(Math.pow(Math.pow(x,2)+Math.pow(y,2)+Math.pow(z,2),0.5));

    }
    public static void main(String[] args) {
        Double x;
        x= norm(9.0,9.0,10.0);
        System.out.println(x);

    }
}