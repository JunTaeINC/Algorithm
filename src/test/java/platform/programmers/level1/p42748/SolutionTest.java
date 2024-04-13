package platform.programmers.level1.p42748;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void testCase1() {
        int[] result = solution.solution(new int[]{1, 5, 2, 6, 3, 7, 4},
                new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}});
        assertThat(result).isEqualTo(new int[]{5, 6, 3});
    }
}