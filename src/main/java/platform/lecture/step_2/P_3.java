package platform.lecture.step_2;

public class P_3 {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4, 5, 3, 1}));    // YES
        System.out.println(solution(new int[]{1, 3, 4, 5, 5, 6, 4, 3})); // NO
        System.out.println(solution(new int[]{1, 2, 3, 4, 5}));          // NO
    }

    private static String solution(int[] nums) {
        int i = 0;

        while (i + 1 < nums.length && nums[i] < nums[i + 1]) {
            i++;
        }

        if (i == 0 || i == nums.length - 1) {
            return "NO";
        }

        while (i + 1 < nums.length && nums[i] > nums[i + 1]) {
            i++;
        }

        if (i == nums.length - 1) {
            return "YES";
        } else {
            return "NO";
        }
    }
}