package dsa.StringManipulation;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class StringUtils {
    public static int countVowels(String str) {
        if (str == null)
            return 0;

        var count = 0;
        var vowels = "aeiou";
        for (var ch : str.toLowerCase().toCharArray()) {
//            if (vowels.indexOf(ch) != -1)
            if (vowels.contains(Character.toString(ch))) {
                count++;
            }
        }
        return count;
    }

    public static String reverse(String str) {
        if (str == null)
            return "";

        StringBuilder reverse = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse.append(str.charAt(i));
        }
        return reverse.toString();
    }

    public static String reverseWords(String sentence) {
        if (sentence == null)
            return "";

        String[] words = sentence.trim().split(" ");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);
//        StringBuilder reversed = new StringBuilder();
//        for (int i = words.length - 1; i >= 0; i--) {
//            reversed.append(words[i] + " ");
//        }
//        return reversed.toString().trim();
    }

    public static boolean areRotations(String str1, String str2) {
        if (str1 == null && str2 == null)
            return false;
        return (str1.length() == str2.length()) &&
                (str1 + str1).contains(str2);

//        if (str1.length() != str2.length())
//            return false;
//
//        if (!(str1 + str1).contains(str2))
//           return false;
//
//        return true;
    }

    public static String removeDuplicates(String str) {
        if (str == null)
            return "";

        StringBuilder output = new StringBuilder();
        Set<Character> seen = new HashSet<>();
        for (var ch : str.toCharArray()) {
            if (!seen.contains(ch)) {
                seen.add(ch);
                output.append(ch);
            }
        }
        return output.toString();
    }

    public static char getMaxOccuringChar(String str) {
        if (str == null || str.isEmpty())
            throw new IllegalArgumentException();

        final int ASCII_SIZE = 256;
        int[] frequencies = new int[ASCII_SIZE];

        for (var ch : str.toCharArray()) {
            frequencies[ch]++;
        }

        var max = 0;
        char result = ' ';
        for (int i = 0; i < frequencies.length; i++) {
            if (frequencies[i] > max) {
                max = frequencies[i];
                result = (char) i;
            }
        }

        return result;

//        Map<Character, Integer> frequencies = new HashMap<>();
//        for (var ch : str.toCharArray()){
//            if (frequencies.containsKey(ch))
//                frequencies.replace(ch, frequencies.get(ch) + 1);
//            else
//                frequencies.put(ch, 1);
//        }
    }

    public static String capitalize(String sentence) {
        if (sentence == null || sentence.trim().isEmpty())
            return "";
        String[] words = sentence
                .trim()
                .replaceAll(" +", " ")
                .split(" ");

        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].substring(0, 1).toUpperCase() +
                    words[i].substring(1).toLowerCase();
        }

        return String.join(" ", words);
    }

    public static boolean areAnagrams(String first, String second) {
        if (first == null || second == null || first.length() != second.length())
            return false;

        char[] array1 = first.toLowerCase().toCharArray();
        Arrays.sort(array1);

        char[] array2 = second.toLowerCase().toCharArray();
        Arrays.sort(array2);

        return Arrays.equals(array1, array2);
    }

    public static boolean areAnagram2(String first, String second) {
        if (first == null || second == null || first.length() != second.length())
            return false;
        final int ENGLISH_ALPHABET = 26;
        int[] frequencies = new int[26];

        first = first.toLowerCase();
        for (int i = 0; i < first.length(); i++) {
            frequencies[first.charAt(i) - 'a']++;
        }

        second = second.toLowerCase();
        for (int i = 0; i < second.length(); i++) {
            if (frequencies[second.charAt(i) - 'a'] == 0)
                return false;

            frequencies[second.charAt(i) - 'a']--;
        }
        return true;
    }

    public static boolean isPalindrome(String word) {
//        StringBuilder input = new StringBuilder(word);
//        input.reverse();
//        return input.toString().equals(word);

        if (word == null)
            return false;

        int left = 0;
        int right = word.length() - 1;
        while (left < right) {
            if (word.charAt(left++) != word.charAt(right--))
                return false;
        }

        return true;
    }


}
