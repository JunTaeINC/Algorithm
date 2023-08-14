package com.programmers.level0.p120899;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionTest {

    @Test
    void test1() {
        assertThat(new Solution().solution(new int[]{1, 8, 3})).isEqualTo(new int[]{8, 1});
    }

    @Test
    void test2() {
        assertThat(new Solution().solution(new int[]{9, 10, 11, 8})).isEqualTo(new int[]{11, 2});
    }
}