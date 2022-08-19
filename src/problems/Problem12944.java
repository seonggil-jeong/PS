package problems;

import java.util.Arrays;

public class Problem12944 {
    public static void main(String[] args) {
        final int[] arr = {1, 2, 3, 4};


        System.out.println(solution(arr));



    }

    private static double solution(int[] arr) {
        return (Arrays.stream(arr).sum() + 0.0) / arr.length;

    }


}
