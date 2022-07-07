package greedy;

public class Problem42883 {
    public static void main(String[] args) {
        String number = "1891234"; // 7
        int k = 3;

        String answer = solution(number, k);

        System.out.println(answer);

    }

    public static String solution(String number, int k) {
        StringBuilder answer = new StringBuilder("");
        int answerLen = number.length() - k;
        int startIndex = 0;

        while (startIndex < number.length() & answer.length() != answerLen) {
            int num = k + answer.length() + 1;
            int max = 0;

            for (int j = startIndex; j < num; j++) {
                if (max < number.charAt(j)) {
                    max = number.charAt(j);
                    startIndex = j + 1;
                }
            }
            answer.append(Integer.toString(max - '0'));


        }
        return answer.toString();
    }
}
