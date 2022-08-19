package problems;


import java.util.Arrays;

public class Problem118667 {
    public static void main(String[] args) {
        int[] queue1 = {3, 2, 7, 2};
        int[] queue2 = {4, 6, 5, 1};


        System.out.println(solution(queue1, queue2));

    }

    public static int solution(int[] queue1, int[] queue2) {
        final int length1 = queue1.length;
        final int length2 = queue2.length;
        final long sum1 = Arrays.stream(queue1).sum();
        final long sum2 = Arrays.stream(queue2).sum();
        int[] arr = new int[(length1 + length2) * 2];
        int index = 0;
        int end;
        long bigSum = Math.max(sum1, sum2);

        if (sum1 > sum2) {
            for (int valueInQueue1 : queue1) {
                arr[index++] = valueInQueue1;
            }
            end = index - 1;
            for (int valueInQueue2 : queue2) {
                arr[index++] = valueInQueue2;
            }

        } else {
            for (int valueInQueue2 : queue2) {
                arr[index++] = valueInQueue2;
            }

            end = index - 1;

            for (int valueInQueue1 : queue1) {
                arr[index++] = valueInQueue1;
            }
        }


        int start = 0;
        int answer = 0;
        long same = (sum1 + sum2) / 2;

        while (true) {
            if (bigSum == same) {
                break;
            }else if (bigSum > same) {
                bigSum -= arr[start];
                arr[index++] = arr[start++];
                answer++;
            } else {
                end++;
                bigSum += arr[end];
                answer++;
            }


            if (index == arr.length) {
                return -1;
            }
        }
        return answer;
    }


}
