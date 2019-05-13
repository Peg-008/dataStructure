package tree;

import  java.util.TreeSet;
/**
 * @author Anthony on 2019/5/7
 * Leetcode 804. Unique Morse Code Words
 * https://leetcode.com/problems/unique-morse-code-words/description/
 */
public class Solution {
    public int uniqueMorseRepresentations(String[] words) {

        String[] codes = {".-", "-...", "-.-.", "-..", ".", "..-.",
                "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.",
                "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-",
                ".--", "-..-", "-.--", "--.."};
        TreeSet<String> set = new TreeSet<>();
        for (String word : words){
            StringBuilder res = new StringBuilder();
            for (int i =0 ;i<word.length();i++){
                res.append(codes[word.charAt(i) - 'a']);
            }
            set.add(res.toString());
        }
        return set.size();
    }
}
