package com.ll.level1.p77884;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionTest {

    @Test
    void test1() {
        assertThat(new Solution().solution(13, 17)).isEqualTo(43);
    }

    @Test
    void test2() {
        assertThat(new Solution().solution(24, 27)).isEqualTo(52);
    }
}