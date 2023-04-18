package com.ll.level0.p120863;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionTest {

    @Test
    void test1() {
        assertThat(new Solution().solution("3x + 7 + x")).isEqualTo("4x + 7");
    }

    @Test
    void test2() {
        assertThat(new Solution().solution("x + x + x")).isEqualTo("3x");
    }
}