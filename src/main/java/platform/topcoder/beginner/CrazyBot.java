package platform.topcoder.beginner;

public class CrazyBot {
    static boolean[][] isVisited = new boolean[100][100];
    static double[] prob = new double[4];
    static int[] vx = {0, 1, 0, -1};
    static int[] vy = {1, 0, -1, 0};

    public static double solution(int n, int east, int west, int south, int north) {
        prob[0] = east / 100.0;
        prob[1] = west / 100.0;
        prob[2] = south / 100.0;
        prob[3] = north / 100.0;

        return dfs(50, 50, n);
    }

    private static double dfs(int x, int y, int n) {
        if (isVisited[x][y]) return 0;
        if (n == 0) return 1;

        double ret = 0;
        isVisited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + vx[i];
            int ny = y + vy[i];

            ret += dfs(nx, ny, n - 1) * prob[i];
        }

        isVisited[x][y] = false;

        return ret;
    }

    public static void main(String[] args) {
        // test case 2 : return 1.0
        System.out.println(solution(7, 50, 0, 0, 50));
    }
}