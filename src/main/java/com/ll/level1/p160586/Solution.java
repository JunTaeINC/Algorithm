package com.ll.level1.p160586;

class Solution {
    public static int[] solution(String[] keymap, String[] targets) {
        // ["ABACD", "BCEFD"]	["ABCD","AABB"]	[9, 4]
        int[] answer = new int[targets.length];
        for (int i = 0; i < targets.length; i++) {
            int count = 0;
            for (int j = 0; j < targets[i].length(); j++) {
                char target = targets[i].charAt(j);
                int _count = Integer.MAX_VALUE;
                for (String key : keymap) {
                    if (getCount(key, target) != 0) _count = Math.min(_count, getCount(key, target));
                }
                if (_count == Integer.MAX_VALUE) {
                    count = -1;
                    break;
                }
                count += _count;
            }
            answer[i] = count;
        }
        return answer;
    }

    private static int getCount(String a, char target) {
        int count = 0;
        if (!isThere(a, target)) return 0;
        for (int i = 0; i < a.length(); i++) {
            if (target == a.charAt(i)) {
                count++;
                break;
            }
            count++;
        }
        return count;
    }

    private static boolean isThere(String a, char target) {
        return a.contains(Character.toString(target));
    }
}