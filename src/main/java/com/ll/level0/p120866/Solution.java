package com.ll.level0.p120866;

class Solution {
    public int solution(int[][] board) {
        int[][] boomArea = new int[board.length][board.length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 1) checkBoomArea(i, j, boomArea);
            }
        }

        int count = 0;
        for (int i = 0; i < boomArea.length; i++) {
            for (int j = 0; j < boomArea.length; j++) {
                if (boomArea[i][j] == 0) count++;
            }
        }

        return count;
    }

    void checkBoomArea(int x, int y, int[][] board) {
        int[] xBoom = {0, 0, 0, 1, 1, 1, -1, -1, -1};
        int[] yBoom = {0, 1, -1, 0, 1, -1, 0, 1, -1};

        for (int i = 0; i < 9; i++) {
            int xX = x + xBoom[i];
            int yY = y + yBoom[i];

            if (xX < board.length && yY < board.length && 0 <= xX && 0 <= yY) {
                board[xX][yY] = 1;
            }
        }
    }
}