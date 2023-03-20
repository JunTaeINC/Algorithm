package study.stack_queue.p12906;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


class SolutionTest {

    @Test
    void test1() {
        assertThat(new Solution().solution(new int[]{1, 1, 3, 3, 0, 1, 1})).isEqualTo(new int[]{1, 3, 0, 1});
    }

    @Test
    void test2() {
        assertThat(new Solution().solution(new int[]{4, 4, 4, 3, 3})).isEqualTo(new int[]{4, 3});
    }
}