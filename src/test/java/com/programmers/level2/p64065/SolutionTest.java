package com.programmers.level2.p64065;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionTest {

    @Test
    void test1() {
        assertThat(new Solution().solution("{{2},{2,1},{2,1,3},{2,1,3,4}}")).isEqualTo(new int[]{2, 1, 3, 4});
    }

    @Test
    void test2() {
        assertThat(new Solution().solution("{{1,2,3},{2,1},{1,2,4,3},{2}}")).isEqualTo(new int[]{2, 1, 3, 4});
    }

    @Test
    void test3() {
        assertThat(new Solution().solution("{{20,111},{111}}")).isEqualTo(new int[]{111, 20});
    }

    @Test
    void test4() {
        assertThat(new Solution().solution("{{4,2,3},{3},{2,3,4,1},{2,3}}")).isEqualTo(new int[]{3, 2, 4, 1});
    }

    @Test
    void test5() {
        assertThat(new Solution().solution("{{123}}")).isEqualTo(new int[]{123});
    }
}