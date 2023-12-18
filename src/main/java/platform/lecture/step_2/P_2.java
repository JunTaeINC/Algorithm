package platform.lecture.step_2;

public class P_2 {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{8, 12, 2, 3, 7, 6, 12, 20, 3})); // 14
        System.out.println(solution(new int[]{5, 2, 4, 7, 7, 3, 9, 10, 11}));  // 8
    }

    private static int solution(int[] numbers) {
        int diff = Integer.MIN_VALUE;
        int temp = 0;
        for(int i = 0 ; i < numbers.length - 1; i++) {
            if(numbers[i + 1] > numbers[i]) {
                temp += numbers[i + 1] - numbers[i];
            } else {
                temp = 0;
            }

            diff = Math.max(diff, temp);
        }

        return diff;
    }
}