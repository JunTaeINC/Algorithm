package com.ll.level0.p120903;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionTest {

    @Test
    void test1() {
        assertThat(new Solution().solution(new String[]{"a", "b", "c"}, new String[]{"com", "v", "c", "d", "b"})).isEqualTo(2);
    }


    @Test
    void test2() {
        assertThat(new Solution().solution(new String[]{"b", "c"}, new String[]{"com", "v", "d"})).isEqualTo(0);
    }
}