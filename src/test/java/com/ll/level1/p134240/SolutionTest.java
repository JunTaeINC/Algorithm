package com.ll.level1.p134240;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionTest {

    @Test
    void test1() {
        assertThat(new Solution().solution(new int[]{1, 3, 4, 6})).isEqualTo("1223330333221");
    }

    @Test
    void test2() {
        assertThat(new Solution().solution(new int[]{1, 7, 1, 2})).isEqualTo("111303111");
    }
}