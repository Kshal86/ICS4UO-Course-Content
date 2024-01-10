

public class Methods {

    public static int Batting_Average(int hits, int at_bats){
        return hits/at_bats;
    }

    public static double On_Base_Percentage(int hits, int walks, int at_bats, int sacrifice_flies){
        return ((double) (hits + walks) /(at_bats + walks + sacrifice_flies));
    }

    public static double Slugging_Percentage(int singles, int doubles, int triples, int home_runs, int at_bats){
        return ((double) (singles + (2 * doubles) + (3 * triples) + (4 * home_runs)) / at_bats);
    }

    public static double On_Base_Plus_Slugging(int hits, int walks, int at_bats, int sacrifice_flies, int singles, int doubles, int triples, int home_runs){
        return (On_Base_Percentage(hits, walks, at_bats, sacrifice_flies) + Slugging_Percentage(singles, doubles, triples, home_runs, at_bats));
    }

    public static double Earned_Runs_Average(int earned_runs, int innings_pitched){
        return ((double) (earned_runs * 9) / innings_pitched);
    }

    public static double Walks_plus_Hits_per_Innings_Pitched(int walks, int hits, int innings_pitched){
        return ((double) (walks + hits) / innings_pitched);
    }





}
