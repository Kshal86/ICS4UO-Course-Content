


public class KushalPrajapati_Exercise4 {
    public static void main(String[] args) {

        boolean[] Array={true,false,false,true,true,true,false,false};
        for (int c=0;c<8;c++){
            if (Array[c]==true){
                Array[c]=false;
                System.out.println(Array[c]);
            }
            else{
                Array[c]=true;
                System.out.println(Array[c]);
            }

        }
    }
}
