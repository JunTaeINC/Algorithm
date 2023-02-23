package com.level0.p120829;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    @DisplayName("angle이 70 일때 1을 리턴")
    void test1() {
        assertThat(new Solution().solution(70)).isEqualTo(1);
    }

    @Test
    @DisplayName("angle이 91 일때 3을 리턴")
    void test2() {
        assertThat(new Solution().solution(91)).isEqualTo(3);
    }

    @Test
    @DisplayName("angle이 180 일때 4을 리턴")
    void test3() {
        assertThat(new Solution().solution(180)).isEqualTo(4);
    }

    @Test
    @DisplayName("angle이 90 일때 2을 리턴")
    void test4() {
        assertThat(new Solution().solution(90)).isEqualTo(2);
    }

}