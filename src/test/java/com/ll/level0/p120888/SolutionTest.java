package com.ll.level0.p120888;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionTest {

    @Test
    void test1() {
        assertThat(new Solution().solution("people")).isEqualTo("peol");
    }

    @Test
    void test2() {
        assertThat(new Solution().solution("We are the world")).isEqualTo("We arthwold");
    }
}