package platform.programmers.level2.p86971;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void testCase1() {
        int result = solution.solution(9, new int[][]{{1, 3}, {2, 3}, {3, 4}, {4, 5}, {4, 6}, {4, 7}, {7, 8}, {7, 9}});
        assertThat(result).isEqualTo(3);
    }

    @Test
    void testCase2() {
        int result = solution.solution(4, new int[][]{{1, 2}, {2, 3}, {3, 4}});
        assertThat(result).isEqualTo(0);
    }

    @Test
    void testCase3() {
        int result = solution.solution(7, new int[][]{{1, 2}, {2, 7}, {3, 7}, {3, 4}, {4, 5}, {6, 7}});
        assertThat(result).isEqualTo(1);
    }
}