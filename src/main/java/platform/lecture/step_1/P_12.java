package platform.lecture.step_1;

import java.util.Arrays;

public class P_12 {

    public static void main(String[] args) {
        // "02:20"
        System.out.println(solution(new String[]{"08:30", "09:00", "14:00", "16:00", "16:01", "16:06", "16:07", "16:11"}));

        // "02:44"
        System.out.println(solution(new String[]{"01:00", "08:00", "15:00", "15:04", "23:00", "23:59"}));
    }

    private static int getTime(String time) {
        int[] temp = Arrays.stream(time.split(":")).mapToInt(Integer::parseInt).toArray();

        return (temp[0] * 60) + temp[1];
    }

    private static String solution(String[] times) {
        int time = 0;

        for (int i = 0; i < times.length - 1; i += 2) {
            int diff = getTime(times[i + 1]) - getTime(times[i]);
            if (diff < 5) {
                continue;
            }

            if (diff > 105) {
                time += 105;
                continue;
            }

            time += diff;
        }

        return String.format("%02d:%02d", time / 60, time % 60);
    }
}