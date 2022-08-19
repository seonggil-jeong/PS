package recursion;

public class Problem12943 {
    public static void main(String[] args) {
        final int n = 6;
        System.out.println(solution(n) == 8);
    }

    private static int solution(int num) {
        return getCount(num, 0);

    }


    private static int getCount(int num, int count) {
        if (num == 1) {
            return count;

        } else if (count == 250) {
            return -1;
        }else {
            return num % 2 == 0 ? getCount(num / 2, count + 1) : getCount((num * 3) + 1, count + 1);
        }
    }
}
