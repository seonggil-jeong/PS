package stack;

import javax.xml.stream.events.Characters;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Problem12973 {
    public static void main(String[] args) {
        String s = "cdcd";
        int answer = solution(s);

        System.out.println(answer);

    }

    private static int solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (Character c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }


        return stack.isEmpty() ? 1 : 0;


    }
}
