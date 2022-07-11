package heap;

import java.util.*;

public class Problem42627 {
    public static void main(String[] args) {
        int[][] jobs = {{0, 3}, {1, 9}, {2, 6}};


        int answer = solution(jobs);

        System.out.println(answer);

    }


    public static int solution(int[][] jobs) {
        int answer = 0;

        Arrays.sort(jobs, (a, b) -> a[0] - b[0]); // 요청 시간을 기준으로 정렬

        PriorityQueue<int[]> heap = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]); // 소요 시간을 기준으로 최소힙 구현

        int index = 0;
        int count = 0;
        int total = 0;
        int end = 0;
        while(count < jobs.length) { // 모든 작업이 완료 될 때 종료

            while(index < jobs.length && jobs[index][0] <= end) { // 소요 시간 안에 요청이 들어온다면 Heap 에 추가
                heap.add(jobs[index++]);
            }

            if(heap.isEmpty()) {
                end = jobs[index][0];
            } else {
                int[] job = heap.poll();
                total += job[1] + end - job[0];
                end += job[1];
                count++;
            }
        }
        return total / jobs.length;
    }
}
