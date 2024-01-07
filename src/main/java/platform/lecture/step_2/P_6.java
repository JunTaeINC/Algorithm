package platform.lecture.step_2;

public class P_6 {

    public static void main(String[] args) {
        System.out.println(solution(
                new int[][]{{5, 3, 7, 2, 3}, {3, 7, 1, 6, 1}, {7, 2, 5, 3, 4}, {4, 3, 6, 4, 1}, {8, 7, 3, 5, 2}}));
        // return 10
    }

    private static int solution(int[][] map) {
        int answer = 0, n = map.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (isTrue(i, j, map)) answer++;
            }
        }

        return answer;
    }

    private static boolean isTrue(int x, int y, int[][] map) {
        int val = map[x][y];

        int[] dy = {1, 0, -1, 0};
        int[] dx = {0, 1, 0, -1};

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (0 > nx || 0 > ny || map.length <= nx || map.length <= ny) {
                continue;
            }

            if (map[nx][ny] >= val) return false;
        }

        return true;
    }
}