package local.strings.lesson1;

import java.util.HashMap;

/**
 * ### 第四題：字串中的第一個唯一字元 (First Unique Character in a String)
 *
 * **類型：** 字串、雜湊表（Hash Map）
 *
 * **題目敘述：**
 * 給定一個字串 `s`，找出其中第一個不重複的字元，並返回它的索引。如果不存在，則返回 -1。
 *
 * **範例 1：**
 * 輸入：`s = "leetcode"`
 * 輸出：`0`
 * 解釋：`l` 是第一個不重複的字元，它的索引是 0。
 *
 * **範例 2：**
 * 輸入：`s = "loveleetcode"`
 * 輸出：`2`
 * 解釋：`v` 是第一個不重複的字元，它的索引是 2。
 */
public class Class10 {

    public static void main(String args[]){
        String s = "aabbcc";
        char[] cL = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        int ans = -1;
        for (char c : cL){
            map.put(c, map.getOrDefault(c ,0)+1);
        }

        if(map.containsValue(1)){
            for (int i= 0 ; i < cL.length ; i++){
                if(map.get(cL[i]) == 1){
                    ans = i;
                    break;
                }
            }
        }

        System.out.println("Ans = "+ans);


    }
}
