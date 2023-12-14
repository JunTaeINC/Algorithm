package platform.lecture.step_1;

import java.util.Arrays;

public class P_11 {

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"00:12", "00:00", "01:05", "00:57"})); // 8
        System.out.println(solution(new String[]{"00:00", "23:59", "00:00"})); // 0
        System.out.println(solution(new String[]{"23:59", "00:00", "23:57"})); // 1
    }

    private static int solution(String[] times) {
        int[] time = new int[times.length];
        for (int i = 0; i < time.length; i++) {
            if (times[i].equals("00:00")) {
                time[i] = 24 * 60;
                continue;
            }
            
            int[] temp = Arrays.stream(times[i].split(":")).mapToInt(Integer::parseInt).toArray();
            time[i] = temp[0] * 60 + temp[1];
        }

        Arrays.sort(time);
        int answer = Integer.MAX_VALUE;
        for (int i = 0; i < time.length - 1; i++) {
            if (time[i] == time[i + 1]) {
                return 0;
            }

            answer = Math.min(answer, time[i + 1] - time[i]);
        }

        return answer;
    }
}