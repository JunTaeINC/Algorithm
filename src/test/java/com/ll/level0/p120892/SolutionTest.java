package com.ll.level0.p120892;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionTest {

    @Test
    void test1() {
        assertThat(new Solution().solution("dfjardstddetckdaccccdegk", 4)).isEqualTo("attack");
    }

    @Test
    void test2() {
        assertThat(new Solution().solution("pfqallllabwaoclk", 2)).isEqualTo("fallback");
    }
}