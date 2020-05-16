package com.learn.logic;

import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;

class MaxElementTest {

    @Test
    void givenEmptyArray_whenGetMax_shouldReturnCorrectResult() {
        int[] arr = new int[0];
        assertThat(Exercise.maxElement(arr)).isEqualTo(-1);
    }

    @Test
    void givenTestOne_whenGetMax_shouldReturnCorrectResult() {
        int[] arr = new int[]{1, 3, 6};
        assertThat(Exercise.maxElement(arr)).isEqualTo(6);
    }

    @Test
    void givenTestTwo_whenGetMax_shouldReturnCorrectResult() {
        int[] arr = new int[]{-2, -1, -5};
        assertThat(Exercise.maxElement(arr)).isEqualTo(-1);
    }

    @Test
    void givenTestThree_whenGetMax_shouldReturnCorrectResult() {
        int[] arr = new int[]{3, -1, 0, 0, -5};
        assertThat(Exercise.maxElement(arr)).isEqualTo(3);
    }
}
