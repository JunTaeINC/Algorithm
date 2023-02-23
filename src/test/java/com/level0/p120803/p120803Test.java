package com.level0.p120803;

import com.level0.p120803.P120803;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class P120803Test {

    private P120803 p120803;

    @BeforeEach
    public void setUp() {
        p120803 = new P120803();
    }

    @Test
    @DisplayName("num1 과 num2 합의 값을 리턴한다")
    void test1() {
        assertThat(p120803.sum(2,4)).isEqualTo(6);
        assertThat(P120803.sum(2,4)).isEqualTo(6);

    }

}