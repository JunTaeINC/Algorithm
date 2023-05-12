package com.ll.level1.p12982;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionTest {

    @Test
    void test1() {
        assertThat(new Solution().solution(new int[]{1, 3, 2, 5, 4}, 9)).isEqualTo(3);
    }

    @Test
    void test2() {
        assertThat(new Solution().solution(new int[]{2, 2, 3, 3}, 10)).isEqualTo(4);
    }

}