package com.learn.logic;

import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;

class MakeTheTenTest {

    @Test
    void givenEmptyArray_whenMakeTheTen_shouldReturnCorrectResult() {
        int[] arr = new int[0];
        assertThat(Exercise.makeTheTen(arr)).isEqualTo(-1);
    }

    @Test
    void givenMoreThanTen_whenMakeTheTen_shouldReturnCorrectResult() {
        int[] arr = new int[]{9, 2, 1};
        assertThat(Exercise.makeTheTen(arr)).isEqualTo(-1);
    }

    @Test
    void givenTestOne_whenMakeTheTen_shouldReturnCorrectResult() {
        int[] arr = new int[]{1, 3, 3};
        assertThat(Exercise.makeTheTen(arr)).isEqualTo(3);
    }

    @Test
    void givenTestTwo_whenMakeTheTen_shouldReturnCorrectResult() {
        int[] arr = new int[]{-2, -1, -5};
        assertThat(Exercise.makeTheTen(arr)).isEqualTo(18);
    }

    @Test
    void givenTestThree_whenMakeTheTen_shouldReturnCorrectResult() {
        int[] arr = new int[]{3, -1, 0, 0, -5};
        assertThat(Exercise.makeTheTen(arr)).isEqualTo(13);
    }
}
