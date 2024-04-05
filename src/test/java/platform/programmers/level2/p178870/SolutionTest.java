package platform.programmers.level2.p178870;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void testCase1() {
        int[] answer = solution.solution(new int[]{1, 2, 3, 4, 5}, 7);
        assertThat(answer).isEqualTo(new int[]{2, 3});
    }

    @Test
    void testCase2() {
        int[] answer = solution.solution(new int[]{1, 1, 1, 2, 3, 4, 5}, 5);
        assertThat(answer).isEqualTo(new int[]{6, 6});
    }

    @Test
    void testCase3() {
        int[] answer = solution.solution(new int[]{2, 2, 2, 2, 2}, 6);
        assertThat(answer).isEqualTo(new int[]{0, 2});
    }
}