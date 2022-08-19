package problems;

import java.util.Arrays;

public class Problem86491 {
    public static void main(String[] args) {
        int[][] sizes = {
                {60, 50},
                {30, 70},
                {60, 30},
                {80, 40}};

        System.out.println(solution(sizes));

    }

    public static int solution(final int[][] sizes) {
        int maxX = 0;
        int maxY = 0;

        for (int[] size : sizes) {
            maxX = Math.max(maxX, Math.max(size[0], size[1]));
            maxY = Math.max(maxY, Math.min(size[0], size[1]));
        }

        return maxX * maxY;
    }
}
