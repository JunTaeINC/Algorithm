package com.ll.level0.p120850;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionTest {

    @Test
    void test1() {
        assertThat(new Solution().solution("hi12392")).isEqualTo(new int[]{1, 2, 2, 3, 9});
    }

    @Test
    void test2() {
        assertThat(new Solution().solution("p2o4i8gj2")).isEqualTo(new int[]{2, 2, 4, 8});
    }

    @Test
    void test3() {
        assertThat(new Solution().solution("abcde0")).isEqualTo(new int[]{0});
    }
}