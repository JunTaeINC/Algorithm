package com.ll.level0.p120883;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionTest {

    @Test
    void test1() {
        assertThat(new Solution().solution(new String[]{"meosseugi", "1234"}, new String[][]{{"rardss", "123"},
                {"yyoom", "1234"}, {"meosseugi", "1234"}})).isEqualTo("login");
    }

    @Test
    void test2() {
        assertThat(new Solution().solution(new String[]{"programmer01", "15789"}, new String[][]{{"programmer02", "111111"},
                {"programmer00", "134"}, {"programmer01", "1145"}})).isEqualTo("wrong pw");
    }

    @Test
    void test3() {
        assertThat(new Solution().solution(new String[]{"rabbit04", "98761"}, new String[][]{{"jaja11", "98761"},
                {"krong0313", "29440"}, {"rabbit00", "111333"}})).isEqualTo("fail");
    }
}