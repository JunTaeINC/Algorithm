package com.ll.level0.p120812;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionTest {

    @Test
    void test1() {
        assertThat(new Solution().solution(new int[]{1, 2, 3, 3, 3, 4})).isEqualTo(3);
    }

    @Test
    void test2() {
        assertThat(new Solution().solution(new int[]{1, 1, 2, 2})).isEqualTo(-1);
    }

    @Test
    void test3() {
        assertThat(new Solution().solution(new int[]{1})).isEqualTo(1);
    }
}