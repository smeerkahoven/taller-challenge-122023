/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.taller.challenge;

/**
 *
 * @author xeio
 */
import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static int countSubstring(String value, int k) {
        int size = value.length();
        int count = 0;

        for (int i = 0; i < size - k; i++) {
            String substring = value.substring(i, i + k);
            Set<Character> distinct = new HashSet<>();
            for (char ch : substring.toCharArray()) {
                distinct.add(ch);
            }

            if (distinct.size() == k) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println("ejecutando...");
        if (args.length == 2) {
            String value = args[0];
            int k = Integer.parseInt(args[1]);
            System.out.println("value :" + value);
            System.out.println("k :" + k);
            System.out.println("result:" +Solution.countSubstring(value, k));
        }

    }
}
