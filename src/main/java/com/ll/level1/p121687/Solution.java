package com.ll.level1.p121687;

class Solution {
    public static int[] solution(String command) {

        int[] answer = new int[2];
        int gak = 0;
        String[] com = command.split("");
        for (String c : com) {
            switch (c) {
                case "R" -> {
                    switch (gak) {
                        case 0 -> gak = 90;
                        case 90 -> gak = 180;
                        case 180 -> gak = 270;
                        case 270 -> gak = 0;
                    }
                }
                case "L" -> {
                    switch (gak) {
                        case 0 -> gak = 270;
                        case 90 -> gak = 0;
                        case 180 -> gak = 90;
                        case 270 -> gak = 180;
                    }
                }
                case "G" -> {
                    switch (gak) {
                        case 0 -> answer[1]++;
                        case 90 -> answer[0]++;
                        case 180 -> answer[1]--;
                        case 270 -> answer[0]--;
                    }
                }
                case "B" -> {
                    switch (gak) {
                        case 0 -> answer[1]--;
                        case 90 -> answer[0]--;
                        case 180 -> answer[1]++;
                        case 270 -> answer[0]++;
                    }
                }

            }
        }
        return answer;
    }
}