package hash;

import java.util.*;

public class Problem1845 {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 3};

        int answer = solution(nums);

        System.out.println(answer);

    }


    public static int solution(int[] nums) {
        int answer = nums.length / 2;
        Set<Integer> set = new HashSet<>();


        for (Integer num : nums) {
            set.add(num);
        }


        return answer < set.size() ? answer : set.size();
    }
}
