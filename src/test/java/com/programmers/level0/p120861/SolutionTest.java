package com.programmers.level0.p120861;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionTest {

    @Test
    void test1() {
        assertThat(new Solution().solution(new String[]{"left", "right", "up", "right", "right"},
                new int[]{11, 11})).isEqualTo(new int[]{2, 1});
    }

    @Test
    void test2() {
        assertThat(new Solution().solution(new String[]{"down", "down", "down", "down", "down"},
                new int[]{7, 9})).isEqualTo(new int[]{0, -4});
    }
}