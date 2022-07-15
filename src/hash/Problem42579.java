package hash;

import java.util.*;

public class Problem42579 {
    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};

        int[] answer = solution(genres, plays);

    }

    private static int[] solution(String[] genres, int[] plays) {
        List<Integer> answer = new LinkedList<>();

        HashMap<String, Integer> num = new HashMap<>(); // 장르별 총 개수
        HashMap<String, HashMap<Integer, Integer>> music = new HashMap<>(); // 장르에 속하는 노래 및 재생횟수
        for(int i = 0; i < plays.length; i++) {
            if(!num.containsKey(genres[i])) { // 키가 없다면 초기 값 선언
                HashMap<Integer, Integer> map = new HashMap<>();
                map.put(i, plays[i]);
                music.put(genres[i], map);
                num.put(genres[i], plays[i]);
            } else { // 같은 장르가 이미 있다면 ++ 및 music 정보에 추가 <음악 번호, 수>
                music.get(genres[i]).put(i, plays[i]);
                num.put(genres[i], num.get(genres[i]) + plays[i]);
            }
        }

        List<String> keySet = new ArrayList<>(num.keySet());
        Collections.sort(keySet, (s1, s2) -> num.get(s2) - (num.get(s1))); // 장르별 재생 수로 정렬

        for(String key : keySet) { // 가장 높은 수 가져오기
            HashMap<Integer, Integer> map = music.get(key);
            List<Integer> genre_key = new LinkedList<>(map.keySet());

            Collections.sort(genre_key, (s1, s2) -> map.get(s2) - (map.get(s1))); // 재생 수로 정렬 및 최 상위 2개 저장

            answer.add(genre_key.get(0));
            if(genre_key.size() > 1)
                answer.add(genre_key.get(1));
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}
