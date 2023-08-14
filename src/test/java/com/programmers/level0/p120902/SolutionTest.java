package com.programmers.level0.p120902;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionTest {

    @Test
    void test1() {
        assertThat(new Solution().solution("3 + 4")).isEqualTo(7);
    }

    @Test
    void test2() {
        assertThat(new Solution().solution("9 - 4")).isEqualTo(5);
    }

    @Test
    void test3() {
        assertThat(new Solution().solution("3 + 4 + 7")).isEqualTo(14);
    }
}