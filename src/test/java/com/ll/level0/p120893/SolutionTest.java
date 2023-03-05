package com.ll.level0.p120893;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionTest {

    @Test
    void test1() {
        assertThat(new Solution().solution("cccCCC")).isEqualTo("CCCccc");
    }
    @Test
    void test2() {
        assertThat(new Solution().solution("abCdEfghIJ")).isEqualTo("ABcDeFGHij");
    }
}