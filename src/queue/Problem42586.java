package queue;

import java.util.*;

public class Problem42586 {
    public static void main(String[] args) {
        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};


        int[] answer = solution(progresses, speeds);

    }

    public static int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) {
            queue.add((int) (Math.ceil((100.0 - progresses[i]) / speeds[i])));
            // Math.ceil = -10.675 = -11.0
            // 걸리는 시간
        }

        List<Integer> answer = new ArrayList<>();

        while (!queue.isEmpty()) {
            int day = queue.poll(); // 값 가져오기

            int cnt = 1;

            while (!queue.isEmpty() && day >= queue.peek()) { // 걸리는 일 수 보다 지금 날짜가 크다면
                cnt++; // 값 증가 and poll
                queue.poll();
            }

            answer.add(cnt);
        }


        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

}
