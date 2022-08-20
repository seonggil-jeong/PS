package problems;

import java.util.stream.Collectors;

public class Problem12926 {
    public static void main(String[] args) {
        final String s = "AB";
        final int n = 1;

        System.out.println(solution(s, n).equals("BC"));

    }

    public static String solution(String s, int n) {

        return s.chars().map(operand -> {
                    if (operand < 65) {
                        return operand;
                    } else {
                        if (operand < 97) return (operand - 65 + n) % 26 + 65;
                        else return (operand - 97 + n) % 26 + 97;
                    }
                }).mapToObj(m -> Character.toString((char) m))
                .collect(Collectors.joining());
    }
}
