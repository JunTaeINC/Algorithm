package com.programmers.level0.p120887;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionTest {

    @Test
    void test1() {
        assertThat(new Solution().solution(1, 13, 1)).isEqualTo(6);
    }

    @Test
    void test2() {
        assertThat(new Solution().solution(10, 50, 5)).isEqualTo(5);
    }

    @Test
    void test3() {
        assertThat(new Solution().solution(3, 10, 2)).isEqualTo(0);
    }

}