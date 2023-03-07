package com.ll.level0.p120842;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionTest {

    @Test
    void test1() {
        assertThat(new Solution().solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 2))
                .isEqualTo(new int[][]{{1, 2}, {3, 4}, {5, 6}, {7, 8}});
    }
}