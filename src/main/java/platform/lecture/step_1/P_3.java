package platform.lecture.step_1;

public class P_3 {

    public static void main(String[] args) {
        System.out.println(solution("a#b!GE*T@S"));   // S#T!EG*b@a
        System.out.println(solution("###ab*@@Sty"));  // ###yt*@@Sba
    }

    private static String solution(String string) {
        char[] chars = string.toCharArray();
        int start = 0, end = string.length() - 1;

        while (start < end) {
            if (!Character.isLetter(chars[start])) {
                start++;
            } else if (!Character.isLetter(chars[end])) {
                end--;
            } else {
                char temp = chars[end];
                chars[end] = chars[start];
                chars[start] = temp;
                start++;
                end--;
            }
        }

        return new String(chars);
    }
}