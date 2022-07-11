package heap;

import java.util.PriorityQueue;

public class Problem42626 {
    public static void main(String[] args) {
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K = 7;

        int answer = solution(scoville, K);
        System.out.println(answer);
    }

    private static int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for (Integer i : scoville) {
            heap.offer(i);
        }

        while (heap.peek() <= K) { // Min / 가장 작은 값이 K 보다 작다면 실행

            if (heap.size() == 1) { // 하나만 남았을 경우 (모든 음식의 스코빌 지수를 K 이상으로 만들 수 없는 경우)
                return -1;
            }
            int a = heap.poll(); // 가장 작은 값
            int b = heap.poll(); // 2 번 째로 작은 값


            // 섞은 음식의 스코빌 지수 = 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)
            int result = a + (b * 2);


            // PriorityQueue 에 저장 및 횟 수 증가


            heap.offer(result);
            answer++;

        }
        return answer;
    }
}
