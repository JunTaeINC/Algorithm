package com.programmers.level0.p120868;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


class SolutionTest {

    @Test
    void test1() {
        assertThat(new Solution().solution(new int[]{1, 2})).isEqualTo(1);
    }

    @Test
    void test2() {
        assertThat(new Solution().solution(new int[]{3, 6})).isEqualTo(5);
    }

    @Test
    void test3() {
        assertThat(new Solution().solution(new int[]{11, 7})).isEqualTo(13);
    }
}