package problems;

import java.util.*;

public class Problem86051 {
    public static void main(String[] args) {
        int[] numbers = {5, 8, 4, 0, 6, 7, 9};

        int answer = solution(numbers);

        System.out.println(answer);

    }


    private static int solution(int[] numbers) {
        int answer = 45;

        answer -= Arrays.stream(numbers).sum();

        return answer;
    }

}
