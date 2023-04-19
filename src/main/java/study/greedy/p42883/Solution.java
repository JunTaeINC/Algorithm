package study.greedy.p42883;

class Solution {
    public String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();
        int index = 0;
        // number = 1924
        // number.length() = 4 , k = 2 일 경우 2자리수가 필요하므로 2번 반복
        for (int i = 0; i < number.length() - k; i++) {
            char max = '0';
            // j = 0 이 아닌 이유 큰 수가 나오면 다음 값부터 반복을 돌리기 위해서.
            // j = 0 일 경우 처음부터 다시 돌기 때문에 X
            // j <= k + i : i의 최대값 + k = number.length();
            for (int j = index; j <= k + i; j++) {
                if (max < number.charAt(j)) {
                    max = number.charAt(j);
                    // 1 9 2 4 에 9가 추가 됐으면 다음번에 반복을 해야하면 2부터 반복문을 돌려야 하므로
                    // index = 1(value = 9) + 1 -> index = 2(value = 2)
                    index = j + 1;
                }
            }
            answer.append(max);
        }
        return answer.toString();
    }
}
