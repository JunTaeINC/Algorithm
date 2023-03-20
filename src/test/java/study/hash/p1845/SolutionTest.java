package study.hash.p1845;

import org.junit.jupiter.api.Test;
import study.hash.p1845.Solution;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionTest {

    @Test
    void test1() {
        assertThat(new Solution().solution(new int[]{3, 1, 2, 3})).isEqualTo(2);
    }

    @Test
    void test2() {
        assertThat(new Solution().solution(new int[]{3, 3, 3, 2, 2, 4})).isEqualTo(3);
    }

    @Test
    void test3() {
        assertThat(new Solution().solution(new int[]{3, 3, 3, 2, 2, 2})).isEqualTo(2);
    }
}