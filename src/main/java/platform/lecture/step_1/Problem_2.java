package platform.lecture.step_1;

public class Problem_2 {

    private static String solution(String string) {
        string = string.toLowerCase();
        boolean flag = true;
        for (int i = 0; i < string.length() / 2; i++) {
            if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
                flag = false;
                break;
            }
        }

        return flag ? "Yes" : "No";
    }


    private static String solution_2(String string) {
        String target = new StringBuilder(string).reverse().toString();

        return string.equalsIgnoreCase(target) ? "Yes" : "No";
    }

    public static void main(String[] args) {
        System.out.println(solution("gooG"));
        System.out.println(solution("Moon"));
    }
}