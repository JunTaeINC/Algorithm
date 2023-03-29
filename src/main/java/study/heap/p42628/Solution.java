package study.heap.p42628;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(String[] operations) {
        List<Integer> list = new ArrayList<>();
        for (String op : operations) {
            Collections.sort(list);
            String[] aa = op.split(" ");
            String code = aa[0];
            int val = Integer.parseInt(aa[1]);
            if (code.equals("I")) {
                list.add(val);
            } else if (!list.isEmpty()) {
                if (op.equals("D 1")) {
                    list.remove(list.size() - 1);
                } else if (op.equals("D -1")) {
                    list.remove(0);
                }
            }
        }
        Collections.sort(list);
        if (list.isEmpty()) return new int[]{0, 0};
        return new int[]{list.get(list.size() - 1), list.get(0)};
    }
}