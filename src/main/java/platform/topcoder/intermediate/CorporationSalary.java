package platform.topcoder.intermediate;

public class CorporationSalary {

    static long[] dp;

    public static long solution(String[] relations) {
        long sum = 0;
        dp = new long[relations.length];

        for (int i = 0; i < relations.length; i++) {
            sum += getSalary(i, relations);
        }

        return sum;
    }

    private static long getSalary(int index, String[] relations) {
        long salary = 0;

        if (dp[index] == 0) {
            String relation = relations[index];

            for (int i = 0; i < relation.length(); i++) {
                if (relation.charAt(i) == 'Y') {
                    salary += getSalary(i, relations);
                }
            }

            if (salary == 0) salary = 1;
            dp[index] = salary;
        }

        return dp[index];
    }

    public static void main(String[] args) {
        // test case 0 : return 1
        System.out.println(solution(new String[]{"N"}));

        // test case 1 : return 5
        System.out.println(solution(new String[]{"NNYN", "NNYN", "NNNN", "NYYN"}));

        // test case 4 : return 4
        System.out.println(solution(new String[]{"NNNN", "NNNN", "NNNN", "NNNN"}));
    }
}