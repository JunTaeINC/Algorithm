package com.programmers.level1.p131128;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionTest {

    @Test
    void test1(){
        assertThat(new Solution().solution("100","2345")).isEqualTo("-1");
    }

    @Test
    void test2(){
        assertThat(new Solution().solution("100","203045")).isEqualTo("0");
    }

    @Test
    void test3(){
        assertThat(new Solution().solution("100","123450")).isEqualTo("10");
    }

    @Test
    void test4(){
        assertThat(new Solution().solution("12321","42531")).isEqualTo("321");
    }

    @Test
    void test5(){
        assertThat(new Solution().solution("5525","1255")).isEqualTo("552");
    }

}