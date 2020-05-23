package com.learn.logic;

import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;

class LuhnSimplifyTest {

    @Test
    void testOne() {
        int[] arr = new int[]{1, 3, 4, 5};
        assertThat(Exercise.luhnSimplified(arr)).isFalse();
    }

    @Test
    void testTwo() {
        int[] arr = new int[]{12, 4, 5, 9};
        assertThat(Exercise.luhnSimplified(arr)).isTrue();
    }

    @Test
    void testThree() {
        int[] arr = new int[0];
        assertThat(Exercise.luhnSimplified(arr)).isFalse();
    }
}
