package com.ll.level0.p120924;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionTest {

    @Test
    void test1() {
        assertThat(new Solution().solution(new int[]{1, 2, 3, 4})).isEqualTo(5);
    }

    @Test
    void test2() {
        assertThat(new Solution().solution(new int[]{2, 4, 8})).isEqualTo(16);
    }
}