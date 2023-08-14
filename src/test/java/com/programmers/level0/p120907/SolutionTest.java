package com.programmers.level0.p120907;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionTest {

    @Test
    void test1() {
        assertThat(new Solution().solution(new String[]{"3 - 4 = -3", "5 + 6 = 11"}))
                .isEqualTo(new String[]{"X", "O"});
    }

    @Test
    void test2() {
        assertThat(new Solution().solution(new String[]{"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"}))
                .isEqualTo(new String[]{"O", "O", "X", "O"});
    }

}