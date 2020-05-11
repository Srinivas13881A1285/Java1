/**
 * @author Srinivas_Chintakindhi
 */

public class RainWaterBetweenTowers {

    public static int getMaxRainWaterBetweenTowers(int[] towerHeights) {
        int maxSeenSoFar = 0;
        int[] maxSeenRight = new int[towerHeights.length];
        for (int i = towerHeights.length - 1; i >= 0; i--) {

            if (towerHeights[i] > maxSeenSoFar) {
                maxSeenSoFar = towerHeights[i];
            } else

                maxSeenRight[i] = maxSeenSoFar;
        }

        int maxSeenLeft = 0;
        int rainwater = 0;
        for (int i = 0; i < towerHeights.length; i++) {
            rainwater += Math.max(
                    Math.min(maxSeenRight[i], maxSeenLeft) - towerHeights[i],
                    0);
            if (towerHeights[i] > maxSeenLeft)
                maxSeenLeft = towerHeights[i];
        }

        return rainwater;
    }

    public static void main(String[] args) {
        getMaxRainWaterBetweenTowers(new int[]{1, 5, 2, 3, 1, 7, 2});
    }
}
