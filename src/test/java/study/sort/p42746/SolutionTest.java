package study.sort.p42746;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionTest {

    @Test
    void test1() {
        assertThat(new Solution().solution(new int[]{6, 10, 2})).isEqualTo("6210");
    }

    @Test
    void test2() {
        assertThat(new Solution().solution(new int[]{3, 30, 34, 5, 9})).isEqualTo("9534330");
    }
}