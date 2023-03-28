package study.heap.p42628;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//class Solution {
//    public int[] solution(String[] operations) {
//        List<Integer> list = new ArrayList<>();
//        for (String op : operations) {
//            Collections.sort(list);
//            String[] aa = op.split(" ");
//            String code = aa[0];
//            int val = Integer.parseInt(aa[1]);
//            if (code.equals("I")) {
//                list.add(val);
//            } else {
//                if (list.isEmpty()) continue;
//                if (val == 1) {
//                    list.remove(list.size() - 1);
//                } else {
//                    list.remove(0);
//                }
//            }
//        }
//        if (list.isEmpty()) return new int[]{0, 0};
//        if (list.size() == 1) return new int[]{list.get(0)};
//        return new int[]{list.get(list.size() - 1), list.get(0)};
//    }
//}
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        PriorityQueue<Integer> que = new PriorityQueue<Integer>();
        PriorityQueue<Integer> maxque = new PriorityQueue<Integer>(Collections.reverseOrder());
        int maxcnt = 0;
        int cnt = 0;
        for (int i = 0; i < operations.length; i++) {
            StringTokenizer st = new StringTokenizer(operations[i], " ");
            String s = st.nextToken();
            switch (s) {    //문자 구분
                case "I":
                    String next = st.nextToken();
                    que.add(Integer.parseInt(next));
                    maxque.add(Integer.parseInt(next));
                    break;
                case "D":
                    if (que.size() == 0) {
                        st.nextToken();
                    } else if (st.nextToken().equals("1")) {
                        que.remove(maxque.poll());    //최대값에서 빼주고, 최소값에서는 찾아서 제거
                    } else {
                        maxque.remove(que.poll());
                    }
                    break;
            }
        }
        if (que.size() - maxcnt == 0) {    //size가 0이면 0을 입력
            answer[1] = 0;
        } else {
            answer[1] = que.poll();
        }
        if (maxque.size() - cnt == 0) {
            answer[0] = 0;
        } else {
            answer[0] = maxque.poll();
        }
        return answer;
    }
}