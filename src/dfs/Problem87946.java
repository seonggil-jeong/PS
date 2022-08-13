package dfs;

public class Problem87946 {
    public static boolean check[];
    public static int ans = 0;

    public static void main(String[] args) {

        int k = 80;
        int[][] dungeons = {{80, 20}, {50, 40}, {30, 10}}; // {최소 필요 피로도, 소모 피로도}

        int answer = solution(k, dungeons);

        System.out.println("answer : " + answer);

        System.out.println(answer == 3);

    }

    private static int solution(int k, int[][] dungeons) {

        check = new boolean[dungeons.length];

        dfs(k, dungeons, 0);

        return ans;
    }


    private static void dfs(int k, int[][] dungeons, int cnt) {
        for (int i = 0; i < dungeons.length; i++) {

            if (!check[i] && k >= dungeons[i][0]) { // 방문하지 않은 곳만 if 문을 실행 !check[i]
                check[i] = true; // 방문으로 변경

                dfs(k - dungeons[i][1], dungeons, cnt + 1);
                check[i] = false; // 끝났을 경우 미 방문으로 변경
            }
        }

        ans = Math.max(ans, cnt);
    }
}
