package study.sort.p42747;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionTest {

    @Test
    void test1() {
        assertThat(new Solution().solution(new int[]{3, 0, 6, 1, 5})).isEqualTo(3);
    }
}