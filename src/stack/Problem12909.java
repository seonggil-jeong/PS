package stack;

import java.util.Stack;

public class Problem12909 {
    public static void main(String[] args) {
        String s = "()()";

        boolean answer = solution(s);
        System.out.println(answer);
    }

    private static boolean solution(String s) {
            boolean answer = true;
            Stack<Character> stack = new Stack<>();
            if (s.charAt(0) == ')' || s.charAt(s.length() - 1) == '(') { // ')' 로 시작 or '(' 로 끝 = false
                return false;
            }

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') {
                    stack.push(s.charAt(i));
                    answer = false;
                } else if (s.charAt(i) == ')') {
                    if (!stack.isEmpty()) {
                        answer = true;
                        stack.pop();
                    } else {
                        return false;
                    }

                }
            }
            if (!stack.isEmpty()) { // 만약 남은 '(' 가 있다면 false
                answer = false;
            }

            return answer;
        }
}
