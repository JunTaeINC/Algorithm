package com.programmers.level0.pp120809;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionTest {

    @Test
    void test1() {
        assertThat(new Solution().solution("1 2 Z 3")).isEqualTo(4);
    }

    @Test
    void test2() {
        assertThat(new Solution().solution("10 20 30 40")).isEqualTo(100);
    }

    @Test
    void test3() {
        assertThat(new Solution().solution("10 Z 20 Z 1")).isEqualTo(1);
    }

    @Test
    void test4() {
        assertThat(new Solution().solution("10 Z 20 Z")).isEqualTo(0);
    }

    @Test
    void test5() {
        assertThat(new Solution().solution("-1 -2 -3 Z")).isEqualTo(-3);
    }
}