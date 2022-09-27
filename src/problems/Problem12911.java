package problems;

public class Problem12911 {
    public static void main(String[] args) {
        int n = 15;



        System.out.println(solution(n));
    }


    public static int solution(int n) {
        int nBitCount = Integer.bitCount(n);

        int answer = n + 1;

        while (true) {
            if (nBitCount == Integer.bitCount(answer)) {
                return answer;
            }

            answer++;

        }

    }
}
