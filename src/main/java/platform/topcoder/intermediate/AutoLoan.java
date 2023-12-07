package platform.topcoder.intermediate;

public class AutoLoan {

    public static double solution(double price, double monthlyPayment, int loanTerm) {
        double high = 100, mid = 0, low = 0;

        /*
        '절대 오차'와 '상대 오차' 모두가 충분히 작아질 때까지 (high와 low 사이의 차이가 0.000000001보다 작고
        그 차이를 high로 나누어 상대적인 차이도 0.000000001보다 작아질 때까지) 반복
         */
        while ((1e-9 < high - low) && (1e-9 < (high - low) / high)) {
            double val = price;

            mid = (high + low) / 2;

            for (int i = 0; i < loanTerm; i++) {
                val *= mid / 1200 + 1;
                val -= monthlyPayment;
            }

            if (0 < val) {
                high = mid;
            } else {
                low = mid;
            }
        }

        return mid;
    }

    public static void main(String[] args) {
        // test case 0 : return : 1.3322616182218813E
        System.out.println(solution(6800, 100, 68));

        // test case 1 : return : 9.56205462458368
        System.out.println(solution(2000, 510, 4));

        // test case 2 : return : 7.687856394581649
        System.out.println(solution(15000, 364, 48));
    }
}