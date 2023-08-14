package com.programmers.level0.p120921;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionTest {

    @Test
    void test1() {
        assertThat(new Solution().solution("hello", "ohell")).isEqualTo(1);
    }

    @Test
    void test2() {
        assertThat(new Solution().solution("apple", "elppa")).isEqualTo(-1);
    }

    @Test
    void test3() {
        assertThat(new Solution().solution("atat", "tata")).isEqualTo(1);
    }

    @Test
    void test4() {
        assertThat(new Solution().solution("abc", "abc")).isEqualTo(0);
    }
}