package com.learn.logic;

import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;

class BetterArrayTest {

    @Test
    void givenTestOne_whenFindBetterArray_shouldReturnCorrectResult() {
        int[][] arr = new int[][]{{1, 2}, {3, 4}};
        assertThat(Exercise.betterArray(arr)).isEqualTo(7);
    }

    @Test
    void givenTestTwo_whenFindBetterArray_shouldReturnCorrectResult() {
        int[][] arr = new int[][]{{1, 2, 3}, {3, 4}, {-2, 10, 3}};
        assertThat(Exercise.betterArray(arr)).isEqualTo(11);
    }

    @Test
    void givenTestThree_whenFindBetterArray_shouldReturnCorrectResult() {
        int[][] arr = new int[][]{{1, 2}, {3, 4}, {-3, 4, -2}};
        assertThat(Exercise.betterArray(arr)).isEqualTo(7);
    }
}
