package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem42748 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 5, 2, 6, 3, 7, 4};
        int[][] commands = new int[][]{
                {2, 5, 3},
                {4, 4, 1},
                {1, 7, 3}};


        System.out.println(solution(array, commands));

    }


    public static int[] solution(int[] array, int[][] commands) {
        List<Integer> answer = new ArrayList<>();

        Arrays.stream(commands)
                .forEach(command -> {
                    answer.add(Arrays.stream(Arrays.copyOfRange(array, command[0] - 1, command[1]))
                            .sorted().toArray()[command[2] - 1]);
                });


        return answer.stream().mapToInt(Integer::valueOf).toArray();
    }
}
