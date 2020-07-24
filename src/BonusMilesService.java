public class BonusMilesService {
    public int calculate(int cost) {
        int rubles = 20;
        int miles = cost / rubles;

        return (int) miles;
    }
}

