import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author Srinivas_Chintakindhi
 */

public class GameTiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tCases = scanner.nextInt();

        for (int t = 0; t < tCases; t++) {
            int n = scanner.nextInt();
            int[][] tiles = new int[n][3];


            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 3; j++) {
                    tiles[i][j] = scanner.nextInt();
                }
            }

            int max  = 0;
            int[][] result = new int[n][3];

            result[0][0] = tiles[0][0];
            result[0][1] = tiles[0][1];
            result[0][2] = tiles[0][2];

            for (int i = 1; i < n; i++) {
                int prevRow = i - 1;
                int secondPrevRow = i - 2;
                int thirdPrevRow = i - 3;

                for (int j = 0; j < 3; j++) {
                    int value1 = 0;
                    int value2 = 0;
                    int value3 = 0;

                    if (prevRow >= 0) {
                        List<Integer> integers = Arrays.asList(tiles[prevRow][0], tiles[prevRow][1], tiles[prevRow][2]);
                        Collections.sort(integers);
                        int small = integers.get(0);
                        value1 = tiles[i][j] + small;
                    } else {
                        value1 = tiles[i][j];
                    }

                    if (secondPrevRow >= 0) {
                        List<Integer> integers = Arrays.asList(tiles[secondPrevRow][0], tiles[secondPrevRow][1], tiles[secondPrevRow][2]);
                        Collections.sort(integers);
                        int medium = integers.get(1);
                        value2 = tiles[i][j] + medium;
                    } else {
                        value2 = tiles[i][j];
                    }

                    if (thirdPrevRow >= 0) {

                        List<Integer> integers = Arrays.asList(tiles[thirdPrevRow][0], tiles[thirdPrevRow][1], tiles[thirdPrevRow][2]);
                        Collections.sort(integers);
                        int large = integers.get(2);
                        value3 = tiles[i][j] + large;
                    } else {
                        value3 = tiles[i][j];
                    }

                    result[i][j] = Math.max(value1, Math.max(value2, value3));
                    max = Math.max(max,result[i][j]);
                }
            }
            System.out.println("max = " + max);
        }
    }
}
