package com.ll.level1.p142086;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionTest {

    @Test
    void test1() {
        assertThat(new Solution().solution("banana")).isEqualTo(new int[]{-1, -1, -1, 2, 2, 2});
    }

    @Test
    void test2() {
        assertThat(new Solution().solution("foobar")).isEqualTo(new int[]{-1, -1, 1, -1, -1, -1});
    }
}