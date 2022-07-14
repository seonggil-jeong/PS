package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Problem12906 {
    public static void main(String[] args) {
        int[] arr = {4,4,4,3,3};


        int[] answer = solution(arr);


        System.out.println(answer);



    }


    public static int[] solution(int []arr) {
        List<Integer> integerList = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (stack.isEmpty()) {
                integerList.add(arr[i]);
                stack.push(arr[0]);
            } else {
                int stackNumber = stack.peek();
                if (stackNumber == arr[i]) {
                    continue;
                } else {
                    integerList.add(arr[i]);
                    stack.pop();
                    stack.push(arr[i]);
                }
            }
        }
        int[] answer = new int[integerList.size()];

        for (int i = 0; i < integerList.size(); i++) {
            answer[i] = integerList.get(i);

        }

        return answer;
    }
}
