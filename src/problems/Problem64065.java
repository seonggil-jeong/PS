package problems;

import java.util.*;

public class Problem64065 {
    public static void main(String[] args) {
        final String s = "{{20,111},{111}}";

        System.out.println(solution(s));
    }


    private static int[] solution(String s) {
        String [] nums = s.split("},");
        List<Integer> answer = new LinkedList<Integer>();

        for(int i = 0; i < nums.length; i++) { // replace : 20,111 111
            String ss = nums[i].replace("{", "").replace("}", "");
            nums[i] = ss;
        }

        Arrays.sort(nums, (o1, o2) -> o1.length() - o2.length()); // 문자열의 길이를 기준으로 정렬

        for (String num : nums) {
            Arrays.stream(num.split(",")) // ,를 가준으로 문자열 나눈 후
                    .map(Integer::parseInt) // int 로 변환
                    .filter(integer -> answer.indexOf(integer) == -1 ? true : false) // 이미 리스트에 없면 -1 and true
                    .forEach(integer -> answer.add(integer)); // answer 에 add
        }


        return answer.stream().mapToInt(Integer::intValue).toArray(); // Array 로 return
    }
}
