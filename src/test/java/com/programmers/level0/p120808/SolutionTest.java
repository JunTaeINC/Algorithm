package com.programmers.level0.p120808;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionTest {

    @Test
    void test1() {
        assertThat(new Solution().solution(1, 2, 3, 4)).isEqualTo(new int[]{5, 4});
    }

    @Test
    void test2() {
        assertThat(new Solution().solution(9, 2, 1, 3)).isEqualTo(new int[]{29, 6});
    }

    @Test
    void test3() {
        assertThat(new Solution().solution(4, 4, 4, 4)).isEqualTo(new int[]{2, 1});
    }

}