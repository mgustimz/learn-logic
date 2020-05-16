package com.learn.logic;

import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;

class PowerTest {

    @Test
    void givenZeroPower_whenPower_shouldReturnCorrectResult() {
        assertThat(Exercise.power(1, 0)).isEqualTo(1);
    }

    @Test
    void givenTestOne_whenPower_shouldReturnCorrectResult() {
        assertThat(Exercise.power(2, 3)).isEqualTo(8);
    }
    
    @Test
    void givenTestTwo_whenPower_shouldReturnCorrectResult() {
        assertThat(Exercise.power(3, 1)).isEqualTo(3);
    }
}
