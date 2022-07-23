package problems;

public class Problem87389 {
    public static void main(String[] args) {
        int n = 12;

        int answer = solution(n);
        System.out.println(answer);
    }

    private static int solution(int n) {
        int answer = 1;

        while (true) {
            if (n % answer == 1) {
                return answer;
            }

            answer++;

        }
    }
}
