package com.programmers.level0.p120869;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionTest {

    @Test
    void test1() {
        assertThat(new Solution().solution(new String[]{"p", "o", "s"},
                new String[]{"sod", "eocd", "qixm", "adio", "soo"})).isEqualTo(2);
    }

    @Test
    void test2() {
        assertThat(new Solution().solution(new String[]{"z", "d", "x"},
                new String[]{"def", "dww", "dzx", "loveaw"})).isEqualTo(1);
    }

    @Test
    void test3() {
        assertThat(new Solution().solution(new String[]{"s", "o", "m", "d"},
                new String[]{"moos", "dzx", "smm", "sunmmo", "som"})).isEqualTo(2);
    }
}