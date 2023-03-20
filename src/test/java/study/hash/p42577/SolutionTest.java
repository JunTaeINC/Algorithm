package study.hash.p42577;

import org.junit.jupiter.api.Test;
import study.hash.p42577.Solution;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionTest {

    @Test
    void test1() {
        assertThat(new Solution().solution(new String[]{"119", "97674223", "1195524421"})).isFalse();
    }

    @Test
    void test2() {
        assertThat(new Solution().solution(new String[]{"123","456","789"})).isTrue();
    }

    @Test
    void test3() {
        assertThat(new Solution().solution(new String[]{"12","123","1235","567","88"})).isFalse();
    }
}