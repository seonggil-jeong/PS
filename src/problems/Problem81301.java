package problems;

public class Problem81301 {

    public static void main(String[] args) {
        String s = "one4seveneight";


        int answer = solution(s);


        System.out.println(answer);


    }


    public static int solution(String s) {
        int[] ints = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String[] strings = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < 10; i++) {
            s = s.replaceAll(strings[i], String.valueOf(ints[i]));
        }


        return Integer.valueOf(s);

    }
}
