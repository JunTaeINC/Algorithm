package com.ll.level0.p120809;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionTest {

    @Test
    void test1(){
        assertThat(new Solution().solution(new int[]{1,2,3,4,5})).isEqualTo(new int[]{2,4,6,8,10});
    }

    @Test
    void test2(){
        assertThat(new Solution().solution(new int[]{1,2,100,-99,5})).isEqualTo(new int[]{2,4,200,-198,10});
    }
}