package com.learn.logic;

import java.util.HashMap;
import java.util.Map;

final class Exercise {

    private Exercise() {
    }

    static boolean checkPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * -> (()) -> letter > 1 = ( -> letter 1 = )
     */
    static String encode(String token) {
        Map<Character, Integer> charMap = new HashMap<>();
        for (char c : token.toCharArray()) {
            if (!charMap.containsKey(c)) {
                charMap.put(c, 1);
            } else {
                charMap.put(c, charMap.get(c) + 1);
            }
        }
        StringBuilder builder = new StringBuilder();
        for (char c : token.toCharArray()) {
            if (charMap.get(c) > 1) {
                builder.append("(");
            } else {
                builder.append(")");
            }
        }
        return builder.toString();
    }

    static int findDuplicate(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;
        if (arr.length == 0) {
            return -1;
        } else {
            for (int a : arr) {
                if (!map.containsKey(a)) {
                    map.put(a, 1);
                } else {
                    map.put(a, map.get(a) + 1);
                }
            }
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() > 1) {
                    result += 1;
                }
            }
        }
        return result;

        /*if (arr.length == 0) {
            return -1;
        }
        int count = 0;
        Map<Integer, Long> countArr = Arrays.stream(arr).boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        count += countArr.values().stream().filter(x -> x > 1).count();
        return count;*/
    }

    static int maxElement(int[] arr) {
        return 0;
    }
}
