package study.stack_queue.p12909;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SolutionTest {

    @Test
    void test1() {
        assertTrue(new Solution().solution("()()"));
    }

    @Test
    void test2() {
        assertTrue(new Solution().solution("(())()"));
    }

    @Test
    void test3() {
        assertFalse(new Solution().solution(")()("));
    }

    @Test
    void test4() {
        assertFalse(new Solution().solution("(()("));
    }
}