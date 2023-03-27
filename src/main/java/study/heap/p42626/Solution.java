package study.heap.p42626;

import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        // 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)
        int count = 0;
        PriorityQueue<Integer> pQ = new PriorityQueue<>();
        for (int sc : scoville) {
            pQ.add(sc);
        }
        while (pQ.peek() < K) {
            if (pQ.size() == 1) return -1;
            pQ.add(pQ.poll() + (pQ.poll() * 2));
            count++;
        }
        return count;
    }
}
