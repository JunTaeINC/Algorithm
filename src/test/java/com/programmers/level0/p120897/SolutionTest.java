package com.programmers.level0.p120897;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionTest {

    @Test
    void test1() {
        assertThat(new Solution().solution(24)).isEqualTo(new int[]{1, 2, 3, 4, 6, 8, 12, 24});
    }

    @Test
    void test2() {
        assertThat(new Solution().solution(29)).isEqualTo(new int[]{1, 29});
    }
}