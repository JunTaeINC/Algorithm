package com.programmers.level0.p120838;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionTest {

    @Test
    void test1() {
        assertThat(new Solution().solution(".... . .-.. .-.. ---")).isEqualTo("hello");
    }

    @Test
    void test2() {
        assertThat(new Solution().solution(".--. -.-- - .... --- -.")).isEqualTo("python");
    }
}