package algorithms;


import java.util.HashSet;
import java.util.Set;

/**
 * 345. Reverse Vowels of a String
 * Write a function that takes a string as input and reverse only the vowels(元音) of a string.
 * <p>
 * Example 1:
 * <p>
 * Input: "hello"
 * Output: "holle"
 * Example 2:
 * <p>
 * Input: "leetcode"
 * Output: "leotcede"
 * Note:
 * The vowels does not include the letter "y".
 */
public class Problem345 {
    public static void main(String args[]) {
        Problem345 rvs = new Problem345();
        System.out.println(rvs.reverseVowels("hello"));
        System.out.println(rvs.reverseVowels("leetcode"));

    }

    public String reverseVowels(String s) {
        Set<Character> vowelSet = new HashSet<>();
        vowelSet.add('a');
        vowelSet.add('A');
        vowelSet.add('e');
        vowelSet.add('E');
        vowelSet.add('i');
        vowelSet.add('I');
        vowelSet.add('o');
        vowelSet.add('O');
        vowelSet.add('u');
        vowelSet.add('U');
        char[] charset = s.toCharArray();
        int i = 0;
        int j = charset.length - 1;

        while (i < j) {
            while (!vowelSet.contains(charset[i]) && i < j) {
                ++i;
            }
            while (!vowelSet.contains(charset[j]) && i < j) {
                --j;
            }
            if (i < j) {
                char tmp = charset[i];
                charset[i] = charset[j];
                charset[j] = tmp;
                ++i;
                --j;
            }
        }

        return new String(charset);
    }
}
