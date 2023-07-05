package com.ll.level1.p161990;

class Solution {
    public static int[] solution(String[] wallpaper) {
        int minX, minY, maxX, maxY;

        minX = minY = Integer.MAX_VALUE;
        maxX = maxY = Integer.MIN_VALUE;

        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    minX = Math.min(minX, i);
                    minY = Math.min(minY, j);
                    maxX = Math.max(maxX, i);
                    maxY = Math.max(maxY, j);
                }
            }
        }
        return new int[]{minX, minY, maxX + 1, maxY + 1};
    }
}