package study.greedy.p42885;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionTest {

    @Test
    void test1() {
        assertThat(new Solution().solution(new int[]{70, 50, 80, 50}, 100)).isEqualTo(3);
    }

    @Test
    void test2() {
        assertThat(new Solution().solution(new int[]{70, 80, 50}, 100)).isEqualTo(3);
    }
}