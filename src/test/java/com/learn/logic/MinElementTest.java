package com.learn.logic;

import static com.google.common.truth.Truth.assertThat;
import org.junit.jupiter.api.Test;

class MinElementTest {

    @Test
    void givenEmptyArray_whenGetMin_shouldReturnCorrectResult() {
        int[] arr = new int[0];
        assertThat(Exercise.minElement(arr)).isEqualTo(-1);
    }

    @Test
    void givenTestOne_whenGetMin_shouldReturnCorrectResult() {
        int[] arr = new int[]{1, 3, 6};
        assertThat(Exercise.minElement(arr)).isEqualTo(1);
    }

    @Test
    void givenTestTwo_whenGetMin_shouldReturnCorrectResult() {
        int[] arr = new int[]{-1, -4, 5, 0};
        assertThat(Exercise.minElement(arr)).isEqualTo(-4);
    }

    @Test
    void givenTestThree_whenGetMin_shouldReturnCorrectResult() {
        int[] arr = new int[]{-5, -7, 2, 8, 0};
        assertThat(Exercise.minElement(arr)).isEqualTo(-7);
    }

}
