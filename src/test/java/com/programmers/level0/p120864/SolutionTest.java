package com.programmers.level0.p120864;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


class SolutionTest {

    @Test
    void test1() {
        assertThat(new Solution().solution("aAb1B2cC34oOp")).isEqualTo(37);
    }

    @Test
    void test2() {
        assertThat(new Solution().solution("1a2b3c4d123Z")).isEqualTo(133);
    }

    @Test
    void test3() {
        assertThat(new Solution().solution("asbbababdb")).isEqualTo(0);
    }

    @Test
    void test4() {
        assertThat(new Solution().solution("asd120gdsf")).isEqualTo(120);
    }
}