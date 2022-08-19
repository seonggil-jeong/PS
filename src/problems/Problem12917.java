package problems;

import java.util.Arrays;
import java.util.Comparator;

public class Problem12917 {
    public static void main(String[] args) {
        final String s = "Zbcdefg";

        System.out.println(solution(s));

    }
    public static String solution(String s) {
        StringBuilder answer = new StringBuilder("");

        Arrays.stream(s.split("")).sorted(Comparator.reverseOrder()).forEach(a -> answer.append(a));

        return answer.toString();
    }
}
