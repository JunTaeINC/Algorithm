package study.bfs.p86491;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionTest {

    @Test
    void test1() {
        assertThat(new Solution().solution(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}}))
                .isEqualTo(4000);
    }

    @Test
    void test2() {
        assertThat(new Solution().solution(new int[][]{{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}}))
                .isEqualTo(120);
    }

    @Test
    void test3() {
        assertThat(new Solution().solution(new int[][]{{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}}))
                .isEqualTo(133);
    }
}