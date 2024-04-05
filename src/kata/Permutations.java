package kata;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Permutations {
//    In this kata, your task is to create all permutations of a non-empty input string and remove duplicates, if present.
//
//  Create as many "shufflings" as you can!
//      Examples:
//
//      With input 'a':
//      Your function should return: ['a']
//
//      With input 'ab':
//      Your function should return ['ab', 'ba']
//
//    Note: The order of the permutations doesn't matter.


    public static List<String> singlePermutations(String s) {
        var permutationsList = new HashSet<String>();
        generatePermutations("", s, permutationsList);
        return permutationsList.stream().toList();
    }

    static void generatePermutations(String prefix, String str, Set<String> permList) {
        // If string is empty
        if (str.isEmpty()) {
            permList.add(prefix);
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            // ith character of str
            char ch = str.charAt(i);

            // the remaining string after excluding the ith character
            String rem = str.substring(0, i) + str.substring(i + 1);

            // Recursive call
            generatePermutations(prefix + ch, rem, permList);
        }
    }

    public static List<String> singlePermutations1(String s) {
        var permSet = new HashSet<String>();
        if (s.length() == 1) {
            permSet.add(s);
        } else {
            for (int i = 0; i < s.length(); i++) {
                var temp = singlePermutations1(s.substring(0, i) + s.substring(i + 1));
                for (String str : temp) {
                    permSet.add(s.charAt(i) + str);
                }
            }
        }

        return new ArrayList<>(permSet);
    }

    public static List<String> singlePermutations2(String str) {
        var permutations = new HashSet<String>();
        char[] chars = str.toCharArray();
        int n = chars.length;
        int[] ch = new int[n];

        permutations.add(str);
        int i = 0;
        while (i < n) {
            if (ch[i] < i) {
                if (i % 2 == 0) {
                    swap(chars, 0, i);
                } else {
                    swap(chars, ch[i], i);
                }
                permutations.add(new String(chars));
                ch[i]++;
                i = 0;
            } else {
                ch[i] = 0;
                i++;
            }
        }

        return permutations.stream().toList();
    }

    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
