package problems;

import java.util.Arrays;

public class Problem12939 {

    public static void main(String[] args) {
        String s = "1 2 3 4";

        long start = System.nanoTime();
        System.out.println(solution(s));
        System.out.println("solution1 : " + (System.nanoTime() - start));

        start = System.nanoTime();
        System.out.println(solution2(s));
        System.out.println("solution2 : " + (System.nanoTime() - start));
    }


    public static String solution(String s) {
        StringBuffer answer = new StringBuffer("");

        return answer.append(Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).min().getAsInt() + " ")
                .append(Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).max().getAsInt()).toString();
    }


    public static String solution2(String s) {
        String result = "";
        String[] blank = s.split(" ");

        int max, min;
        max = Integer.parseInt(blank[0]);
        min = max;
        for (int i = 0; i < blank.length; i++) {
            if (Integer.parseInt(blank[i]) > max) {
                max = Integer.parseInt(blank[i]);
            }
            if (Integer.parseInt(blank[i]) < min) {
                min = Integer.parseInt(blank[i]);
            }
        }
        result = min + " " + max;
        return result;
    }
}
