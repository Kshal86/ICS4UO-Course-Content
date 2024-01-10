class KushalPrajapati_Exercise18 {
    public static void main(String[] args) {


        int[] Raptors = {118, 104, 123, 105, 105, 114, 0};
        int[] Warriors = {109, 109, 109, 92, 106, 110, 0};


        for (int i = 0; i < Raptors.length; i++) {
            if (Raptors[i] > Warriors[i]) {
                System.out.println("Raptors won game " + (i + 1) + " by " + (Raptors[i] - Warriors[i]) + " points.");
            } else if (Raptors[i] < Warriors[i]) {
                System.out.println("Warriors won game " + (i + 1) + " by " + (Warriors[i] - Raptors[i]) + " points.");
            } else {
                System.out.println("Game " + (i + 1) + " was a tie.");
            }
        }
    }
}