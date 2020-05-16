package com.learn.logic;

import org.junit.jupiter.api.Test;

import static com.google.common.truth.Truth.assertThat;

class FindDuplicateTest {

    @Test
    void givenEmptyArray_whenFindDuplicate_shouldReturnCorrectResult() {
        int[] arr = new int[0];
        assertThat(Exercise.findDuplicate(arr)).isEqualTo(-1);
    }

    @Test
    void givenNonDuplicate_whenFindDuplicate_shouldReturnCorrectResult() {
        int[] arr = new int[]{1, 2, 3};
        assertThat(Exercise.findDuplicate(arr)).isEqualTo(-1);
    }

    @Test
    void givenDuplicateExistOne_whenFindDuplicate_shouldReturnCorrectResult() {
        int[] arr = new int[]{1, 1, 2, 3};
        assertThat(Exercise.findDuplicate(arr)).isEqualTo(1);
    }

    @Test
    void givenDuplicateExistTwo_whenFindDuplicate_shouldReturnCorrectResult() {
        int[] arr = new int[]{1, 1, 1, 2, 2, 3};
        assertThat(Exercise.findDuplicate(arr)).isEqualTo(2);
    }
}
