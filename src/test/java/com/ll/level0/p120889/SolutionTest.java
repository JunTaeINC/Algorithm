package com.ll.level0.p120889;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionTest {

    @Test
    @DisplayName("[1, 2, 3] 일때 2 리턴")
    void test1() {
        assertThat(new Solution().solution(new int[]{1,2,3})).isEqualTo(2);
    }

    @Test
    @DisplayName("[3, 6, 2] 일때 2 리턴")
    void test2() {
        assertThat(new Solution().solution(new int[]{3,6,2})).isEqualTo(2);
    }

    @Test
    @DisplayName("[199, 72, 223] 일때 1 리턴")
    void test3() {
        assertThat(new Solution().solution(new int[]{199,72,223})).isEqualTo(1);
    }

}