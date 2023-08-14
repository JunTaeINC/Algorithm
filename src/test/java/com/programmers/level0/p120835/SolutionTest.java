package com.programmers.level0.p120835;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionTest {

    @Test
    void test1() {
        assertThat(new Solution().solution(new int[]{3, 76, 34})).isEqualTo(new int[]{3, 1, 2});
    }

    @Test
    void test2() {
        assertThat(new Solution().solution(new int[]{1, 2, 3, 4, 5, 6, 7})).isEqualTo(new int[]{7, 6, 5, 4, 3, 2, 1});
    }

    @Test
    void test3() {
        assertThat(new Solution().solution(new int[]{30, 10, 23, 6, 100})).isEqualTo(new int[]{2, 4, 3, 5, 1});
    }
}