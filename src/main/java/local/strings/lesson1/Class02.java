package local.strings.lesson1;

import java.util.HashMap;

/**
 * Longest Substring Without Repeating Characters
 * Example 1:
 *
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 *
 * Example 2:
 *
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 *
 * Example 3:
 *
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class Class02 {
    public static void main(String[] a){
        String inputStr = "pwwkew";
        int maxCharA = execute(inputStr);
        System.out.println("Ans = "+maxCharA);
    }

    private static int execute(String inputStr){
        int maxCharA = 0;
        int left = 0;

        // 計算每個字元
        HashMap<Character,Integer> charMap = new HashMap();

        for(int right = 0 ; right < inputStr.length() ; ++right){
            char c = inputStr.charAt(right);

            //左指針是否向右移動
            if(charMap.containsKey(c)){
                left = Math.max(charMap.get(c) +1 ,left);
            }
            charMap.put(c,right);


            maxCharA = Math.max(maxCharA,right - left +1) ;

            System.out.println("c = "+c);
            System.out.println("left = "+left);
            System.out.println("right = "+right);
            System.out.println("maxCharA = "+maxCharA);
            System.out.println("=================");

        }

        return maxCharA;

    }

}
