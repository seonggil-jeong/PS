package problems;

import java.util.*;

public class Problem77484 {
    public static void main(String[] args) {
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};


        int[] answer = solution(lottos, win_nums);


        System.out.printf("answer : %d %d", answer[0], answer[1]);

    }


    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int count = 0;



        Arrays.sort(lottos);

        // 0의 개수 만 큼 count
        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] != 0) {
                break;
            }
            count++;
        }

        Arrays.sort(win_nums);

        for (int j = 0; j < 6; j++) { // 항상 6자리
            for (int k = count; k < 6; k++) {
                if (win_nums[j] != lottos[k]) { // 같은 숫자가 있다면 ++ (6 X 6)
                    continue;
                }
                answer[0]++;
                answer[1]++;
            }
        }

        answer[0] += count; // 0 이 모두 맞은 경우를 더함

        for (int i = 0; i < 2; i++) {
            answer[i] = 7 - (answer[i] > 0 ? answer[i] : 1);
        }
        return answer;
    }
}
