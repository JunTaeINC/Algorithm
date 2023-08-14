package com.programmers.level0.p120860;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionTest {

    @Test
    void test1() {
        assertThat(new Solution().solution(new int[][]{{1, 1}, {2, 1}, {2, 2}, {1, 2}})).isEqualTo(1);
    }

    @Test
    void test2() {
        assertThat(new Solution().solution(new int[][]{{-1, -1}, {1, 1}, {1, -1}, {-1, 1}})).isEqualTo(4);
    }
}