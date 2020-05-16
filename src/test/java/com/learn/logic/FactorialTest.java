package com.learn.logic;

import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;

class FactorialTest {

    @Test
    void givenLessThanOne_whenFactorial_shouldReturnCorrectResult() {
        assertThat(Exercise.factorial(0)).isEqualTo(-1);
    }

    @Test
    void givenTestOne_whenFactorial_shouldReturnCorrectResult() {
        assertThat(Exercise.factorial(3)).isEqualTo(6);
    }

    @Test
    void givenTestTwo_whenFactorial_shouldReturnCorrectResult() {
        assertThat(Exercise.factorial(5)).isEqualTo(120);
    }
}
