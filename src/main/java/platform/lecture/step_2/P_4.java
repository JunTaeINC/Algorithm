package platform.lecture.step_2;

public class P_4 {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 0, 0, 0, 1, 0, 0, 1, 0, 1})); // 2
    }

    private static int solution(int[] seats) {
        int answer = 0;
        int n = seats.length;
        int[] temp = new int[n];
        int s = 0;
        for (int i = 0; i < n; i++) {
            if (seats[i] == 1) {
                s = 0;
            } else {
                s++;
            }

            temp[i] = s;
        }

        s = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (seats[i] == 1) {
                s = 0;
                continue;
            }

            s++;
            temp[i] = Math.min(s, temp[i]);
        }

        for (int t : temp) {
            answer = Math.max(answer, t);
        }

        return answer;
    }
}