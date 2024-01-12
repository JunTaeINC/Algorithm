package platform.lecture.step_2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P_8 {

    public static void main(String[] args) {
        // return [1, 0, 2, 1]
        System.out.println(Arrays.toString(solution(4, new int[][]{{0, 1}, {0, 3}, {1, 2}, {2, 0}, {2, 3}, {3, 0}}, 2)));
    }

    private static int[] solution(int n, int[][] vote, int k) {
        int[] answer = new int[n];
        Map<Integer, Integer> result = new HashMap<>();
        for (int[] v : vote) {
            result.put(v[1], result.getOrDefault(v[1], 0) + 1);
        }

        List<Integer> candidate = result.keySet().stream().filter(r -> result.get(r) >= k).toList();
        for (int[] v : vote) {
            if (candidate.contains(v[1])) answer[v[0]]++;
        }

        return answer;
    }
}