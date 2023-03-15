package study.p42576;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionTest {

    @Test
    void test1() {
        assertThat(new Solution().solution(new String[]{"leo", "kiki", "eden"},new String[]{"eden", "kiki"}))
                .isEqualTo("leo");
    }

    @Test
    void test2() {
        assertThat(new Solution().solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"},
                new String[]{"josipa", "filipa", "marina", "nikola"}))
                .isEqualTo("vinko");
    }

    @Test
    void test3() {
        assertThat(new Solution().solution(new String[]{"mislav", "stanko", "mislav", "ana"},
                new String[]{"stanko", "ana", "mislav"}))
                .isEqualTo("mislav");
    }
}