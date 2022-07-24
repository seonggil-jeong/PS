package problems;

public class Problem12919 {
    public static void main(String[] args) {
        String[] seoul = {"Jane", "Kim"};


        String answer = solution(seoul);
        System.out.println(answer);
    }

    private static String solution(String[] seoul) {
//        List<String> answer = Arrays.asList(seoul);
//
//        return "김서방은 " + answer.indexOf("Kim") + "에 있다";

        // ** indexOf 에서 for 문이 돌기 때문에 List 를 생성하여 resource 낭비할 필요가 없음 **

        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                return "김서방은 " + i + "에 있다";

            }
        }


        return null;
    }
}
