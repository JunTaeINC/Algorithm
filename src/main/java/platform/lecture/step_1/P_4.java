package platform.lecture.step_1;

public class P_4 {

    public static void main(String[] args) {
        System.out.println(solution("abcbdcba"));    // Yes
        System.out.println(solution("abcabbakcba")); // Yes
        System.out.println(solution("abcacbakcba")); // No
    }

    private static String solution(String str) {
        if (isTrue(str)) return "Yes";

        int start = 0, end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                String deleteLeft = str.substring(start + 1, end + 1);
                String deleteRight = str.substring(start, end);

                if (isTrue(deleteLeft) || isTrue(deleteRight)) {
                    return "Yes";
                }

                break;
            }

            start++;
            end--;
        }

        return "No";
    }

    private static boolean isTrue(String str) {
        return str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
    }
}