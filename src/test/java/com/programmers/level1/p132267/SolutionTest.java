package com.programmers.level1.p132267;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionTest {

    @Test
    void test1() {
        assertThat(new Solution().solution(2, 1, 20)).isEqualTo(19);
    }

    @Test
    void test2() {
        assertThat(new Solution().solution(3, 1, 20)).isEqualTo(9);
    }
}