package platform.topcoder.intermediate;

public class ChessMetric {

    public static long solution(int size, int[] start, int[] end, int moves) {
        long[][][] map = new long[100][100][51];
        int[] dx = new int[]{1, 1, 1, 0, -1, -1, -1, 0, 2, 1, -1, -2, -2, -1, 1, 2};
        int[] dy = new int[]{1, 0, -1, -1, 1, 0, -1, 1, -1, -2, -2, -1, 1, 2, 2, 1};

        int startX = start[0], startY = start[1];
        int endX = end[0], endY = end[1];

        map[startY][startX][0] = 1;

        for (int i = 1; i <= moves; i++) {
            for (int x = 0; x < size; x++) {
                for (int y = 0; y < size; y++) {
                    for (int k = 0; k < dx.length; k++) {
                        int nextX = x + dx[k];
                        int nextY = y + dy[k];

                        if (!isValid(nextX, nextY, size)) {
                            map[nextY][nextX][i] += map[y][x][i - 1];
                        }
                    }
                }
            }
        }

        return map[endY][endX][moves];
    }

    private static boolean isValid(int x, int y, int size) {
        return x < 0 || y < 0 || size <= x || size <= y;
    }

    public static void main(String[] args) {
        // test case 0 : return 1;
        System.out.println(solution(3, new int[]{0, 0}, new int[]{1, 0}, 1));

        // test case 2 : return 0;
        System.out.println(solution(3, new int[]{0, 0}, new int[]{2, 2}, 1));

        // test case 4 : return 243097320072600;
        System.out.println(solution(100, new int[]{0, 0}, new int[]{0, 99}, 50));
    }
}
