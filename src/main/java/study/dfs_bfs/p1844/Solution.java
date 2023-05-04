package study.dfs_bfs.p1844;

import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        /*
        [1,0,1,1,1]
        [1,0,1,0,1]
        [1,0,1,1,1]
        [1,1,1,0,1]
        [0,0,0,0,1]
         */
        int answer = -1;
        int ySize = maps.length;
        int xSize = maps[0].length;

        boolean[][] visited = new boolean[ySize][xSize];

        int[] y = {1, -1, 0, 0};
        int[] x = {0, 0, 1, -1};

        Deque<int[]> dq = new LinkedList<>();
        // 처음 시작 지점 고정
        visited[0][0] = true;
        // {x좌표, y좌표, 칸의 개수}
        dq.offer(new int[]{0, 0, 1});
        while (!dq.isEmpty()) {
            int[] xyd = dq.pollFirst();
            // 상대방 진영은 게임 맵의 우측 하단인 (n, m) 도착
            if (xyd[0] == ySize - 1 && xyd[1] == xSize - 1) {
                return xyd[2];
            }
            for (int i = 0; i < x.length; i++) {
                int ny = xyd[0] + y[i];
                int nx = xyd[1] + x[i];
                if (isValid(nx, xSize) && isValid(ny, ySize) && !visited[ny][nx] && maps[ny][nx] == 1) {
                    visited[ny][nx] = true;
                    int nd = xyd[2] + 1;
                    dq.offer(new int[]{ny, nx, nd});
                }
            }
        }
        return answer;
    }

    boolean isValid(int number, int max) {
        return number >= 0 && number < max;
    }

    public static void main(String[] args) {
        int[][] a = new int[2][3];
        System.out.println(Arrays.toString(a));
    }

}