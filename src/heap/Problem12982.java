package heap;

import java.util.PriorityQueue;

public class Problem12982 {
    public static void main(String[] args) {
        int[] d = {2,2,3,3};
        int budget = 10;

        int answer = solution(d, budget);
        System.out.println(answer);
    }

    private static int solution(int[] d, int budget) {
        int answer = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for (Integer value : d) {
            heap.offer(value);
        }

        while (budget > 0 && !heap.isEmpty()) {
            int value = heap.poll();
            if (budget >= value) {
                answer++;
                budget -= value;
            }
        }


        return answer;
    }
}
