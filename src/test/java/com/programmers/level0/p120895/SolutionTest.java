package com.programmers.level0.p120895;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionTest {

    @Test
    void test1() {
        assertThat(new Solution().solution("hello", 1, 2)).isEqualTo("hlelo");
    }

    @Test
    void test2() {
        assertThat(new Solution().solution("I love you", 3, 6)).isEqualTo("I l veoyou");
    }
}