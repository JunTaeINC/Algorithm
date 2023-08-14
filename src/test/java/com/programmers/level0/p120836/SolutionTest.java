package com.programmers.level0.p120836;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionTest {

    @Test
    @DisplayName("20 입력시 6을 리턴")
    void test1() {
        assertThat(new Solution().solution(20)).isEqualTo(6);
    }

    @Test
    @DisplayName("100 입력시 9을 리턴")
    void test2() {
        assertThat(new Solution().solution(100)).isEqualTo(9);
    }
}