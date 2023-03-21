package study.stack_queue.p42586;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionTest {

    @Test
    void test1() {
        assertThat(new Solution().solution(new int[]{93, 30, 55}, new int[]{1, 30, 5})).isEqualTo(new int[]{2, 1});
    }

    @Test
    void test2() {
        assertThat(new Solution().solution(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1}))
                .isEqualTo(new int[]{1, 3, 2});
    }

    @Test
    void test3() {
        assertThat(new Solution().solution(new int[]{100, 99, 98, 97, 96, 95}, new int[]{1, 1, 1, 1, 1, 1}))
                .isEqualTo(new int[]{1, 1, 1, 1, 1, 1});
    }
}