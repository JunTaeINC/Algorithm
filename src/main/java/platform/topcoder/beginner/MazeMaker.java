package platform.topcoder.beginner;

import java.util.LinkedList;
import java.util.Queue;

public class MazeMaker {
    static int width;
    static int height;

    public static int solution(String[] maze, int startRow, int startCol, int[] moveRow, int[] moveCol) {
        int answer = 0;

        width = maze[0].length();
        height = maze.length;

        int[][] map = new int[height][width];

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                map[i][j] = -1;
            }
        }

        Queue<int[]> queue = new LinkedList<>();
        map[startRow][startCol] = 0;
        queue.offer(new int[]{startRow, startCol});

        while (!queue.isEmpty()) {
            int[] now = queue.poll();

            for (int i = 0; i < moveRow.length; i++) {
                int nextY = moveRow[i] + now[0];
                int nextX = moveCol[i] + now[1];

                if (isValid(nextX, nextY) && map[nextY][nextX] == -1 && maze[nextY].charAt(nextX) == '.') {
                    map[nextY][nextX] = map[now[0]][now[1]] + 1;
                    queue.add(new int[]{nextY, nextX});
                }
            }
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (maze[i].charAt(j) == '.' && map[i][j] == -1) return -1;
                answer = Math.max(answer, map[i][j]);
            }
        }

        return answer;
    }

    private static boolean isValid(int x, int y) {
        return 0 <= x && x < width && 0 <= y && y < height;
    }

    public static void main(String[] args) {
        // test case 0 : return 3
        System.out.println(solution(new String[]{"...", "...", "..."}, 0, 1,
                new int[]{1, 0, -1, 0}, new int[]{0, 1, 0, -1}));

        // test case 1 : return 2
        System.out.println(solution(new String[]{"...", "...", "..."}, 0, 1,
                new int[]{1, 0, -1, 0, 1, 1, -1, -1}, new int[]{0, 1, 0, -1, 1, -1, 1, -1}));

        // test case 2 : return -1;
        System.out.println(solution(new String[]{"X.X", "...", "XXX", "X.X"}, 0, 1,
                new int[]{1, 0, -1, 0}, new int[]{0, 1, 0, -1}));

    }
}