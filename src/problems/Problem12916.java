package problems;

public class Problem12916 {
    public static void main(String[] args) {
        String s = "pPoooyY";


        boolean answer = solution(s);

        System.out.println(answer);
    }

    private static boolean solution(String s) {
        s = s.toLowerCase();

        return (s.length() - s.replaceAll("p", "").length()) == (s.length() - s.replaceAll("y", "").length()) ?
                true : false;
    }
}
