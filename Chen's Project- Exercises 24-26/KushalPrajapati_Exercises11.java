

class KushalPrajapati_Exercises11 {

    public static int digit(int a, int position) {
        // convert n to string
        String n = String.valueOf(a);

        int[] num = new int[5];
        for (int i = 0; i < 5; i++) {
            num[i] = n.charAt(i);
        }
        return num[position];
    }

    public static void main(String[] args) {
        int a = 12345;
        int position = 2;
        System.out.println(digit(a, position));
    }
}