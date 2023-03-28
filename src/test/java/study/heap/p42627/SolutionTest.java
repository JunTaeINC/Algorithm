package study.heap.p42627;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionTest {

    @Test
    void test1() {
        assertThat(new Solution().solution(new int[][]{{0,3},{1,9},{2,6}})).isEqualTo(9);
    }
}