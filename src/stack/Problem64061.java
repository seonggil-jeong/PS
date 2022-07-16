package stack;


import java.util.*;

public class Problem64061 {
    public static void main(String[] args) {
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};

        int answer = solution(board, moves);

        System.out.println(answer);
    }

    private static int solution(int[][] board, int[] moves) {
        int answer = 0;
        List<Stack<Integer>> stackList = new LinkedList<>();

        for (int i = 0; i < board.length; i++) {

            Stack<Integer> stack = new Stack<>();
            for (int j = 0; j < board.length; j++) {
                if (board[j][i] > 0) {
                    stack.push(board[j][i]);
                }
            }

            Collections.reverse(stack);
            stackList.add(stack);
        }
        System.out.println(stackList);


        Stack<Integer> resultStack = new Stack<>();
        for (Integer location : moves) {
            if (stackList.get(location - 1).size() == 0) {
                continue;
            }

            int value = stackList.get(location - 1).peek();

            if (resultStack.isEmpty()) {
                resultStack.push(value);
            } else if (resultStack.peek() == value) {
                answer += 2;
                resultStack.pop();
            } else {
                resultStack.push(value);
            }
            stackList.get(location - 1).pop();

        }


        return answer;
    }
}
