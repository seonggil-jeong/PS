package problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class Problem12915 {
    public static void main(String[] args) {
        final String[] strings = {"abce", "abcd", "cdx"};

        System.out.println(solution(strings, 1)[0]);
        System.out.println(solution(strings, 1)[1]);
        System.out.println(solution(strings, 1)[2]);

    }

    private static String[] solution(String[] strings, int n) {
        Arrays.sort(strings);

        String[] answer = Arrays.stream(strings)
                        .sorted((o1, o2) -> String.valueOf(o1.charAt(n)).compareTo(String.valueOf(o2.charAt(n))))
                .toArray(String[]::new);

        return answer;
    }
}
