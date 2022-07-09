package problems;

public class Problem76501 {
    public static void main(String[] args) {
        int[] absolutes = {4, 7, 12};
        boolean[] signs = {true, false, true};

        int answer = solution(absolutes, signs);

        System.out.println(answer);
    }

    private static int solution(int[] absolutes, boolean[] signs) {
        int answer = 123456789;
        answer = 0;

        for (int i = 0; i < absolutes.length; i++) {
            answer += signs[i] == true ? absolutes[i] : absolutes[i] * -1;
        }


        return answer;
    }
}
