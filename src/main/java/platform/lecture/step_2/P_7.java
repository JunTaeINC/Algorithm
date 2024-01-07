package platform.lecture.step_2;

public class P_7 {

    public static void main(String[] args) {
        // return 28
        System.out.println(solution(new int[][]{{2, 5, 7, 3}, {6, 8, 9, 7}, {3, 2, 4, 5}, {7, 2, 5, 8}}));

        // return 33
        System.out.println(solution(new int[][]{{3, 7, 6, 2}, {5, 3, 8, 7}, {3, 2, 5, 7}, {7, 7, 5, 3}}));
    }

    private static int solution(int[][] map) {
        int answer = 0, n = map.length;
        int[] row = new int[n];
        int[] col = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] > row[i]) row[i] = map[i][j];
                if (map[j][i] > col[i]) col[i] = map[j][i];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                answer += (Math.min(row[i], col[j]) - map[i][j]);
            }
        }

        return answer;
    }
}