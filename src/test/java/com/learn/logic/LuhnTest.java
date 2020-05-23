package com.learn.logic;

import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;

class LuhnTest {

    @Test
    void testOne() {
        int[] arr = new int[]{1, 3, 4, 5};
        assertThat(Exercise.luhn(arr)).isFalse();
    }

    @Test
    void testTwo() {
        int[] arr = new int[]{5, 4, 5, 9, 3};
        assertThat(Exercise.luhn(arr)).isTrue();
    }

    @Test
    void testThree() {
        int[] arr = new int[0];
        assertThat(Exercise.luhn(arr)).isFalse();
    }
}
