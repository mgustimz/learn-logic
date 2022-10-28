package com.learn.logic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

    static List<Integer> printPrimes(int x) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < x; i++) {
            if (checkPrime(i)) {
                result.add(i);
            }
        }
        return result;
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
        int result = Integer.MIN_VALUE;
        if (arr.length == 0) {
            return -1;
        } else {
            for (int a : arr) {
                if (a > result) {
                    result = a;
                }
            }
        }
        return result;
    }

    static int minElement(int[] arr) {
        int result = Integer.MAX_VALUE;
        if (arr.length == 0) {
            return -1;
        } else {
            for (int a : arr) {
                if (a < result) {
                    result = a;
                }
            }
        }
        return result;
    }

    static int makeTheTen(int[] arr) {
        int result = 0;
        int ten = 10;
        if (arr.length == 0) {
            return -1;
        } else {
            for (int a : arr) {
                result += a;
                if (result >= 10) {
                    return -1;
                }
            }
        }
        return ten - result;
    }

    static int power(int n, int power) {
        int result = 1;
        if (power == 0) {
            return 1;
        }
        if (n == 0) {
            return 0;
        }
        for (int i = 0; i < power; i++) {
            result *= n;
        }
        return result;
    }

    static int factorial(int n) {
        /*int result = 1;
        if (n < 1) {
            return -1;
        } else {
            for (int i = n; i > 0; i--) {
                result *= i;
            }
        }
        return result;*/

        if (n < 1) {
            return -1;
        }
        if (n < 2) {
            return n;
        } else {
            return n * factorial(n - 1);
        }

    }

    static int betterArray(int[][] arr) {
        List<Integer> list = new ArrayList<>();
        for (int[] a : arr) {
            int result = 0;
            for (int b : a) {
                result += b;
            }
            list.add(result);
        }
        int result = Integer.MIN_VALUE;
        for (int c : list) {
            if (c > result) {
                result = c;
            }
        }
        return result;
    }

    static boolean luhnSimplified(int[] arr) {
        int result = 0;
        if (arr.length == 0) {
            return false;
        }
        for (int a : arr) {
            result += a;
        }
        return (result % 10) == 0;
    }

    static boolean luhn(int[] arr) {
        int result = 0;
        int[] asd = new int[arr.length];
        if (arr.length == 0) {
            return false;
        }
        findLuhnSum(arr, asd);
        for (int a : asd) {
            result += a;
        }
        return (result % 10) == 0;
    }

    private static void findLuhnSum(int[] arr, int[] asd) {
        int n;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                n = arr[i] * 2;
                n = n > 9 ? n % 10 + 1 : n;
                asd[i] = n;
            } else {
                n = arr[i];
                asd[i] = n;
            }
        }
    }
}
