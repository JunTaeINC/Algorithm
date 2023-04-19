package study.greedy.p42862;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionTest {

    @Test
    void test1() {
        assertThat(new Solution().solution(5, new int[]{2, 4}, new int[]{1, 3, 5})).isEqualTo(5);
    }

    @Test
    void test2() {
        assertThat(new Solution().solution(5, new int[]{2, 4}, new int[]{3})).isEqualTo(4);
    }

    @Test
    void test3() {
        assertThat(new Solution().solution(3, new int[]{3}, new int[]{1})).isEqualTo(2);
    }

    @Test
    void test4() {
        assertThat(new Solution().solution(7, new int[]{2, 4, 7}, new int[]{1, 3, 5})).isEqualTo(6);
    }

}