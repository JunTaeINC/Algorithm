package platform.programmers.level2.p68936;

class Solution {
    int zero = 0, one = 0;
    static int[][] array;

    public int[] solution(int[][] arr) {
        array = arr.clone();
        backtracking(0, 0, arr.length);

        return new int[]{zero, one};
    }

    private void backtracking(int row, int col, int size) {
        if (check(row, col, size)) {
            if (array[row][col] == 0) zero++;
            else one++;
            return;
        }

        int sliceSize = size / 2;

        backtracking(row, col, sliceSize);
        backtracking(row, col + sliceSize, sliceSize);
        backtracking(row + sliceSize, col, sliceSize);
        backtracking(row + sliceSize, col + sliceSize, sliceSize);
    }

    private boolean check(int row, int col, int size) {
        int target = array[row][col];

        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (target != array[i][j]) return false;
            }
        }

        return true;
    }
}