package com.programmers.level0.p120839;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionTest {

    @Test
    void test1() {
        assertThat(new Solution().solution("2")).isEqualTo("0");
    }

    @Test
    void test2() {
        assertThat(new Solution().solution("205")).isEqualTo("052");
    }
}