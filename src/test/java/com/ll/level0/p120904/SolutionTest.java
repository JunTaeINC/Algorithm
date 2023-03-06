package com.ll.level0.p120904;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionTest {

    @Test
    void test1() {
        assertThat(new Solution().solution(29183, 1)).isEqualTo(3);
    }

    @Test
    void test2() {
        assertThat(new Solution().solution(232443, 4)).isEqualTo(4);
    }

    @Test
    void test3() {
        assertThat(new Solution().solution(123456, 7)).isEqualTo(-1);
    }
}