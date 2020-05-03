package com.learn.logic;

import java.util.HashMap;
import java.util.Map;

public class App {

    public static void main(String[] args) {
        System.out.println(checkPrime(2));
        System.out.println(encode("aacd"));
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
                charMap.put(c, charMap.get(c)+1);
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
}
