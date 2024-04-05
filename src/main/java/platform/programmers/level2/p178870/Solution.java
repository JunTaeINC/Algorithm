package platform.programmers.level2.p178870;

public class Solution {

    public int[] solution(int[] sequence, int k) {
        int start = 0, end = 0, sum = 0, length = Integer.MAX_VALUE;
        int[] answer = new int[2];

        while (end <= sequence.length) {
            if (sum < k) {
                if (end == sequence.length) break;
                sum += sequence[end++];
            } else { // sum >= k
                if (sum == k && length > (end - start)) {
                    length = end - start;
                    answer[0] = start;
                    answer[1] = end - 1;
                }
                sum -= sequence[start++];
            }
        }

        return answer;
    }
}