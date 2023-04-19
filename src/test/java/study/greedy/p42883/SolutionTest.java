package study.greedy.p42883;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionTest {

    @Test
    void test1() {
        assertThat(new Solution().solution("1924", 2)).isEqualTo("94");
    }

    @Test
    void test2() {
        assertThat(new Solution().solution("1231234", 3)).isEqualTo("3234");
    }

    @Test
    void test3() {
        assertThat(new Solution().solution("4177252841", 4)).isEqualTo("775841");
    }

    @Test
    void test4() {
        assertThat(new Solution().solution("1194", 2)).isEqualTo("94");
    }
}