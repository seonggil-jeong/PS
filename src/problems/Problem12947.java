package problems;

import java.util.Arrays;

public class Problem12947 {
    public static void main(String[] args) {
        final int x = 10;


        System.out.println(solution(x) == true);
    }

    private static boolean solution(int x) {

        return x % Arrays.stream(String.valueOf(x).split(""))
                .mapToInt(value -> Integer.parseInt(value)).sum() == 0
                ? true : false;
    }
}
