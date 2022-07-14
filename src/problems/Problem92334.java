package problems;

import javafx.util.Pair;

import java.util.*;

public class Problem92334 {
    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k = 2;

        int[] answer = solution(id_list, report, k);


        System.out.println(answer);

    }

    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        // 사용자 별 순서 저장
        Map<String, Integer> idMap = new LinkedHashMap<>();
        // {userName : toUser} 신고한 유저 : toUser
        Map<String, Set<String>> map = new HashMap<>();


        for (int i = 0; i < id_list.length; i++) {
            // 사용자 이름 : 사용자 저장 번호
            idMap.put(id_list[i], i);

            // 사용자 이름 : (Set) 사용자가 신고한 유저 이름
            map.put(id_list[i], new HashSet<>());
        }

        for (String user : report) {
            String[] arr = user.split(" ");
            // 사용자 이름으로 Set 조회, 자신을 신고한 유저 정보 저장
            // muzi frodo --> map.get("frodo").add("muzi")
            map.get(arr[1]).add(arr[0]);
        }

        for (int i = 0; i < id_list.length; i++) {
            // 사용자 이름으로 Set (자신을 신고한 유저 Set 조회)
            Set<String> mail = map.get(id_list[i]);


            // Count ++
            if (mail.size() >= k) {
                for (String name : mail) {
                    answer[idMap.get(name)]++;
                }
            }
        }


        return answer;
    }
}
