package com.programmers.level0.p120913;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionTest {

    @Test
    void test1() {
        assertThat(new Solution().solution("abc1Addfggg4556b", 6)).isEqualTo(new String[]{"abc1Ad", "dfggg4", "556b"});
    }

    @Test
    void test2() {
        assertThat(new Solution().solution("abcdef123", 3)).isEqualTo(new String[]{"abc", "def", "123"});
    }
}