package platform.programmers.level2.p118667;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void testCase1() {
        int result = solution.solution(new int[]{3, 2, 7, 2}, new int[]{4, 6, 5, 1});
        assertThat(result).isEqualTo(2);
    }

    @Test
    void testCase2() {
        int result = solution.solution(new int[]{1, 2, 1, 2}, new int[]{1, 10, 1, 2});
        assertThat(result).isEqualTo(7);
    }

    @Test
    void testCase3() {
        int result = solution.solution(new int[]{1, 1}, new int[]{1, 5});
        assertThat(result).isEqualTo(-1);
    }
}