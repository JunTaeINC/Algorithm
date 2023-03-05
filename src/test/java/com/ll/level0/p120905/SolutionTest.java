package com.ll.level0.p120905;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionTest {

    @Test
    void test1() {
        assertThat(new Solution().solution(3, new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12})).isEqualTo(new int[]{6, 9, 12});
    }

    @Test
    void test2() {
        assertThat(new Solution().solution(5, new int[]{1, 9, 3, 10, 13, 5})).isEqualTo(new int[]{10, 5});
    }

    @Test
    void test3() {
        assertThat(new Solution().solution(12, new int[]{2, 100, 120, 600, 12, 12})).isEqualTo(new int[]{120, 600, 12, 12});
    }

}