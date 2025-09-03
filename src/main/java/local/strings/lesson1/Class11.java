package local.strings.lesson1;

import java.util.Stack;

/**
 * ### 第五題：有效的括號 (Valid Parentheses)
 *
 * **題目敘述：**
 * 給定一個只包含 `'('`, `')'`, `'{'`, `'}'`, `'['` 和 `']'` 的字串，判斷輸入字串是否有效。
 *
 * **有效條件：**
 * 1. 左括號必須用相同類型的右括號閉合。
 * 2. 左括號必須以正確的順序閉合。
 *
 * **範例 1：**
 * 輸入：`s = "()[]{}"` , "{[]}"
 * 輸出：`true`
 * 解釋：所有括號都正確配對且順序正確。
 *
 * **範例 2：**
 * 輸入：`s = "(]"`
 * 輸出：`false`
 * 解釋：圓括號和方括號類型不匹配。
 *
 * 這些題目難度適中，非常適合用來練習基礎語法與資料結構。您打算從哪一題開始挑戰呢？
 */
public class Class11 {
    public static void main(String[] args){

//        String s = "()[]{}";
//        String s ="{[]}";
        String s = "(]" ;
        Stack<Character> stack = new Stack<>();
        boolean ans = true;

        for (char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            } else {
                if(stack.empty()){
                    ans = false;
                    break;
                }

                char top = stack.pop();
                if(
                        ( top == '(' && c == ')' ) ||
                        ( top == '[' && c == ']' ) ||
                        ( top == '{' && c == '}' )
                ){
                    ans = true;
                } else {
                    ans = false;
                }


            }
        }

        System.out.println("Ans = "+ans);

    }
}
