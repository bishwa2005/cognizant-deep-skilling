public class GrowthEstimator {

    static double calculateAmount(
            double principal,
            double increaseRate,
            int duration) {

        if(duration == 0)
            return principal;

        return calculateAmount(
                principal,
                increaseRate,
                duration - 1)
                * (1 + increaseRate);
    }

    public static void main(String[] args) {

        double answer =
            calculateAmount(
                    5000,
                    0.08,
                    6);

        System.out.println(answer);
    }
}